import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Y = Integer.parseInt(br.readLine());

        if (Y % 4 == 0) {
            if (Y % 100 == 0 && Y % 400 != 0)
                System.out.print("false");
            else
                System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}