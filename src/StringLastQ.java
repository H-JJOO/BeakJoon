import java.io.*;

public class StringLastQ {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int cnt = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    //중복 체크 함수
    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];//알파벳
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);//현재 문자

            if (prev != now) {//전문자와 i q번째 문자가 다르다면
                if (check[now - 'a'] == false) {//처음나오는 문자라면
                    check[now - 'a'] = true;//true 로 변환
                    prev = now;//초기화
                } else {
                    return false;//함수종료
                }
            }
            else {
                continue;
            }
        }
        return true;
    }
}