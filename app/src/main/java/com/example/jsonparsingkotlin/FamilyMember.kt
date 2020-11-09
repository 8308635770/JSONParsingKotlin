package com.example.jsonparsingkotlin

import com.google.gson.annotations.SerializedName

data class FamilyMember(@SerializedName("Age") val age:Int,
                        @SerializedName("Role") val role:String) {
}