import java.util.Arrays;
import java.util.Scanner;

public class TakeToStones {

    //static int numberOfStones = randomNumber();
    public static int numberOfStones;

    public static int[] buildPlayfield() {
        int[] stones = new int[numberOfStones];
        Arrays.fill(stones, 1);
        return stones;
    }

    public static int randomNumber() {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 10000000 + 1;
        int stoneNumber = (int) randomNumber;

        return stoneNumber;
    }

    //Vill ha ett udda antal stenar för att vinna
    public static int[] alice(int[] stones) {
        int stonesLeft = numberOfStonesLeft(stones);

        if (stonesLeft % 2 == 0) {
            for (int i = 0; i < stones.length; i++) {
                if ((i < numberOfStones - 2) && (stones[i] == 1) && (stones[i + 1] == 1) && (stones[i + 2] == 1)) {
                    stones[i + 1] = 0;
                    stones[i + 2] = 0;
                }
            }
        } else {
            for (int i = 0; i < stones.length; i++) {
                if ((i < numberOfStones - 1) && (stones[i] == 1) && (stones[i + 1] == 1)) {
                    stones[i] = 0;
                    stones[i + 1] = 0;
                }
            }
        }
        return stones;
    }

    //Vill ha ett jämnt antal stenar för att vinna
    public static int[] bob(int[] stones) {

        int stonesLeft = numberOfStonesLeft(stones);

        if (stonesLeft % 2 == 0) {
            for (int i = 0; i < stones.length; i++) {
                if ((i < numberOfStones - 1) && (stones[i] == 1) && (stones[i + 1] == 1)) {
                    stones[i] = 0;
                    stones[i + 1] = 0;
                }
            }
        } else {
            for (int i = 0; i < stones.length; i++) {
                if ((i < numberOfStones - 2) && (stones[i] == 1) && (stones[i + 1] == 1) && (stones[i + 2] == 1)) {
                    stones[i + 1] = 0;
                    stones[i + 2] = 0;
                }
            }
        }
        return stones;
    }

    public static boolean endOfGame(int[] stones) {
        boolean end = true;

        for (int i = 0; i < stones.length; i++) {
            if ((i < numberOfStones - 1) && (stones[i] == (byte) 1) && (stones[i + 1] == (byte) 1)) {
                end = false;
            }
        }
        return end;
    }

    public static int numberOfStonesLeft(int[] stones) {
        int numberOfStones = 0;

        for (int i = 0; i < stones.length; i++) {
            if (stones[i] == 1) {
                numberOfStones = numberOfStones + 1;
            }
        }

        return numberOfStones;
    }

    public static String whoIsTheWinner(int n) {
        String name;
        if ((n % 2 == 0) || (n == 0)) {
            name = "Bob";
        } else {
            name = "Alice";
        }

        return name;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        numberOfStones = s.nextInt();
        if (numberOfStones >= 1 && numberOfStones <= 10000000) {

            int[] playfield = buildPlayfield();

            //String s = Arrays.toString(playfield);
            //System.out.println(s);

            while (endOfGame(playfield) == false) {
                playfield = alice(playfield);
                if (endOfGame(playfield) == false) {
                    playfield = bob(playfield);
                }
            }

            String winner = null;
            if (endOfGame(playfield) == true) {
                winner = whoIsTheWinner(numberOfStonesLeft(playfield));
                System.out.println(winner);
            }
        }
    }
}

/*
import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i >= 1 && i <= 10000000) {
            i = i % 2;
            if (i == 0) {
                System.out.print("Bob");
            } else {
                System.out.print("Alice");
            }
        }
    }
}
*/
