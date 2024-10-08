package com.example.yourapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.log_app.R
import com.example.log_app.UserTypeSelectionActivity


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Splash Screen Timing (3 seconds delay before moving to next activity)
        Handler(Looper.getMainLooper()).postDelayed({
            // Move to the next activity (User Type Selection)
            val intent = Intent(this, UserTypeSelectionActivity::class.java)
            startActivity(intent)
            finish() // Close the WelcomeActivity so it can't be returned to
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}
