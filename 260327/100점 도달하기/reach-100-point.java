import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        for (int i=score; i<=100; i++) {
            if (i >= 90)
                System.out.print("A ");
            else if (i >= 80)
                System.out.print("B ");
            else if (i >= 70)
                System.out.print("C ");
            else if (i >= 60)
                System.out.print("D ");
            else
                System.out.print("F ");
        }
    }
}