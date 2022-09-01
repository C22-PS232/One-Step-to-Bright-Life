package com.mentalhealthapps.purify

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.mentalhealthapps.purify.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvTest: RecyclerView
    private lateinit var rvArticles: RecyclerView
    private val list = ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //rvTest = findViewById(R.id.rv_Test)
        //rvArticles = findViewById(R.id.rv_Test)
        rvTest.setHasFixedSize(true)
        rvArticles.setHasFixedSize(true)

        showRecyclerList()

    }


    private fun showRecyclerList() {
        TODO("Not yet implemented")
    }
}