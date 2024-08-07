import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String[] days = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int startDay = countDays(m1, d1);
        int endDay = countDays(m2, d2);

        int diff = endDay - startDay + 1; // 양쪽 끝의 날짜를 포함하기 위해서 +1
        // -> ex) 두 날짜가 3월 1일과 3월 3일이라면, 1일부터 3일까지 총 3일이 포함되어야 함

        int index = (diff % 7 + 7) % 7; // 연산 결과를 항상 양수로 반환

        System.out.println(days[index]);
    }

        
    public static int countDays(int m, int d){
        int[] num_of_month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 1; // 누적 일수 저장

        for(int i=1; i<m; i++){ // 이전 달의 일수를 모두 더함
            days += num_of_month[i];
        }

        days += d; // 해당 달의 일수를 더함
        return days;
    }
}