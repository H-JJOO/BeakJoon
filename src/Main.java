import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //A 고정비용(단발), B 가면 비용(재료비, 인건비), C 노트북 가격

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (C <= B) {
            System.out.println("-1");
        } else {
            System.out.println(A / (C - B) + 1);
        }
    }


}