import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

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
    //알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
    public static void manySpelling(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];//영문자 개수
        String s = br.readLine();// 입력단어

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {//대문자 범위
                arr[s.charAt(i) - 'a']++;//인덱스 값 1 증가
            } else {//소문자 범위
                arr[s.charAt(i) - 'A']++;
            }
        }
        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);//대문자 출력
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }

    //영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
    public static void wordCount(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");//st 에 공백을 기준으로 하는 토큰을 st 에 저장
        System.out.println(st.countTokens());// countTokens() : 토큰의 개수를 반환
    }

    //상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
    //상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
    //두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
    public static void constantM(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String a = String.format(st.nextToken());

        String b = String.format(st.nextToken());

        if (Integer.parseInt(a.charAt(2) + "" +  a.charAt(1)  + "" + a.charAt(0)) > Integer.parseInt(b.charAt(2) + "" +  b.charAt(1)  + "" + b.charAt(0))) {
            System.out.print(a.charAt(2) + "" +  a.charAt(1)  + "" + a.charAt(0));
        } else if (Integer.parseInt(a.charAt(2) + "" +  a.charAt(1)  + "" + a.charAt(0)) < Integer.parseInt(b.charAt(2) + "" +  b.charAt(1)  + "" + b.charAt(0))) {
            System.out.print(b.charAt(2) + "" +  b.charAt(1)  + "" + b.charAt(0));
        }
    }

    public static void constantV1(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());

        int b = Integer.parseInt(st.nextToken());

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        System.out.println(a > b ? a : b);
    }

    public static void constantV2(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //StringBuilder 의 reverse 메소드
        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(a > b ? a : b);
    }

}
