import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int len = str.length();

        int cnt = 0;//크로아티아 알파벳 개수

        for (int i = 0; i < len; i++) {

            char ch = str.charAt(i);//입력한 단어의 i index 문자

            if (ch == 'c' && i < len - 1) {//만약 ch == c 라면
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {//만약 ch 다음 문자가 '=' 또는 '-'라면
                    i++;//i+1 까지가 하나의 문자이므로 다음 문자 건너뛰기
                }
            } else if (ch == 'd' && i < len - 1) {
                if (str.charAt(i + 1) == '-') {//d-
                    i++;
                } else if (str.charAt(i + 1) == 'z' && i < len - 2) {
                    if (str.charAt(i + 2) == '=') {//dz=
                        i += 2;
                    }
                }
            } else if ((ch == 'l' || ch == 'n') && i < len - 1) {
                if (str.charAt(i + 1) == 'j') {//lj || nj
                    i++;
                }
            } else if ((ch == 's' || ch == 'z') && i < len - 1) {
                if (str.charAt(i + 1) == '=') {//s= || z=
                    i++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}