import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HistoryIf {

    public static void main(String[] args) throws IOException {

    }

    //두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
    public static void comparison(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }
    }

    //시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
    public static void grade(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());

        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println('B');
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}