import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken();
        int Q = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<Q; i++) {
            st = new StringTokenizer(br.readLine());
            
            switch (Integer.parseInt(st.nextToken())) {
                case 1: 
                    char[] arr = S.toCharArray();
                    int idx1 = Integer.parseInt(st.nextToken()) - 1;
                    int idx2 = Integer.parseInt(st.nextToken()) - 1;

                    char tmp = arr[idx1];
                    arr[idx1] = arr[idx2];
                    arr[idx2] = tmp;

                    S = String.valueOf(arr);

                    break;
                case 2:
                    char firstChar = st.nextToken().charAt(0);
                    char secondChar = st.nextToken().charAt(0);

                    S = S.replace(firstChar, secondChar);

                    break;
            }

            System.out.println(S);
        }
    }
}