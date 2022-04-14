import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class HistoryList {

    public static void main(String[] args) throws IOException {
        remain2(args);
    }

    //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
    public static void maxMin(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;

        int[] arr = new int[a];

        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);//배열 오름차순 정렬
        System.out.println(arr[0] + " " + arr[a - 1]);
    }

    //9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
    //예를 들어, 서로 다른 9개의 자연수
    //3, 29, 38, 12, 57, 74, 40, 85, 61
    //이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
    public static void maxIndex(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i ++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int index = 0;

        int count = 0;

        for (int value : arr) {
            count++;
            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
    //세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
    //예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
    public static void count(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[10];//0~9, 10개

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = String.valueOf(val);//정수를 문자열로 변환

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - '0')]++;//문자 0 혹은 아스키코드 48을 빼준다.
        }

        for (int v : arr) {
            System.out.println(v);
        }
    }

    //두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
    //수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
    public static void remain1(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i ++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(h.size());
    }

    public static void remain2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42];

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine() )% 42] = true;
        }

        int count = 0;
        for (boolean value : arr) {
            if (value) {
                count++;
            }
        }
        System.out.println(count);

    }
    //세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
    //예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
    //세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
    public static void lie(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sum = ((arr[i] / arr[arr.length - 1]) * 100) + sum;
        }
        System.out.println(sum / arr.length);
    }

    //"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
    //"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
    //OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
    public static void oX(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        String arr[] = new String[a];

        for (int i = 0; i < a; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < a; i++) {

            int cnt = 0;//연속횟수
            int sum = 0;//누적합산

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
    //첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
    //둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
    //각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
    public static void avg(String[] args) throws IOException {
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
