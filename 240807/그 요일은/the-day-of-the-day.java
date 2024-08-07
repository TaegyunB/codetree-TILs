import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] name_day = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String day = sc.next();

        int startDate = countDay(m1, d1);
        int targetDate = countDay(m2, d2);

        int remainDate = targetDate - startDate + 1;
        
        int targetDateIdx = -1;
        for(int i=0; i<name_day.length; i++){
            if(name_day[i].equals(day)){
                targetDateIdx = i;
            }
        }

        int count = 0;
        int startDateIdx = 1;
        for(int i=0; i<remainDate; i++){
            int currentDateIdx = (startDateIdx + i) % 7;
            if(targetDateIdx == currentDateIdx){
                count++;
            }
        }

        System.out.println(count);
    }

    public static int countDay(int m, int d){
        int[] months = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 1;

        for(int i=1; i<m; i++){
            days += months[i];
        }

        days += d;
        return days;
    }
}