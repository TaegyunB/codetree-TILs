import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int startDay = 11;
        int startHour = 11;
        int startMin = 11;

        int targetDay = sc.nextInt();
        int targetHour = sc.nextInt();
        int targetMin = sc.nextInt();
        
        // 기준 시간을 분 단위로 변환
        int startMinutes = (startDay * 24 * 60) + (startHour * 60) + startMin;

        // 목표 시간을 분 단위로 변환
        int targetMinutes = (targetDay * 24 * 60) + (targetHour * 60) + targetMin;

        int elapsedMin = targetMinutes - startMinutes;
        
        if(elapsedMin < 0){
            System.out.println(-1);
        }
        else{
            System.out.println(elapsedMin);
        }
    }
}