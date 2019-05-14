import java.util.Scanner;

public class Spavanac {
    public static String min;
    public static String hou;
    public static String clock;

    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        //String t = s.nextLine();
        //String t = args[0];

        Scanner s = new Scanner("00 40");
        String t = s.nextLine();

        String[] lines = t.split(" ");
        String hours = lines[0];
        String minutes = lines[1];

        int h = Integer.parseInt(hours);
        int m = Integer.parseInt(minutes);

        if ((h <= 23) && (m <= 59)){
            if (m > 45){
                m = m - 45;
                clock = makePrint(h, m);
            }
            else if (m < 45){
                m = m + 60 - 45;
                if (h == 0){
                    h = 23;
                }
                else{
                    h = h-1;
                }
                clock = makePrint(h, m);
            }
            else if (m == 45){
                min = "00";
                if (h < 10){
                    hou = String.valueOf(h);
                    //hou = ("0"+h);
                }
                else {
                    hou = String.valueOf(h);
                }
                clock = (hou+" "+min);
            }
            else if ((h==23) && (m == 59)){
                min = "00";
                hou = "00";
                clock = (hou+" "+min);
            }
            else{
                hou = "23";
                min = "15";
                clock = (hou+" "+min);
            }
        }
        System.out.println(clock);
    }

    public static String makePrint(int h, int m){
        String clock;
        if(m<10){
            min = String.valueOf(m);
            //min = ("0"+m);
        }
        else {
            min = String.valueOf(m);
        }
        if (h < 10){
            hou = String.valueOf(h);
            //hou = ("0"+h);
        }
        else {
            hou = String.valueOf(h);
        }
        clock = (hou+" "+min);
        return clock;
    }
}

/*import java.util.Scanner;

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
*/
