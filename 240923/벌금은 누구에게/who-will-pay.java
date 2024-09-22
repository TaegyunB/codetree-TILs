import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penaltyCounts = new int[n+1];
        int count = 1;
        boolean penaltyMoney = false;

        for(int i=0; i<m; i++){
            int student = sc.nextInt();
            penaltyCounts[student] += count;

            if(penaltyCounts[student] == k){
                System.out.println(student);
                penaltyMoney = true;
                break;
            }
        }

        if(penaltyMoney == false){
            System.out.println(-1);
        }
    }
}