import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N*2; i++) {
            if (i % 2 == 0) {
                for (int j=0; j<N-i/2; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j=0; j<i/2+1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}