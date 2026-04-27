import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String target = br.readLine();

        if (str.contains(target)) {

            int start = 0;
            int end = target.length() - 1;

            while (end < str.length()) {

                StringBuilder sb = new StringBuilder();
                for (int i=start; i<=end; i++) {
                    sb.append(str.charAt(i));
                }
                
                if (target.equals(sb.toString())) {
                    System.out.print(start);
                    break;
                }

                start++;
                end++;
            }

        } else {
            System.out.print(-1);
        }
    }
}