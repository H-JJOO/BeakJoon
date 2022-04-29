import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt = 1;//최소루트
        int rng = 2;//최솟값

        if (num == 1) {
            System.out.println(1);
        } else {
            while (rng <= num) {
                rng = rng + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}