package com.bytepair.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bytepair.jokes.JokeTeller;

import static com.bytepair.jokelibrary.MainActivity.JOKE_KEY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.joke_button);
        if (button != null) {
            JokeTeller jokeTeller = new JokeTeller();
            final String joke = jokeTeller.getJoke();
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    launchJokeActivity(joke);
                }
            });
        }
    }

    private void launchJokeActivity(String joke) {
        Intent intent = new Intent(this, com.bytepair.jokelibrary.MainActivity.class);
        intent.putExtra(JOKE_KEY, joke);
        startActivity(intent);
    }
}
