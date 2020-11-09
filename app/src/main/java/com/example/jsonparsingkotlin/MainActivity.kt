package com.example.jsonparsingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson=Gson()

        val address=Address("Maharastra","Latur")
        val family=ArrayList<FamilyMember>()
        family.add(FamilyMember(20,"Son"))
        family.add(FamilyMember(25,"sister"))
        family.add(FamilyMember(40,"Wife"))
        val employee=Employee("Shivam",20,"srt@gmail.com",address,family)

        val json=gson.toJson(employee)

        val json1= "{\"Address\":{\"City\":\"Latur\",\"Country\":\"Maharastra\"},\"Age\":20,\"Family\":[{\"Age\":20,\"Role\":\"Son\"},{\"Age\":25,\"Role\":\"sister\"},{\"Age\":40,\"Role\":\"Wife\"}],\"First_Name\":\"Shivam\",\"Mail\":\"srt@gmail.com\"}"

        val employee1=gson.fromJson(json1,Employee::class.java)

        Log.i("employee",employee1.toString())
        Log.i("json",json)


    }
}