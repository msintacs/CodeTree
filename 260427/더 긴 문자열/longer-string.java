import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strA = st.nextToken();
        String strB = st.nextToken();

        if (strA.length() > strB.length()) {
            System.out.print(strA + " " + strA.length());
        } else if (strA.length() == strB.length()) {
            System.out.print("same");
        } else {
            System.out.print(strB + " " + strB.length());
        }
    }
}