import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        for (int i=0; i<N; i++) {
            sum += Double.parseDouble(st.nextToken());
        }

        System.out.printf("%.1f\n", sum / N);
        
        if (sum / N >= 4.0)
            System.out.print("Perfect");
        else if (sum / N >= 3.0)
            System.out.print("Good");
        else
            System.out.print("Poor");
    }
}