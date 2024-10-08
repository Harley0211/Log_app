package com.example.log_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserTypeSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_type)

        val btnStudent: Button = findViewById(R.id.btnStudent)
        val btnTeacherStaff: Button = findViewById(R.id.btnTeacherStaff)
        val btnVisitor: Button = findViewById(R.id.btnVisitor)
        val btnLogs: Button = findViewById(R.id.btnLogs)

        // Set up button click listeners to navigate
        btnStudent.setOnClickListener {
            // Handle Student Button Click
            // TODO: Navigate to student page or perform some action
        }

        btnTeacherStaff.setOnClickListener {
            // Handle Teacher/Staff Button Click
            // TODO: Navigate to teacher/staff page or perform some action
        }

        btnVisitor.setOnClickListener {
            // Handle Visitor Button Click
            // TODO: Navigate to visitor page or perform some action
        }

        btnLogs.setOnClickListener {
            // Handle Logs Button Click
            // TODO: Show Logs
        }
    }
}
