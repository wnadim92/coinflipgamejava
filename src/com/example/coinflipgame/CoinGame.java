package com.example.coinflipgame;

public class CoinGame {
    public Player[] players = new Player[2];
    public Coin coin = new Coin();

    CoinGame(String playerOneName, String playerTwoName) {
        players[0] = new Player(playerOneName);
        players[1] = new Player(playerTwoName);
    }

    public void startGame() {
        int randomIndex = (Math.random() < 0.5) ? 1 : 0;
        String coinFlipChoice = players[randomIndex].getRandomPlayerCoinFlipChoice();
        int otherPlayersIndex = (randomIndex == 0) ? 1 : 0;
        players[otherPlayersIndex].setOtherPlayerCoinFlipChoice(coinFlipChoice);
        coin.setCoinFlip();
        String coinFlipDirection = coin.getCoinFlipDirection();
        players[randomIndex].setWin(coinFlipDirection);
        players[otherPlayersIndex].setWin(coinFlipDirection);
    }

}
