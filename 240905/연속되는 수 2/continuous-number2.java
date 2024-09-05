import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(); // ArrayList로 선언
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        int cnt = 0;
        int maxCnt = 0;

        for(int i=0; i<n; i++){
            if(i == 0 || list.get(i) == list.get(i-1)){
                cnt++;
            }
            else{
                // Math.max(a, b) = 두 값 a와 b 중 더 큰 값을 반환
                maxCnt = Math.max(cnt, maxCnt);
                cnt = 1;
            }
        }

        maxCnt = Math.max(cnt, maxCnt);

        System.out.println(maxCnt);
    }
}