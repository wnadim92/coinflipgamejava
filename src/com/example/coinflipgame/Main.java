package com.example.coinflipgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoinGame coinGame = new CoinGame(args[1], args[2]);
        int gamePlays = 0;
        String playerResponse;

        do {
            coinGame.startGame();
            gamePlays++;
            System.out.println(curentWinner(coinGame) + " is the current majority winner out of " + gamePlays + "plays.");
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

}