import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char a = st.nextToken().charAt(0);
        char b = st.nextToken().charAt(0);

        int sum = a + b;
        int diff = Math.abs(a - b);
        
        System.out.print(sum + " " + diff);
    }
}