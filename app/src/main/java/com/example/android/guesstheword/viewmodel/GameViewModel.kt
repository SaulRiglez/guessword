package com.example.android.guesstheword.viewmodel

import androidx.lifecycle.ViewModel
import timber.log.Timber
import java.util.*

class GameViewModel : ViewModel() {

    init {
        Timber.i("ViewModel Class created!!")
    }

    override fun onCleared() {
        super.onCleared()
        Timber.i("GameViewModel Distroyed!!")
    }
}