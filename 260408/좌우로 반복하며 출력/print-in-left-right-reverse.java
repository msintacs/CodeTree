import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            if (i % 2 == 0) {
                for (int j=0; j<N; j++) {
                    System.out.print(j+1) ;
                }
            } else {
                for (int j=0; j<N; j++) {
                    System.out.print(N-j);
                }
            }
            System.out.println();
        }
    }
}