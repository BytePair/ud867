package com.bytepair.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    public static final String JOKE_KEY = "joke_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_library_main);

        Intent intent = getIntent();
        if (intent != null) {
            Log.i(TAG, "Intent is not null");
            String joke = intent.getStringExtra(JOKE_KEY);
            Log.i(TAG, "Joke is: " + joke);
            setJoke(joke);
        }
    }

    private void setJoke(String joke) {
        TextView textView = findViewById(R.id.joke_text_view);
        if (textView != null) {
            textView.setText(joke);
        }
    }
}
