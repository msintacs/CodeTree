import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        while (B >= A) {
            if (B % 2 == 0)
                System.out.print(B + " ");

            B--;
        }
    }
}