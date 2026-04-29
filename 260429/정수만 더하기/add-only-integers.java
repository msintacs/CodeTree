import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }

        System.out.print(sum);
    }
}