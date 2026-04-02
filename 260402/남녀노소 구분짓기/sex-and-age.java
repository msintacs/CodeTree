import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gender = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        if (gender == 0) {
            if (age >= 19)
                System.out.println("MAN");
            else 
                System.out.println("BOY");
        } else {
            if (age >= 19)
                System.out.println("WOMAN");
            else
                System.out.println("GIRL");
        }
    }
}