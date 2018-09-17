package com.bytepair.jokedisplay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        // attempt to get joke from intent
        Intent intent = getIntent();
        if (intent != null) {
            // and display in text view
            displayJoke(intent.getStringExtra(JOKE_KEY));
        }
    }

    private void displayJoke(String joke) {
        TextView textView = findViewById(R.id.joke_text_view);
        if (textView != null) {
            textView.setText(joke);
        }
    }
}
