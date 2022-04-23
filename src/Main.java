import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//st 에 공백을 기준으로 하는 토큰을 st 에 저장
        System.out.println(st.countTokens());// countTokens() : 토큰의 개수를 반환
    }
}