import java.util.Scanner;
import java.util.Arrays;

class People {

    String name;
    int height;
    int weight;

    public People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        People[] data = new People[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            data[i] = new People(name, height, weight);
        }

        Arrays.sort(data, (a, b) -> a.height - b.height);

        for(int i=0; i<n; i++){
            System.out.println(data[i].name + " " + data[i].height + " " + data[i].weight);
        }


    }
}