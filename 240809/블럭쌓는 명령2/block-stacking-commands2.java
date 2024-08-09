import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] column = new int[n];

        for(int i=0; i<k; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j=start; j<=end; j++){
                column[j] += 1;
            }
        }  
            
        int max = 0;
        for(int i=0; i<column.length; i++){
            if(column[i] > max){
                max = column[i];
            }
        }
        System.out.println(max);

    }
}