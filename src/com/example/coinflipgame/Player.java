package com.example.coinflipgame;

public class Player {

    private String name;
    private String coinFlipChoice;
    private int winCount;

    Player(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String getRandomPlayerCoinFlipChoice() {
        Coin coin = new Coin();
        return coin.getCoinFlipDirection();
    }

    public void setOtherPlayerCoinFlipChoice(String otherPlayerCoinFlipChoice) {
        Coin coin = new Coin();
        String[] coinFlipDirectionValues = coin.getCoinFlipDirectionValues();
        coinFlipChoice = (otherPlayerCoinFlipChoice.equals(coinFlipDirectionValues[0]))? coinFlipDirectionValues[1] : coinFlipDirectionValues[0];
    }

    public void setWin(String coinFlipDirection) {
        if (coinFlipChoice.equals(coinFlipDirection)) {
            winCount++;
            System.out.println(name + " won " + winCount + " times.");
        }
    }

    public int getPlayerWins() {
        return winCount;
    }

}
