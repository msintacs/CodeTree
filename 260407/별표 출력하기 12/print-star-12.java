import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            if (i == 0) {
                for (int j=0; j<N; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j=0; j<N; j++) {
                    if (j % 2 == 0) {
                        System.out.print("  ");
                    } else {
                        if (j >= i/2*2+1)
                            System.out.print("* ");
                        else
                            System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}