import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j=0; j<3; j++) {
                System.out.print(st.nextToken().toUpperCase() + " ");
            }
            System.out.println();
        }
    }
}