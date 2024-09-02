import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int start = 0;
        int[] arr = new int[301];
        int offset = 100;

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            char way = sc.next().charAt(0);

            if(way == 'R'){
                for(int j=start; j<start+x; j++){
                    arr[j+offset]++;
                }
                start += x;
                
            }
            else if(way == 'L'){
                for(int j=start; j>start-x; j--){
                    arr[j+offset]++;
                }
                start -= x;
            }
        }

        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 2){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}