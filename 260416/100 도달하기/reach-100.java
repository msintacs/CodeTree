import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cur = N;
        int prev = 1;
        int nRes = 0;
        System.out.print(prev + " " + cur + " ");
        while (nRes < 100) {
            nRes = prev + cur;
            System.out.print(nRes + " ");
            prev = cur;
            cur = nRes;
        }
    }
}