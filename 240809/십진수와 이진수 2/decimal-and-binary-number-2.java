import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();
        int num = 0;

        // 10진수로 변환
        for(int i=0; i<binary.length(); i++){
            int num_binary = binary.charAt(i) - '0';
            num = num * 2 + num_binary;
        }

        num *= 17;

        int[] digits = new int[20];
        int cnt = 0;

        // 2진수로 변환
        while(num > 0){
            digits[cnt++] = num % 2;
            num /= 2;
        }

        // 역순으로 출력
        for(int i=cnt-1; i>=0; i--){
            System.out.print(digits[i]);
        }
            
        




        

        
    }
}