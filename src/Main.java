import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int[] arr;

        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {

            st = new StringTokenizer(br.readLine(), " ");//학생 수, 성적

            int N = Integer.parseInt(st.nextToken());//학생 수
            arr = new int[N];

            double sum = 0;//성적 합

            for (int j = 0; j < N; j++) {
                int val = Integer.parseInt(st.nextToken());//성적
                arr[j] = val;
                sum += val;
            }
            double avg = (sum / N);
            double cnt = 0;//평균이 넘는 학생 수

            //평균 넘는 학생 비율
            for (int j = 0; j < N; j++) {
                if (arr[j] > avg) {
                    cnt++;
                }
            }
            sb.append(String.format("%.3f",((cnt/N)*100)) + "%\n");
        }
        System.out.println(sb);
    }
}