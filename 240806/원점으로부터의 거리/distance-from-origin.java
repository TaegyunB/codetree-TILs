import java.util.Scanner;
import java.util.Arrays;

class Diagram implements Comparable<Diagram>{
    int x1, x2, idx;

    public Diagram(int x1, int x2, int idx){
        this.x1 = x1;
        this.x2 = x2;
        this.idx = idx;

    }

    @Override
    public int compareTo(Diagram diagram){
        // 각 점의 원점으로부터의 맨해튼 거리를 계산함 -> 두 점간의 수직 및 수평 거리의 합을 구함
        int thisDiagram = Math.abs(this.x1) + Math.abs(this.x2);
        int otherDiagram = Math.abs(diagram.x1) + Math.abs(diagram.x2);

        if(thisDiagram != otherDiagram){
            return Integer.compare(thisDiagram, otherDiagram); //두 거리 값을 비교하여 결과를 반환. 
            // thisDiagram이 작으면 음수, 크면 양수, 같으면 0을 반환
        }
        else{
            return Integer.compare(this.idx, diagram.idx);
            // this.idx가 작으면 음수, 크면 양수, 같으면 0을 반환
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Diagram[] diagram = new Diagram[n];

        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            diagram[i] = new Diagram(x1, x2, (i+1));
        }

        Arrays.sort(diagram);

        for(int i=0; i<n; i++){
            System.out.println(diagram[i].idx);
        }

    }
}