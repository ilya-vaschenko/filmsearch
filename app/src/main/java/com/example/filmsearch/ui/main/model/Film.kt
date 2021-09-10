package com.example.filmsearch.ui.main.model

import android.os.Parcelable
import com.example.filmsearch.R
import kotlinx.android.parcel.Parcelize

const val defaultName: String = "Ёжик"
const val defaultGenre: String = "horror"
const val defaultDate: Int = 2022
const val defaultDescription: String = "Описание отсутствует"

@Parcelize
data class Film(
    var name: String = defaultName,
    var genre: String = defaultGenre,
    var date: Int = defaultDate,
    var imageIndex: Int = 0,
    var description: String = defaultDescription
) : Parcelable

fun getRussianFilm(): List<Film> = listOf(
    Film(imageIndex = R.drawable.hedgehog, description = "В детстве ежа не кто не любил! " +
            "что довело юношу в иголках к маниакальной шизофрении, что было дальше... "),
    Film("Лосяш", "musical", 2022, R.drawable.moose, "Лось соврименник под звуки ржавой пилы и завывания метели!" +
            "не пропустите толь у нас , только сейчас ! в клубе -Сытых Разведенок-"),
    Film("Крош", "drama", 2020, R.drawable.krosh, "Ещё ребенком крошку Кроша похитила, злая но не воле собственной" +
            "страшно красивая , до глупости умная Сара Джесика Паркер! возвращение Кроша к былой любви смотрите на экранах кинотелевизарах вашей квартиры."),
    Film("КарКарыч", "documentary", 1989, R.drawable.karkarych, "Жизнь ворон среди воров!"),
)

fun getForeignFilm(): List<Film> = listOf(
    Film("Нюша", "melodrama", 2004, R.drawable.nyusha, "Лютая свинья доведёт до слёз ..."),
    Film("Бараш", "thriller", 2005, R.drawable.barash, "когда лютая тебя свинья не любит , выходишь на кривую дорожку"),
    Film("Савунья", "mysticism", 2006, R.drawable.owl, "Ночь , горят глаза и мрачный крик во тьмеееее! Премьера среди старого! "),
    Film("Капатыч", "comedy", 2007, R.drawable.kopatych, "Как медведь на какал в улий "),
)