import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int up = 1;
        int down = N;
        for (int i=0; i<N; i++) {
            if (i % 2 == 0) {
                for (int j=0; j<up; j++) {
                    System.out.print("* ");
                }

                up++;
            } else {
                for (int j=0; j<down; j++) {
                    System.out.print("* ");                    
                }

                down--;
            }

            System.out.println();
        }

        for (int i=0; i<N; i++) {
            if (i % 2 == 0) {
                for (int j=0; j<down; j++) {
                    System.out.print("* ");
                }

                down--;
            } else {
                for (int j=0; j<up; j++) {
                    System.out.print("* ");                    
                }

                up++;
            }

            System.out.println();
        }
    }
}