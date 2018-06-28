package com.arabcoding.ali.my_recycler_view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val users = ArrayList<data>()
        users.add(data("علي جمال",32,R.drawable.avatar1))
        users.add(data("محمد أحمد",44,R.drawable.avatar2))
        users.add(data("علي جمال",32,R.drawable.avatar1))
        users.add(data("محمد أحمد",44,R.drawable.avatar2))
        users.add(data("علي جمال",32,R.drawable.avatar1))
        users.add(data("محمد أحمد",44,R.drawable.avatar2))
        users.add(data("علي جمال",32,R.drawable.avatar1))
        users.add(data("محمد أحمد",44,R.drawable.avatar2))
        users.add(data("علي جمال",32,R.drawable.avatar1))
        users.add(data("محمد أحمد",44,R.drawable.avatar2))
        users.add(data("علي جمال",32,R.drawable.avatar1))
        users.add(data("محمد أحمد",44,R.drawable.avatar2))
        my_recycler_view.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val adapter = CustomAdapter(users)
        my_recycler_view.adapter = adapter
    }
}