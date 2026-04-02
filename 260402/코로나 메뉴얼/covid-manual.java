import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int emCnt = 0;
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String isCold = st.nextToken();
            int temp = Integer.parseInt(st.nextToken());

            if (temp >= 37 && "Y".equals(isCold))
                emCnt++;
        }

        System.out.println(emCnt >= 2 ? "E" : "N");
    }
}