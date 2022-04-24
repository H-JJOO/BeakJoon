import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //StringBuilder 의 reverse 메소드
        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(a > b ? a : b);
    }
}