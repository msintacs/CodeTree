import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a % 2 == 0) {
            a = a / 2;
        }

        if (a % 2 == 1) {
            a = (a + 1) / 2;
        }

        System.out.print(a);
    }
}