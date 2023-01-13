package com.example.valparaisoapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ESTUDIOS DE AMENAZA A NIVEL DE DETALLE EN EL SECTOR SABALETAS DEL MUNICIPIO DE VALPARAÍSO (ANTIOQUIA) PARA ESTABLECER LAS ÁREAS CON CONDICIÓN DE AMENAZA Y CONDICIÓN DE RIESGO");
    }

    public LiveData<String> getText() {
        return mText;
    }
}