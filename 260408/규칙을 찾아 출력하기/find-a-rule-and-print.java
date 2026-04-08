import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            if (i == 0 || i == N-1) {
                for (int j=0; j<N; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j=0; j<N; j++) {
                    if (j == N-1 || j < i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}