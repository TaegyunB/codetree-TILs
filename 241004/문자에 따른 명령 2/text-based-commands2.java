import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String order = sc.next();

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};
        int dirNum = 3; // 북쪽에서 시작
        int nx = 0;
        int ny = 0;

        for(int i=0; i<order.length(); i++){
            char dir = order.charAt(i);

            if(dir == 'L'){
                dirNum = (dirNum - 1 + 4) % 4;
            }
            else if(dir == 'R'){
                dirNum = (dirNum + 1) % 4;
            }
            else{
                nx += dx[dirNum];
                ny += dy[dirNum];
            }
        }
        System.out.println(nx + " " + ny);


    }
}