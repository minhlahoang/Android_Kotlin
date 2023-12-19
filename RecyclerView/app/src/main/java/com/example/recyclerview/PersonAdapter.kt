package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter(private val listPerson: List<Person>): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {
    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvName = itemView.findViewById<TextView>(R.id.tvName)
        private val tvAge = itemView.findViewById<TextView>(R.id.tvAge)
        fun onBind(person: Person) {
            tvName.text = person.name
            tvAge.text = person.age.toString()
        }
    }

    //Khi lần đầu tiên item xuất hiện trên màn hình gọi hàm này
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(itemView)
    }

    override fun getItemCount(): Int = listPerson.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.onBind(listPerson[position])
    }

}