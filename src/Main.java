import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int cross_count = 1;
        int prev_count_sum = 0;

        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (a <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면
                    // 분모가 큰 수부터 시작
                    // 분모는 대각선 개수 - (a 번째 - 직전 대각선까지의 누적합 - 1)
                    // 분자는 a 번째 - 직전 대각선까지의 누적합
                    System.out.print((cross_count - (a - prev_count_sum - 1)) + "/" + (a - prev_count_sum));
                    break;
                }
                else {	// 대각선의 개수가 짝수라면
                    // 홀수일 때의 출력을 반대로
                    System.out.print((a - prev_count_sum) + "/" + (cross_count - (a - prev_count_sum - 1)));
                    break;
                }
            } else {
                prev_count_sum += cross_count;
                cross_count++;
            }
        }
    }
}