import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            for (int j=0; j<N-i; j++) {
                System.out.print((i+1) + " * " + (j+1) + " = " + ((i+1) * (j+1)));
                if (j != N-i-1) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}