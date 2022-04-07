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

    //정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
    public static void smallNum(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < a; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value < b) {
                sb.append(value).append(' ');
            }
        }
        System.out.println(sb);

    }
    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 0 입력시 종료
    public static void plus3(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }
            sb.append(a + b);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 빈칸 입력 (윈도우 : ctrl + z, 리눅스 : ctrl + d) 시 종료
    public static void plus4(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ( (str= br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    //0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
    //
    //26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
    //
    //위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
    //
    //N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
    public static void cycle(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = a;

        do {
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            cnt++;
        } while (copy != a);
        System.out.println(cnt);
    }
    //2
    public static void cycle2(String[] args) throws IOException {
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
