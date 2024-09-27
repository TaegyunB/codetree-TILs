import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1000];  // 배열 크기 고정
        int[] b = new int[1000];  // 배열 크기 고정
        int Aloc = 0;  // 배열 인덱스를 0으로 시작
        int Acnt = 0;
        int Bloc = 0;  // 배열 인덱스를 0으로 시작
        int Bcnt = 0;

        // A의 이동
        for(int i = 0; i < n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            if(d == 'R'){
                for(int j = 0; j < t; j++){
                    Acnt++;
                    if (Aloc < 1000) {  // 배열 인덱스가 1000을 초과하지 않도록 방지
                        a[Aloc] = Acnt;
                        Aloc++;
                    }
                }
            } else if(d == 'L'){
                for(int j = 0; j < t; j++){
                    Acnt--;
                    if (Aloc < 1000) {
                        a[Aloc] = Acnt;
                        Aloc++;
                    }
                }
            }
        }

        // B의 이동
        for(int i = 0; i < m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            if(d == 'R'){
                for(int j = 0; j < t; j++){
                    Bcnt++;
                    if (Bloc < 1000) {
                        b[Bloc] = Bcnt;
                        Bloc++;
                    }
                }
            } else if(d == 'L'){
                for(int j = 0; j < t; j++){
                    Bcnt--;
                    if (Bloc < 1000) {
                        b[Bloc] = Bcnt;
                        Bloc++;
                    }
                }
            }
        }

        boolean found = false;
        int minLoc = Math.min(Aloc, Bloc);  // 두 사람의 최소 이동 위치까지만 비교

        // 값 비교
        for(int i = 0; i < minLoc; i++){  // 인덱스는 0부터 시작
            if(a[i] == b[i]){
                System.out.println(i + 1);  // 인덱스가 0부터 시작했으므로 출력은 +1
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println(-1);
        }
    }
}