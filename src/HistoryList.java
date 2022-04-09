import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HistoryList {

    public static void main(String[] args) {

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
}
