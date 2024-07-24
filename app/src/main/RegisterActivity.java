package com.example.budgetplanner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    // Method to handle "Get started" button click
    public void startPlanning(View view) {
        // Navigate to the next activity
        Intent intent = new Intent(RegisterActivity.this, PlannerActivity.class);
        startActivity(intent);
    }

    // Method to handle "Sign In" text click
    public void signIn(View view) {
        // Navigate to the sign-in activity
        Intent intent = new Intent(RegisterActivity.this, SignInActivity.class);
        startActivity(intent);
    }
}

