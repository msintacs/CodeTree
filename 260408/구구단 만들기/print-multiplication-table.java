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

        for (int i=0; i<9; i++) {
            
            int cnt = 0;
            for (int j=A; j<=B; j++) {
                if (j % 2 == 0)
                    cnt++;
            }

            int tmp = B;
            int e = i+1;
            for (int j=0; j<cnt; j++) {
                System.out.print(tmp + " * " + e + " = " + (tmp * e));                
                tmp -= 2;

                if (j != cnt - 1 ) {
                    System.out.print(" / ");
                }
            }

            System.out.println();
        }
    }
}