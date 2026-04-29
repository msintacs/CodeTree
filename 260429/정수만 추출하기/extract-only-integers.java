import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        int nRes = 0;

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<A.length(); i++) {

            char c = A.charAt(i);

            if (!Character.isDigit(c))
                break;

            sb.append(c);
        }

        nRes = Integer.parseInt(sb.toString());
        sb.setLength(0);

        for (int i=0; i<B.length(); i++) {
            char c = B.charAt(i);
            if (!Character.isDigit(c))
                break;
            sb.append(c);
        }

        nRes += Integer.parseInt(sb.toString());

        System.out.print(nRes);
    }
}