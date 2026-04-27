import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        char prev = str.charAt(0);
        int cnt = 1;
        for (int i=1; i<str.length(); i++) {
            if (prev != str.charAt(i)) {
                sb.append(prev);
                sb.append(cnt);
                cnt = 1;
            } else {
                cnt++;                
            }

            prev = str.charAt(i);
        }

        sb.append(prev);
        sb.append(cnt);

        System.out.println(sb.toString().length());
        System.out.println(sb.toString());
    }
}