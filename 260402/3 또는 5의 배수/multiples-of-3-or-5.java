import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        System.out.println(A % 3 == 0 ? "YES" : "NO");
        System.out.println(A % 5 == 0 ? "YES" : "NO");
    }
}