import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = a;

        if (a >= 0 && a < 99 ) {
            do {
                a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
                cnt++;
            } while (copy != a);

            System.out.println(cnt);
        } else {
            System.out.println("0보다 크거나 같고, 99보다 작거나 같은 정수를 입력하세요.");
        }
    }
}