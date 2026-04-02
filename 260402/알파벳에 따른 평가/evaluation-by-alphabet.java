import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = null;

        if ("S".equals(input))
            output = "Superior";
        else if ("A".equals(input))
            output = "Excellent";
        else if ("B".equals(input))
            output = "Good";
        else if ("C".equals(input))
            output = "Usually";
        else if ("D".equals(input))
            output = "Effort";
        else
            output = "Failure";

        System.out.println(output);
    }  
}