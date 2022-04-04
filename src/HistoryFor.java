import java.io.*;
import java.util.StringTokenizer;


public class HistoryFor {

    public static void main(String[] args) throws IOException {
        aPlusB(args);

    }

    //N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다
    public static void multiplicationTable(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }

    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    //StringBuilder에는 append()가 있는데, 이는 문자열을 더하는 역할을 한다.
    public static void aPlusB(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }

    //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
    public static void sum(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= a; i++) {
            result += i;
        }
        System.out.println(result);
    }

    //첫번째 입력값으로 계산할 갯수를 입력받고, 두번째, 세번째 값으로 더할 A, B 값을 입력받는다.
    public static void sum2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        System.out.println(sb);
    }

    //자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    public static void increment(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i < a+1; i++) {
            System.out.println(i);
        }
    }

    //자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
    public static void decrease(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        while (a > 0) {
            System.out.println(a);
            a--;
        }
    }

    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    public static void plus(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < a + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        System.out.println(sb);
    }

    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    public static void plus2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < a + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");
            sb.append(b);
            sb.append(" + ");
            sb.append(c);
            sb.append(" = ");
            sb.append(b + c);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    public static void star1(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    //하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
    public static void star2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
