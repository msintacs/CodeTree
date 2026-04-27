import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            sb.append(st.nextToken());
        }

        for (int i=0; i<sb.length(); i++) {
            if (i != 0 && i % 5 == 0)
                System.out.println();
                
            System.out.print(sb.toString().charAt(i));
        }
    }
}