import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int offset = 500;
        int[][] arr = new int[1001][1001];

        for(int i=0; i<2; i++){
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset; 
            int y2 = sc.nextInt() + offset;

            for(int j=x1; j<x2; j++){
                for(int k=y1; k<y2; k++){
                    arr[j][k] +=  i+1;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 1 || arr[i][j] == 3){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}