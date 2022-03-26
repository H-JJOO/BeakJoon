import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        A += C / 60;
        B += C % 60;

        if(B > 59) {
            A += 1;
            B -= 60;
        }
        if(A > 23) {
            A -= 24;
        }
        System.out.println(A + " " + B);
    }
}