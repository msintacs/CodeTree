import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int start = 1;
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt((start + i) % str.length()));
        }
    }
}