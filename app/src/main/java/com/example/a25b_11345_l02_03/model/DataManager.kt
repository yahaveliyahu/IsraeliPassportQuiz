package com.example.a25b_11345_l02_03.model

import com.example.a25b_11345_l02_03.R

class DataManager {
    companion object { // מה שמיוצר בתוכו הוא static
        private val names = arrayOf(
            "El Salvador",
            "Nepal",
            "Lebanon",
            "Iraq",
            "Eritrea",
            "Chad",
            "Kenya",
            "Djibouti",
            "Hungary",
            "Angola",
            "Malasya",
            "Brunei",
            "Bahamas",
            "Algeria",
            "Ukraine",
            "Gambia",
            "Morocco",
            "Macao",
            "Bulgaria",
            "Liberia",
            "Greece",
            "England",
            "Turkey",
            "Isle Of Man",
            "Vietnam",
            "Tuvalu",
            "Madagascar",
            "Canada",
            "South Sudan"
        )

        private val flagImages = arrayOf(
            R.drawable._015_el_salvador,
            R.drawable._016_nepal,
            R.drawable._018_lebanon,
            R.drawable._020_iraq,
            R.drawable._065_eritrea,
            R.drawable._066_chad,
            R.drawable._067_kenya,
            R.drawable._068_djibouti,
            R.drawable._115_hungary,
            R.drawable._117_angola,
            R.drawable._118_malasya,
            R.drawable._119_brunei,
            R.drawable._120_bahamas,
            R.drawable._144_algeria,
            R.drawable._145_ukraine,
            R.drawable._146_gambia,
            R.drawable._166_morocco,
            R.drawable._167_macao,
            R.drawable._168_bulgaria,
            R.drawable._169_liberia,
            R.drawable._170_greece,
            R.drawable._216_england,
            R.drawable._218_turkey,
            R.drawable._219_isle_of_man,
            R.drawable._220_vietnam,
            R.drawable._221_tuvalu,
            R.drawable._242_madagascar,
            R.drawable._243_canada,
            R.drawable._244_south_sudan,
        )

        private val canEnter = arrayOf(
            true,
            true,
            false,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            false,
            false,
            true,
            false,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true,
            true
        )

        fun getAllCountries(): List<Country> {
            val allCountries = mutableListOf<Country>() // ניתן לשינוי
            for (i in names.indices){
                allCountries.add(
                    Country( // מייצר לי אובייקט
                        name = names[i],
                        flagImage = flagImages[i],
                        canEnter = canEnter[i]
                    )
                )
            }
            allCountries.shuffle() // כי shuffle מחזיר void
            return allCountries
        }
    }
}