package com.example.coinflipgame;

import java.util.Locale;
import java.util.Scanner;

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
        String[] coinDirectionValues = coin.getCoinFlipDirectionValues();
        Scanner scanner = new Scanner(System.in);
        int playerResponse = 0;
        do {
            System.out.println(name + " Choose, 1 for \"Heads\" or 2 for \"Tails\"");
            playerResponse = scanner.nextInt();
        } while (!(playerResponse == 1) && !(playerResponse == 2));
        coinFlipChoice = coinDirectionValues[playerResponse-1];
        scanner.close();
        return coinFlipChoice;
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
