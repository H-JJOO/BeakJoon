import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

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
}