package com.example.filmsearch.ui.main.model

interface Repository {
    fun getFilmFromServer(): Film
    fun getFilmFromLocalStorage(): List<Film>

}