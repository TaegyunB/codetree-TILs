import java.util.Scanner;
import java.util.Arrays;

class People implements Comparable<People>{
    String name;
    int height;
    int weight;

    public People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(People people){
        if(this.height == people.height){
            return people.weight - this.weight; // 내림차순
        }
        return this.height - people.height; // 오름차순
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        People[] person = new People[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            person[i] = new People(name, height, weight);
        }

        Arrays.sort(person);

        for(int i=0; i<n; i++){
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
        }
    }
}