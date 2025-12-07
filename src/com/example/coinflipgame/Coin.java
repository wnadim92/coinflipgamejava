package com.example.coinflipgame;

public class Coin {

    private String coinFlipDirection;
    private final static String[] coinFlipDirectionValues = {"Heads", "Tails"};

    Coin() {
        setCoinFlip();
    }

    public void setCoinFlip() {
        int randomInt = (Math.random() < 0.5) ? 1:0;
        coinFlipDirection = coinFlipDirectionValues[randomInt];
    }

    public String getCoinFlipDirection() {
        return coinFlipDirection;
    }


}
