import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int month = 11;
        int day = 11;
        int hour = 11;
        int min = 11;

        int d_day = sc.nextInt();
        int d_hour = sc.nextInt();
        int d_min = sc.nextInt();
        int elapsedMin = 0;

        while(true){
            if(day == d_day && hour == d_hour && min == d_min){
                break;
            }

            min++;
            elapsedMin++;

            if(min == 60){
                hour++;
                min = 0;
            }

            if(hour == 24){
                day++;
                hour = 0;
            }
        }

        System.out.println(elapsedMin);

    }
}