import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
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
}