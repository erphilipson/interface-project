package com.company;

/**
 * Created by Ethan on 7/24/17.
 */
public class OrcSoldier extends Soldier implements CloseQuartersCombat, LongRangeCombat {
    @Override
    public String sleep() {
        return "snore";
    }

    @Override
    public String eat() {
        return "chew";
    }

    @Override
    public String walk() {
        return "trudge";
    }

    @Override
    public String speak() {
        return "What you want?";
    }

    @Override
    public String shoot() {
        return "POW!";
    }

    @Override
    public String snipe() {
        return "KABOOM!";
    }

    @Override
    public String punch() {
        return "THWACK!";
    }

    @Override
    public String kick() {
        return "KICK NOISES!";
    }

    public Bomb bomb() {
        return new Bomb();
    }
}
