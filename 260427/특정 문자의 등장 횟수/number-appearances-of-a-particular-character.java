import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int eeCnt = 0;
        int ebCnt = 0;
        for (int i=0; i<str.length() - 1; i++) {
            String tmp = str.charAt(i) + "" + str.charAt(i+1);

            if ("ee".equals(tmp))
                eeCnt++;

            if ("eb".equals(tmp))
                ebCnt++;
        }

        System.out.print(eeCnt + " " + ebCnt);
    }
}