package com.qa;

public class Radio extends Art implements Music, Podcast {
    @Override
    public void playSong() {
        System.out.println("It's too loud!");
    }

    @Override
    public void listenToNarrator() {
        System.out.println("What's he saying?");
    }

    @Override
    public void getSales() {

    }
}
