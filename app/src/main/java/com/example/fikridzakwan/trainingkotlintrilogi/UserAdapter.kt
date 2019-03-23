package com.example.fikridzakwan.trainingkotlintrilogi

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class UserAdapter (
    val firstName : ArrayList<String>,
    val lastName : ArrayList<String>,
    val avatars : ArrayList<String>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return firstName.size
    }

    override fun onBindViewHolder(p0: UserViewHolder, p1: Int) {
        val firstName = firstName.get(p1)
        val lastName = lastName.get(p1)
        val avatars = avatars.get(p1)

        p0.tvName.text = firstName + " " + lastName
        Picasso.get().load(avatars).into(p0.img_user)
    }

    class UserViewHolder (val view : View) : RecyclerView.ViewHolder(view){
        val img_user = view.findViewById<ImageView>(R.id.img_user)
        val tvName = view.findViewById<TextView>(R.id.txt_nama_user)

    }
}

