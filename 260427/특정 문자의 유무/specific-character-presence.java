import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String answer1 = str.contains("ee") ? "Yes" : "No";
        String answer2 = str.contains("ab") ? "Yes" : "No";

        System.out.print(answer1 + " " + answer2);
    }
}