import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[201][201];
        int offset = 100;
        
        for(int i=0; i<n; i++){
            int x = sc.nextInt() + offset;
            int y = sc.nextInt() + offset;

            for(int j=x; j<x+8; j++){
                for(int k=y; k<y+8; k++){
                    arr[j][k] = i+1;
                }
            }
        }
        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] >= 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}