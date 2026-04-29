import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        int idx = 0;
        int length = A.length();
        while (A.length() > B.length()) {

            boolean isSame = true;
            for (int i=idx; i<B.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {                
                A = A.substring(0, idx) + A.substring(idx + B.length());
                idx = 0;
                length = A.length();
            }

            idx++;
        }

        System.out.print(A);
    }
}