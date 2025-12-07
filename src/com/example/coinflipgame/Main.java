package com.example.coinflipgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoinGame coinGame = new CoinGame(args[0], args[1]);
        int gamePlays = 0;
        String playerResponse;

        do {
            coinGame.startGame();
            gamePlays++;
            if (isNotTied(coinGame)){
                System.out.println(curentWinner(coinGame) + " is the current majority winner out of " + gamePlays + " plays.");
            } else {
                System.out.println("Game is currently tied with both players at even wins at " + gamePlays / 2);
            }
            System.out.println("Play again? (y or n)");
            Scanner scanner = new Scanner(System.in);
            playerResponse = scanner.next();
        } while (playerResponse.startsWith("y") || playerResponse.startsWith("Y"));
    }

    public static String curentWinner(CoinGame coinGame) {
        if (coinGame.players[0].getPlayerWins() < coinGame.players[1].getPlayerWins()) {
            return coinGame.players[1].getName();
        } else {
            return coinGame.players[0].getName();
        }
    }

    public static boolean isNotTied(CoinGame coinGame) {
        return !(coinGame.players[0].getPlayerWins() == coinGame.players[1].getPlayerWins());
    }

}