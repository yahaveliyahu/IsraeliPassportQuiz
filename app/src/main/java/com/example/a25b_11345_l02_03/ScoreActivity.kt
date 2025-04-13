package com.example.a25b_11345_l02_03

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a25b_11345_l02_03.utilities.Constants
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class ScoreActivity : AppCompatActivity() {

    private lateinit var score_LBL_score: MaterialTextView
    private lateinit var score_BTN_retry: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        findViews()
        initViews()
    }

    private fun findViews() {
        score_LBL_score = findViewById(R.id.score_LBL_score)
        score_BTN_retry = findViewById(R.id.score_BTN_retry)
    }

    private fun initViews() {
        val bundle: Bundle? =
            intent.extras // // הסימן שאלה מכיוון שלא בטוח שמי ששלח ל-activity הזה צירף bundle. יכול להיות שלא צירף כלום


        val score = bundle?.getInt(Constants.BundleKeys.SCORE_KEY, 0)
        //  אם bundle לא null זה מתבצע. צריך לספק לו שתי דברים את המפתח
        //  ואם לא חזר כלום (כלומר null או שהוא לא מאותחל) אז שים את הערך 0 כדיפולט
        val message = bundle?.getString(Constants.BundleKeys.STATUS_KEY, "🤷‍♂️Unknown")

        score_LBL_score.text = buildString {
            append(message)
            append("\n")
            append(score)
        }

        score_BTN_retry.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish() // הורג את המסך הקודם, כדי שלא ישאר משהו על המערכת ויתפוס מקום
        }
    }
}