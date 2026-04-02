import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        switch (M) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
        }
    }
}