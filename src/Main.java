import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < a + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");
            sb.append(b);
            sb.append(" + ");
            sb.append(c);
            sb.append(" = ");
            sb.append(b + c);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}