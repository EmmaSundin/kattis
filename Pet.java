import java.util.Scanner;

public class Pet {

    public static void main(String[] args) {
        int contestant = 0;
        int winner = 0;
        int highest = 0;

        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()){
            int current = 0;

            for (int i = 1; i <= 4; i++){
                if(i==1){
                    contestant = contestant +1;
                }
                current = current + s.nextInt();
            }
            if (current > highest){
                winner = contestant;
                highest = current;
            }
        }
        System.out.println(winner+ " "+highest);
    }
}

