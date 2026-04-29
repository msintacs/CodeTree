import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += Integer.parseInt(br.readLine());            
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        char tmp = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(tmp);

        System.out.print(sb);
    }
}