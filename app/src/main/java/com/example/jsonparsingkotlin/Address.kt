package com.example.jsonparsingkotlin

import com.google.gson.annotations.SerializedName

data class Address(@SerializedName("Country") val mCountry:String,
                   @SerializedName("City") val mCity:String) {
}