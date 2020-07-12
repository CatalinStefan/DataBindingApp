package com.devtides.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.devtides.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car = Car(R.drawable.car, "BMW", "M5", 250)
        val driver = Driver(R.drawable.person, "Bond", 35)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        binding.car = car
        binding.driver = driver
    }
}
