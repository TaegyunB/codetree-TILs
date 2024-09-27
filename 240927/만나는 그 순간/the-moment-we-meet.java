import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1000];
        int[] b = new int[1000];
        int Aloc = 1;
        int Acnt = 0;
        int Bloc = 1;
        int Bcnt = 0;


        for(int i=0; i<n; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            if(d == 'R'){
                for(int j=0; j<t; j++){
                    Acnt++;
                    a[Aloc] = Acnt;
                    Aloc++;
                }
            }
            else if(d == 'L'){
                for(int j=0; j<t; j++){
                    Acnt--;
                    a[Aloc] = Acnt;
                    Aloc++;
                }
            }
        }

        for(int i=0; i<m; i++){
            char d = sc.next().charAt(0);
            int t = sc.nextInt();

            if(d == 'R'){
                for(int j=0; j<t; j++){
                    Bcnt++;
                    b[Bloc] = Bcnt;
                    Bloc++;
                }
            }
            else if(d == 'L'){
                for(int j=0; j<t; j++){
                    Bcnt--;
                    b[Bloc] = Bcnt;
                    Bloc++;
                }
            }
        }

        boolean found = false;
        int minLoc = Math.min(Aloc, Bloc);

        // for(int i=1; i<minLoc; i++){
        //     System.out.printf("%d: %d %d\n", i, a[i], b[i]);
        // }

        for(int i=1; i<minLoc; i++){
            if(a[i] == b[i]){
                System.out.println(i);
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println(-1);
        }    
    }
}