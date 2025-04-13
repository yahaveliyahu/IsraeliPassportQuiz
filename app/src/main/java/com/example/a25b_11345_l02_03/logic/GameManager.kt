package com.example.a25b_11345_l02_03.logic

import com.example.a25b_11345_l02_03.model.Country
import com.example.a25b_11345_l02_03.model.DataManager
import com.example.a25b_11345_l02_03.utilities.Constants

// החזקת מדינה נוכחית
// הערכת תוצאה
// לתת private ל-constructor זה אומר שהוא תכונה פרטית אין לו set ו-get
class GameManager(private val lifeCount: Int = 3) { // אם לא הגדירו משהו אחר זה 3 (default)
    var score: Int = 0 // חייבים הזחה כי זה מדבר על מה שמעל
        private set // זה אומר שלמשתנה הזה אין setter, כלומר set מבחוץ לא אפשרי, רק מתוך המחלקה אפשר לשנות אותו

    private val allCountries: List<Country> =
        DataManager.getAllCountries() // מה הערך שהרשימה מקבלת?

    var currentIndex: Int = 0 // זה var כי זה ערך משתנה
        private set

    var wrongAnswers: Int = 0
        private set

    val currentCountry: Country // זה val כי זה ערך קבוע, זה לא הולך להשתנות
        get() = allCountries[currentIndex]

    val isGameEnded: Boolean
        get() = currentIndex == allCountries.size

    val isGameOver: Boolean
        get() = wrongAnswers == lifeCount

    fun checkAnswer(excepted: Boolean) {
        // check answer and add score
        if (excepted == currentCountry.canEnter)
            score += Constants.GameLogic.ANSWER_POINTS
        // else : add 1 to wrong answer
        else
            wrongAnswers++

        // go to next index
        currentIndex++
    }


}

