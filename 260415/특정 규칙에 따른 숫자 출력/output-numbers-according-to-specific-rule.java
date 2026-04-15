import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        for (int i=0; i<N; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<N-i; j++) {
                if (cnt > 9) cnt = 1;                
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
    }
}