package com.codelab.daniwebhiltviewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val TAG = "FRAGMENT_VIEW_MODEL"

@HiltViewModel
class FragmentViewModel @Inject constructor(private val application: Application) : ViewModel() {

    override fun onCleared() {
        super.onCleared()

        Log.d(TAG, "ViewModel ${hashCode()} is queued to be destroyed.")
    }

}
