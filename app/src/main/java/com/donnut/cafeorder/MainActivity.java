package com.donnut.cafeorder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        buttonSignIn.setOnClickListener(view -> {
            String userName = editTextName.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();

            if (userName.isEmpty() || password.isEmpty()) {
                Toast.makeText(MainActivity.this, R.string.empty_fields, Toast.LENGTH_SHORT).show();
            } else {
                launchNextScreen(userName);
            }
        });
    }

    private void launchNextScreen(String userName) {
        Intent intent = MakeOrderActivity.newIntent(this, userName);
        startActivity(intent);
    }

    private void initViews() {
        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSignIn = findViewById(R.id.buttonSignIn);
    }
}