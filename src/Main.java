import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        //랜덤 숫자
//        Random random = new Random();
//
//        int a = random.nextInt(6) + 1;
//        int b = random.nextInt(6) + 1;
//        int c = random.nextInt(6) + 1;

        //입력 숫자
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        //self
//        if (A == B && A == C) {
////            System.out.println(A + " " + B + " " + C);
//            System.out.println(10000 + A * 1000);
//        } else if (A == B && A != C || A == C && A != B) {
////            System.out.println(A + " " + B + " " + C);
//            System.out.println(1000 + A * 100);
//        } else {
//            if (A > B && A > C) {
////                System.out.println(A + " " + B + " " + C);
//                System.out.println(A * 100);
//            } else if (A < B && B > C) {
////                System.out.println(A + " " + B + " " + C);
//                System.out.println(B * 100);
//            } else {
////                System.out.println(A + " " + B + " " + C);
//                System.out.println(C * 100);
//            }
//        }

        if(a == b && a == c && b == c) {
            System.out.print(10000+(a*1000));
        } else if(a == b || a == c) {
            System.out.print(1000+(a*100));
        } else if(b == c) {
            System.out.print(1000+(b*100));
        } else {
            System.out.print((Math.max(a, Math.max(b, c))*100));
        }
    }
}