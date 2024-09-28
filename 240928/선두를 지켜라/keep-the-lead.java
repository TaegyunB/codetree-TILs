import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] n_dis = new int[1000];
        int[] m_dis = new int[1000];

        int loc = 0;
        int accumulate = 0;

        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j=1; j<=t; j++){
                accumulate += v;
                n_dis[loc] = accumulate;
                loc++;
            }
        }

        loc = 0;
        accumulate = 0;

        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j=1; j<=t; j++){
                accumulate += v;
                m_dis[loc] = accumulate;
                loc++;
            }
        }

        int changes = 0;
        int lead = 0; // 1: A가 앞섬, -1: B가 앞섬

        for(int i=0; i<loc; i++){
            if(n_dis[i] > m_dis[i]){ // A가 앞설 경우
                if(lead != 1){
                    changes++;
                    lead = 1;
                }
            }
            else if(n_dis[i] < m_dis[i]){ // B가 앞설 경우
                if(lead != -1){
                    changes++;
                    lead = -1;
                }
            }
        }
        System.out.println(changes - 1);

    }
}