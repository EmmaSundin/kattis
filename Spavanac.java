import java.util.Scanner;

public class Spavanac {
    public static String min;
    public static String hou;
    public static String clock;
    public static int h;
    public static int m;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        
        String[] lines = t.split(" ");
        String hours = lines[0];
        String minutes = lines[1];

        h = Integer.parseInt(hours);
        m = Integer.parseInt(minutes);

        if ((h <= 23) && (h>=0) && (m <= 59) && (m>=0)){
            if (m > 45){
                m = m - 45;
                clock = makePrint(h, m);
            }
            else if (m < 45){
                m = m + 15;
                
                if (h == 0){
                    h = 23;
                }
                else{
                    h = h-1;
                }
                clock = makePrint(h, m);
            }
            else if (m == 45){
                min = "0";
                hou = String.valueOf(h);
                clock = (hou+" "+min);
            }
        }
        System.out.println(clock);
    }

    public static String makePrint(int h, int m){
        String clock;
        min = String.valueOf(m);
        hou = String.valueOf(h);
        clock = (hou+" "+min);
        return clock;
    }
}
