package com.example.contactscard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var contactList:List<Contact>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tlName.text=currentContact.name
        holder.tlPhone.text=currentContact.PhoneNumber
        holder.tlEmail.text=currentContact.email

    }
    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tlName=itemView.findViewById<TextView>(R.id.tilName)
    var tlPhone=itemView.findViewById<TextView>(R.id.tlPhone)
    var tlEmail=itemView.findViewById<TextView>(R.id.tilEmail)


}

