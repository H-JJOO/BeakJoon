import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HistoryString {
    public static void main(String[] args) {

    }

    //알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
    public static void ascii(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char a = br.readLine().charAt(0);//첫번째 인덱스

        int num = (int)a;

        System.out.println(num);
    }

    //N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
    public static void sum(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String a = sc.next();
        sc.close();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a.charAt(i)-'0';//문자의 아스키코드 값 변환, 반드시 -48 혹은 -'0'을 해줘야함
        }
        System.out.println(sum);
    }

    //알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
    public static void find(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[26];//소문자 a~z

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;//초기화
        }

        String S = br.readLine();//입력 단어

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (arr[ch - 'a'] == -1) {//arr 값이 -1 인 경우 초기화
                arr[ch - 'a'] = i;
            }
        }

        for (int val : arr) {//배열 출력
            System.out.print(val + " ");
        }
    }

    //문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
    public static void repeat(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {

            String[] str = br.readLine().split(" ");	// 공백 분리

            int R = Integer.parseInt(str[0]);	// String -> int

            for (byte val : str[1].getBytes()) {
                for (int j = 0; j < R; j++) {
                    sb.append((char)val);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}
