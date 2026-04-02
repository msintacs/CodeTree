import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mathA = Integer.parseInt(st.nextToken());
        int englishA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int mathB = Integer.parseInt(st.nextToken());
        int englishB = Integer.parseInt(st.nextToken());

        if (mathA == mathB) {
            if (englishA > englishB)
                System.out.print("A");
            else
                System.out.print("B");                
        } else {
            if (mathA > mathB)
                System.out.print("A");
            else
                System.out.print("B");
        }
            
    }
}