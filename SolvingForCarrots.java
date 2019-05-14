import java.util.Scanner;

public class SolvingForCarrots {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contestants;
        int problems = 0;

        while (s.hasNextLine()) {
            contestants = s.nextInt();
            problems = s.nextInt();
            for (int i = 0; i <= contestants; i++) {
                String message = s.nextLine();
            }
        }
        if (problems > 0) {
            System.out.println(problems);
        }
    }
}
