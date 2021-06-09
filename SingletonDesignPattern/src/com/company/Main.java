package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}

class Singleton {

    private Singleton() {

    }

    private static class SingletonHelper {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.instance;
    }
}
