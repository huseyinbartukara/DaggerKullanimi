package com.example.daggerkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var adres:Adres)  {


    fun basvuruYap(){
        Log.e("Sonuc:", "Internet Başvurusu  ${adres.adresBilgisi} adres için yapıldı")
    }
}