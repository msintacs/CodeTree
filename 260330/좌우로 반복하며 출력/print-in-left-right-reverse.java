import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            if (i % 2 != 0) {
                for (int j=1; j<=N; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j=N; j>=1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}