package com.bytepair.joketest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bytepair.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView jokeView = findViewById(R.id.joke_smith_text_box);
        if (jokeView != null) {
           jokeView.setText(JokeWizard.getJoke());
        }
    }
}
