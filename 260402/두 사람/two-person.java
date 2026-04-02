import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ageA = Integer.parseInt(st.nextToken());
        String genderA = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int ageB = Integer.parseInt(st.nextToken());
        String genderB = st.nextToken();

        if ((ageA >= 19 && "M".equals(genderA)) || (ageB >= 19 && "M".equals(genderB)))
            System.out.print(1);
        else
            System.out.print(0);
    }
}