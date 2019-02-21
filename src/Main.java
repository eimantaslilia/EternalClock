import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.println("Enter hours:");
        int h = reader.nextInt();
        System.out.println("Enter minutes: ");
        int m = reader.nextInt();
        System.out.println("Enter seconds: ");
        int s = reader.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);


        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds );
            Thread.sleep(1000);
            if (seconds.getValue() == 59) {
                if (minutes.getValue() == 59) {
                    hours.next();
                    minutes.next();
                } else {
                    minutes.next();
                }
            } seconds.next();
            }
        }
    }
