package com.company;

/**
 * Created by Ethan on 7/24/17.
 */
public interface CloseQuartersCombat {
    String punch();
    String kick();
    default String headbutt() {
        return "BAM!";
    }
}
