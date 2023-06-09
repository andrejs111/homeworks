package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;

public class MakeSounds {
    public static <List> void main(String[] arg) {
        Sound firework = new Firework();
        Sound parrot = new Parrot();
        Sound radio = new Radio();
        Sound parrot1 = new Parrot();

        ArrayList<Sound> soundList = new ArrayList<>();
        soundList.add(firework);
        soundList.add(parrot1);
        soundList.add(parrot);
        soundList.add(radio);

        for (Sound sound : soundList) {
            sound.playSound();
        }
    }
}
