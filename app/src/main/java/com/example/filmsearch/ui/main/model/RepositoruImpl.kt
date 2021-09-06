package com.example.filmsearch.ui.main.model

import com.example.filmsearch.R

class RepositoryImpl : Repository {

    override fun getFilmFromServer(): Film = Film()
    override fun getFilmFromLocalStorage(): List<Film> {
        return listOf(
            Film(imageIndex = R.drawable.hedgehog),
            Film("Лосяш", "musical", 2022, R.drawable.moose),
            Film("Крош", "horror", 2020, R.drawable.krosh),
            Film("КарКарычь", "documentary", 1999, R.drawable.karkarych),
        )

    }
}