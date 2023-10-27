package com.example.viewmodel_app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var jenisKl: String by mutableStateOf("") //revised
        private set
    var status: String by mutableStateOf("")
        private set
    var alamatUsr: String by mutableStateOf("")
        private  set
    var emailusr: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(jk: String, stts: String, almt: String, email: String){
        jenisKl = jk;
        status = stts;
        alamatUsr = almt;
        emailusr = email;
    }

    fun setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }


}