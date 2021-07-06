package com.example.contactscard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactACtivity : AppCompatActivity() {
    lateinit var rvContacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        displayCourses()
    }
    fun displayCourses(){
        var contactList= listOf<Contact>(
            Contact("Niyonkuru Marie Chantal","+250786738069","nniyonkuruchantal@gmail.com"),
            Contact("Emma Marie uwimana","+350897645872","uwimanaemmamarie@gmail.com "),
            Contact("bayizere Jeanne","+357268376290","bayizerejeanne@gmail.com"),
            Contact("Iyabikoze cadette","+673627382679","iyabikozecadette@gmail.com"),

            )
        rvContacts=findViewById(R.id.rvContacts)
        var coursesAdapter=ContactAdapter(contactList)
        rvContacts.layoutManager= LinearLayoutManager(baseContext)
        rvContacts.adapter=coursesAdapter
    }


}



