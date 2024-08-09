import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int base = sc.nextInt();
        Integer[] digits = new Integer[20];
        int cnt = 0;

        // 4진수로 변환
        if(base == 4){
            while(N > 0){
                digits[cnt++] = N % 4;
                N /= 4;
            }
        }
        // 8진수로 변환
        else if(base == 8){
            while(N > 0){
                digits[cnt++] = N % 8;
                N /= 8;
            }
        }

        // 역순으로 출력
        for(int i=cnt-1; i>=0; i--){
            System.out.print(digits[i]);
        }
    }

}