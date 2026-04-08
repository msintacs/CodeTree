import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int i=0; i<4; i++) {
            for (int j=B; j>=A; j--) {
                System.out.print(j + " * " + (i+1)*2 + " = " + (j * (i+1)*2));
                if (j != A) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}