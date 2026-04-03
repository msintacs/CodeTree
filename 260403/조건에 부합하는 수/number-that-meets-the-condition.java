import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        for (int i=1; i<=A; i++) {
            
            if (i % 2 == 0 && i % 4 != 0)
                continue;

            int tmp = i / 8;
            if (tmp % 2 == 0)
                continue;

            tmp = i % 7;
            if (tmp < 4)
                continue;

            System.out.print(i + " ");
        }
    }
}