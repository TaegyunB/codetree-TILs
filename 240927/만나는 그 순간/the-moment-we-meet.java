import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1001];
        int[] b = new int[1001];
        int loc = 0;
        int cnt = 0;


        for(int i=0; i<n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            if(d == 'R'){
                for(int j=0; j<t; j++){
                    cnt++;
                    a[loc] = cnt;
                    loc++;
                }
            }
            else if(d == 'L'){
                for(int j=0; j<t; j++){
                    cnt--;
                    a[loc] = cnt;
                    loc++;
                }
            }
        }

        loc = 0;
        cnt = 0;

        for(int i=0; i<m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            if(d == 'R'){
                for(int j=0; j<t; j++){
                    cnt++;
                    b[loc] = cnt;
                    loc++;
                }
            }
            else if(d == 'L'){
                for(int j=0; j<t; j++){
                    cnt--;
                    b[loc] = cnt;
                    loc++;
                }
            }
        }

        boolean found = false;
        for(int i=0; i<=cnt; i++){
            //System.out.printf("%d: %d %d\n", i, a[i], b[i]);
            if(a[i] == b[i]){
                System.out.println(i+1);
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println(-1);
        }    
    }
}
// 0에서 시작하는 걸 고려하지 말아야함