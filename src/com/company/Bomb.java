package com.company;

/**
 * Created by Ethan on 7/24/17.
 */
public class Bomb implements Bombing{

    @Override
    public Bomb bomb() {
        return new Bomb();
    }
}
