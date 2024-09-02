import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[201][201];

        for(int i=0; i<3; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if(i == 2){
                for(int j=x1; j<x2; j++){
                    for(int k=y1; k<y2; k++){
                        arr[j][k] = 3;
                    }
                }
            }
            else{
                for(int j=x1; j<x2; j++){
                    for(int k=y1; k<y2; k++){
                        arr[j][k] += 1;
                    }
                }
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}