package com.bytepair.jokewizard;

import com.bytepair.jokesmith.JokeSmith;

public class JokeWizard {

    public static String getJoke() {
        return new JokeSmith().getJoke();
    }
}
