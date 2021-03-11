package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        Logger l1 =  new Logger("name");
        l1.setLevel(Level.INFO);
        l1.info("info");
        l1.debug("debug");
        l1.warning("warning");
        l1.error("%s + %s = [[[","qw", "er");
    }
}
