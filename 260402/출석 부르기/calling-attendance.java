import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        String target = null;
        switch (a) {
            case 1:
                target = "John";
                break;
            case 2:
                target = "Tom";
                break;
            case 3:
                target = "Paul";
                break;
            default:
                target = "Vacancy";
                break;
        }

        System.out.println(target);

    }
}