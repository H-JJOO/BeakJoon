import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
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
}