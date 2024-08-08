import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String digits = sc.next();

        int num = 0;

        // 각 자리의 숫자를 처리하여 10진수로 변환
        for(int i=0; i<digits.length(); i++){
            // 문자열에서 한 문자씩 꺼내고, '0'을 빼서 숫자화
            int digit = digits.charAt(i) - '0';
            num = num * 2 + digit;
        }

        System.out.println(num);

    }
}