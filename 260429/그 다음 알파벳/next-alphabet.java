import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);

        int nRes = c + 1;
        if (nRes > 122) {
            nRes = 97;
        }

        System.out.print((char) nRes);
    }
}