import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int idx = 0;
        int prev = Integer.parseInt(st.nextToken());
        int cur = Integer.parseInt(st.nextToken());
        int nRes = 0;

        System.out.print(prev + " " + cur + " ");

        while (idx < 8) {
            nRes = prev * 2 + cur;
            System.out.print(nRes + " ");
            prev = cur;
            cur = nRes;
            idx++;
        }        
    }
}