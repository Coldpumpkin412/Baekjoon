import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=0 ; i<num ; i++) {
            String answer = "";

            String str = br.readLine();
            str = str.toLowerCase();

            HashSet<Character> abc = new HashSet<>();

            // 노간지 해시셋 추가
            abc.add('a');
            abc.add('b');
            abc.add('c');
            abc.add('d');
            abc.add('e');
            abc.add('f');
            abc.add('g');
            abc.add('h');
            abc.add('i');
            abc.add('j');
            abc.add('k');
            abc.add('l');
            abc.add('m');
            abc.add('n');
            abc.add('o');
            abc.add('p');
            abc.add('q');
            abc.add('r');
            abc.add('s');
            abc.add('t');
            abc.add('u');
            abc.add('v');
            abc.add('w');
            abc.add('x');
            abc.add('y');
            abc.add('z');

            for (int j=0 ; j<str.length() ; j++) {
                if (abc.contains(str.charAt(j))){
                    abc.remove(str.charAt(j));
                }
            }

            if (abc.isEmpty()){
                answer = "pangram";
            }else{
                answer = "missing ";

                for (Character c : abc) {
                    answer += c;
                }
            }

            sb.append(answer).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}