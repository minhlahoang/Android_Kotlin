package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rcvView:RecyclerView = findViewById(R.id.rcvPerson)
        val listPerson = listOf(
            Person(name = "hoang", age = 30),
            Person(name = "hoang 1", age = 30),
            Person(name = "hoang 2", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
            Person(name = "hoang 3", age = 30),
        )
        val personAdapter = PersonAdapter(listPerson)
        rcvView.adapter = personAdapter
    }
}