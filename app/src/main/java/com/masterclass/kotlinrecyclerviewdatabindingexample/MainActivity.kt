package com.masterclass.kotlinrecyclerviewdatabindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.masterclass.kotlinrecyclerviewdatabindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var dummyNames = listOf("ibrahim", "Megan", "Bayar", "Batuhan", "Simge")
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainRecyclerView.apply {
            this.adapter = MainRecyclerViewAdapter(dummyNames){userName:String ->
                onRecyclerViewItemClicked(userName)
            }
            this.layoutManager = LinearLayoutManager(baseContext)
        }

    }

    private fun onRecyclerViewItemClicked(name:String)
    {
        Toast.makeText(this,name+" clicked",Toast.LENGTH_SHORT).show()
    }

}