package com.example.filmsearch.ui.main.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.filmsearch.ui.main.model.Repository
import com.example.filmsearch.ui.main.model.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()) :
    ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getFilmFromLocalSourceRus() = getDataFromLocalSource(isRussian=true)
    fun getFilmFromLocalSourceFilm() = getDataFromLocalSource(isRussian = false)
    fun getFilmFromRemoteSource() = getDataFromLocalSource(isRussian = true)

    private fun getDataFromLocalSource(isRussian: Boolean = true) {
        liveDataToObserve.value = AppState.Loading

        Thread {
            sleep(2000)

            liveDataToObserve.postValue(
                AppState.Success(
                    if (isRussian) {
                        repositoryImpl.getFilmFromLocalStorageRus()
                    } else {
                        repositoryImpl.getFilmFromLocalStorageFilm()
                    }
                )
            )

        }.start()
    }
}

