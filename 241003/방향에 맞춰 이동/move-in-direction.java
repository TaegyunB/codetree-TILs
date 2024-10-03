import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int nx = 0;
        int ny = 0;

        for(int i=0; i<n; i++){
            char dir = sc.next().charAt(0);
            int amount = sc.nextInt();

            if(dir == 'E'){
                nx += amount * dx[0];
            }
            else if(dir == 'S'){
                ny += amount * dy[1];
            }
            else if(dir == 'W'){
                nx += amount * dx[2];
            }
            else{
                ny += amount * dy[3];
            }
        }
        System.out.println(nx + " " + ny);
    }
}