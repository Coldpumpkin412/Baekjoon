import java.util.*;

class Solution {
    public String solution(String letter) {
        //해쉬맵을 사용하여 모스부호와 알파벳을 각각 키, 값으로 설정한다.
        Map<String, String> Morse = new HashMap<String, String>(){
            {
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
        }; //put 명령어를 사용하여 해쉬맵 내부에 키와 값들 입력
        
        String[] letterArr = letter.split(" "); //공백을 기준으로 새로운 배열에 입력
        
        String answer = "";
        
        for(String arr : letterArr){ //letterArr 배열의 값들을 하나씩 arr배열에 입력
            answer += Morse.get(arr); //arr배열의 값을 Morse 해쉬맵에 대응
        }
        return answer;
    }
}