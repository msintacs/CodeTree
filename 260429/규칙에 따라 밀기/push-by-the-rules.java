import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        char[] arr = br.readLine().toCharArray();

        for (char c : arr) {
            
            char tmp;

            if (c == 'L') {
                tmp = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(tmp);
            } else {
                tmp = sb.charAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
                sb.insert(0, tmp);
            }
        }

        System.out.print(sb);
    }
}