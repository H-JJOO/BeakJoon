import java.io.*;
import java.util.HashSet;

//HashSet 중복되는 원소를 넣을 경우 하나만 저장한다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i ++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }
        System.out.println(h.size());
    }
}