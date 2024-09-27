import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        a.add(0); // Starting position
        b.add(0); // Starting position
        
        int Acnt = 0;
        int Bcnt = 0;

        for(int i=0; i<n; i++){
            String d = sc.next();
            int t = sc.nextInt();

            int direction = d.equals("R") ? 1 : -1;
            for(int j=0; j<t; j++){
                Acnt += direction;
                a.add(Acnt);
            }
        }

        for(int i=0; i<m; i++){
            String d = sc.next();
            int t = sc.nextInt();

            int direction = d.equals("R") ? 1 : -1;
            for(int j=0; j<t; j++){
                Bcnt += direction;
                b.add(Bcnt);
            }
        }

        int minSize = Math.min(a.size(), b.size());
        boolean found = false;

        for(int i=1; i<minSize; i++){
            if(a.get(i).equals(b.get(i))){
                System.out.println(i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println(-1);
        }    
    }
}