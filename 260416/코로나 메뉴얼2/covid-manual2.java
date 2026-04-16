import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] count = new int[4];

        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String flag = st.nextToken();
            int temp = Integer.parseInt(st.nextToken());
            
            if (temp >= 37) {
                if ("Y".equals(flag))
                    count[A]++;
                else 
                    count[B]++;
            } else {
                if ("Y".equals(flag))
                    count[C]++;
                else
                    count[D]++;
            }
        }

        for (int i=0; i<4; i++) {
            System.out.print(count[i] + " ");
        }

        if (count[0] >= 2) System.out.print("E");
    }
}