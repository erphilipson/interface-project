package com.company;

/**
 * Created by Ethan on 7/24/17.
 */
public class ElfSoldier extends Soldier implements LongRangeCombat, CloseQuartersCombat {
    @Override
    public String sleep() {
        return "Zzzz";
    }

    @Override
    public String eat() {
        return "Munch";
    }

    @Override
    public String walk() {
        return "Saunter";
    }

    @Override
    public String speak() {
        return "They're taking the hobbits to Isengard!";
    }

    @Override
    public String shoot() {
        return "thwip";
    }

    @Override
    public String snipe() {
        return "THWAP!";
    }

    @Override
    public String punch() {
        return "thwack";
    }

    @Override
    public String kick() {
        return "KICKING NOISES";
    }

    @Override
    public String headbutt() {
        return "HEADBUTT";
    }
}
