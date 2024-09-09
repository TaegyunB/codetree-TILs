import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int standard = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        int cnt = 0;
        int maxCnt = 0;
        for(int i=0; i<n; i++){
            if(list.get(i) > standard){
                cnt++;
            }
            else{
                maxCnt = Math.max(cnt, maxCnt);
                cnt = 0;
            }
        }

        maxCnt = Math.max(cnt, maxCnt);
        System.out.println(maxCnt);
    }
}