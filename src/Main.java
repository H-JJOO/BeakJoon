import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(br.readLine());

        String B = br.readLine();

        char[] b = B.toCharArray();


        System.out.println(A * (b[2] - '0'));//문자 5 의 result 는 53, 여기서 result 5 를 받기위해서는 48을 빼줘야함(문자 0)
        System.out.println(A * (b[1] - '0'));
        System.out.println(A * (b[0] - '0'));
        System.out.println(A * Integer.parseInt(B));//정수 A 와 문자열 B 를 정수화 한 값을 곱함
    }
}