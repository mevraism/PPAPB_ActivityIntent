package com.example.ppapb_activityintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ppapb_activityintent.MainActivity.Companion.EXTRA_EMAIL
import com.example.ppapb_activityintent.MainActivity.Companion.EXTRA_PHONE
import com.example.ppapb_activityintent.MainActivity.Companion.EXTRA_USERNAME
import com.example.ppapb_activityintent.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the passed intent data (handling nulls with default values)
        val username = intent.getStringExtra(EXTRA_USERNAME) ?: "Unknown user"
        val email = intent.getStringExtra(EXTRA_EMAIL) ?: "No email provided"
        val phone = intent.getStringExtra(EXTRA_PHONE) ?: "No phone provided"

        // Set the retrieved values to the respective TextViews
        with(binding) {
            usernameHome.text = username
            emailHome.text = "Your email ($email) has been activated."
            phoneHome.text = "Your phone number ($phone) has been registered."
        }
    }
}
