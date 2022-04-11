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
}
