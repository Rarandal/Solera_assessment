package Katas.BingoKata;

import java.util.ArrayList;

public class Bingo {
    public static void main(String[] args) {

        int[][] card = createCard();
        cardCaller(card);

        bingoCaller();


    }

    public static int[] bingoCaller() {
        int[] r = new int[75];
        int pos = 0;
        for (int i = 0; i < 75; i++) {
            boolean val = false;
            while (!val) {
                int random = 1 + ((int) (Math.random() * 75));

                for (int k = 0; k < pos; k++) {
                    if (random == r[i]) {
                        val = false;
                    } else {
                        r[i] = random;
                        val = true;
                    }
                }

                pos++;
            }


        }
        for (int i = 0; i < 75; i++) {

            System.out.println(r[i]);
        }
        return r;
    }

    public static int[][] createCard() {
        int[] numbers = new int[26];
        int pos = 0;
        int[][] card = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                boolean val = false;
                while (!val) {
                    int random = 1 + ((int) (Math.random() * 75));
                    if (pos == 26) {
                        break;
                    }
                    if (i == 2 && j == 2) {
                        card[i][j] = 0;
                        numbers[pos] = 0;
                        val = true;
                    } else {
                        for (int k = 0; k < pos; k++) {
                            if (random == numbers[k]) {
                                val = false;
                            }
                            val = true;
                        }
                        card[i][j] = random;
                        numbers[pos] = random;
                    }
                    pos++;
                }
            }
        }
        return card;
    }

    public static void cardCaller(int[][] card) {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(card[i][j] + "|");
            }
        }
    }
}
