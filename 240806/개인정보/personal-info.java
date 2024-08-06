import java.util.Scanner;
import java.util.Arrays;

class People {
    String name;
    int height;
    double weight;

    public People(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }   
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        People[] person = new People[5];

        for(int i=0; i<5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            person[i] = new People(name, height, weight);
        }

        Arrays.sort(person, (a, b) -> a.name.compareTo(b.name)); // String은 compareTo 사용

        System.out.println("name");
        for(int i=0; i<5; i++){
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
        }

        Arrays.sort(person, (a, b) -> b.height - a.height); // 내림차순

        System.out.println();
        System.out.println("height");
        for(int i=0; i<5; i++){
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
        }

        
    }
}