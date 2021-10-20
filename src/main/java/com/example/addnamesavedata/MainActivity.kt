package com.example.addnamesavedata

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.ListFragment

import com.example.addnamesavedata.ui.main.MainFragment
import com.example.addnamesavedata.ui.main.mainViewModle



class MainActivity : FragmentActivity(),  MainFragment.nameListener {
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onButtonClick(list: String) {
        val mainViewModle = supportFragmentManager.findFragmentById(R.id.mainVeiwFragment) as mainViewModle
        var listHolding = list
        mainViewModle.addNameToList(listHolding+"\n")


    }
}