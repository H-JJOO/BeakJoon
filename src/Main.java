import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(arithmeticSequence(Integer.parseInt(br.readLine())));
    }

    public static int arithmeticSequence(int num) {
        int cnt = 0;//한수 카운트

        if (num < 100) {
            return num;
        } else {
            cnt = 99;//99이하는 cnt 99
            if (num == 1000) {//예외처리
                num = 999;
            }
            for (int i = 100; i <= num; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hundred - ten) == (ten - one)) {//등차수열
                    cnt++;
                }
            }
        }
        return cnt;
    }
}