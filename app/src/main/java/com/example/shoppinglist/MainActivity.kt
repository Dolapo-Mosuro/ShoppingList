package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var ShoppingList:  ArrayList<app_name>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding =DataBindingUtil.setContentView (this,R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val userList: ArrayList<User>()

        users.add (User("Rice", "Shoprite"))
        users.add (User("Rice", "Shoprite"))
        users.add (User("Rice", "Shoprite"))
        users.add (User("Rice", "Shoprite"))
        users.add (User("Rice", "Shoprite"))
        users.add (User("Rice", "Shoprite"))
        users.add (User("Rice", "Shoprite"))
        users.add (User("Rice", "Shoprite"))

        Val adapter = CustomAdapter (users)

        recyclerView.adapter = adapter


    }
}
