import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] count = new int[7];
        while (st.hasMoreTokens()) {
            count[Integer.parseInt(st.nextToken())]++;
        }

        for (int i=1; i<count.length; i++) {
            System.out.println(i + " - " + count[i]);
        }
    }
}