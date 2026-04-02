import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken()) + 8;
        int c = Integer.parseInt(st.nextToken()) * 3;

        System.out.println(r);
        System.out.println(c);
        System.out.println(r * c);
    }
}