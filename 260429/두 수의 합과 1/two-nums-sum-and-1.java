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

        String str = String.valueOf(A+B);
        
        int cnt = 0;
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c == '1')
                cnt++;
        }

        System.out.print(cnt);
    }
}