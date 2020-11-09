package com.example.jsonparsingkotlin

import com.google.gson.annotations.SerializedName

data class Employee(@SerializedName("First_Name") val firstName:String,
                    @SerializedName("Age") val age:Int,
                    @SerializedName("Mail")val mail:String ,
                    @SerializedName("Address") val address:Address,
                    @SerializedName("Family") val family:ArrayList<FamilyMember>) {


}