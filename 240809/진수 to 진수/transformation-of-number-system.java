import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int current_base = sc.nextInt();
        int target_base = sc.nextInt();
        String num = sc.next();
        int n = 0;

        // 해당 진수의 값을 10진수 변환
        for(int i=0; i<num.length(); i++){
            int num_int = num.charAt(i) - '0';
            n = n * current_base + num_int;
        }

        int[] digits = new int[20];
        int cnt = 0;

        // target_base 진수로 변환
        while(n > 0){
            digits[cnt++] = n % target_base;
            n /= target_base;
        }

        for(int i=cnt-1; i>=0; i--){
            System.out.print(digits[i]);
        }
    }
}