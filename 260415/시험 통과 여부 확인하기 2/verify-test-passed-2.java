import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i=0; i<N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());            
            int sum = 0;
            for (int j=0; j<4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            if ((sum / 4) >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }   
        }

        System.out.print(cnt);
    }
}