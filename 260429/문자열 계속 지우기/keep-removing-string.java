import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();

        while (A.length() >= B.length()) {
            boolean found = false;

            for (int i=0; i <=A.length() - B.length(); i++) {

                boolean isSame = true;

                for (int j=0; j<B.length(); j++) {
                    if (A.charAt(i + j) != B.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    A = A.substring(0, i) + A.substring(i + B.length());
                    found = true;
                    break;
                }
            }
            if (!found) {
                break;
            }
        }
        
        System.out.print(A);
    }
}