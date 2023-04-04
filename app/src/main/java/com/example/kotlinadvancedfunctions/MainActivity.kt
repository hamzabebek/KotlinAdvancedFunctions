package com.example.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var myInt : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (myInt != null){
            val num = myInt!! + 1
        }
        myInt?.let {
            val num = it + 1
        }
        val myNum = myInt?.let{
            it + 1
        }?:0

        //also

        val hamza = Person("Hamza",21)
        val mehmet = Person("Mehmet Ali",53)
        val aydan = Person("Aydan",48)

        val people = listOf<Person>(hamza,aydan,mehmet)

        people.filter { it.age > 23 }.also {
            for (person in it){
                println(person.name)
            }
        }
        //apply

        val intent = Intent()
        intent.putExtra("","")
        intent.putExtra("","")
        intent.`package`= ""
        intent.action = ""

        val intentWithApply = Intent().apply {
            putExtra("","")
            putExtra("","")
            `package` = ""
            action = ""
        }

        //with
        Person("monster",1).apply {
            name = "Monster"
        }.also {
            println(it.name)
        }

        val newMonster = Person("monst",1).apply {
            name = "Monster"
        }
        println(newMonster.name)

        val anotherMonster = with(Person("onster",1)) {
            name = "Monster"
        }
        println(anotherMonster)

        val withMonster = Person("onster",1)
        with(withMonster){
            name = "MOnster"
            age = 1
        }
        println("last monster : " + withMonster.name)
    }
}
data class Person(var name : String,var age :Int)