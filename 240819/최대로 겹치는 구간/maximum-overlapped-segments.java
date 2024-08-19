import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=x+1; j<=y; j++){
                arr[j] += 1;
            }
        }

        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}