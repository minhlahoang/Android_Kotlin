package com.example.klad02_country

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var spinner: Spinner
    private lateinit var textView: TextView
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)
        textView = findViewById(R.id.textView)
        val countryList = resources.getStringArray(R.array.country_list)

        adapter = ArrayAdapter(
            applicationContext,
            R.layout.selected_item,
            countryList
        )
        adapter.setDropDownViewResource(R.layout.dropdown_item)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val country = spinner.selectedItem.toString()
                textView.text = getString(R.string.select, country)
                Toast.makeText(
                    applicationContext,
                    getString(R.string.select, country),
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
}