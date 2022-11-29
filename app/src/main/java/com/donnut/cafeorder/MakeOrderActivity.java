package com.donnut.cafeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MakeOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_order);

        TextView textViewGreetings = findViewById(R.id.textViewGreetings);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
    }

    public static Intent newIntent(Context context, String userName) {
        Intent intent = new Intent(context, MakeOrderActivity.class);
        intent.putExtra("userName", userName);
        return intent;
    }
}