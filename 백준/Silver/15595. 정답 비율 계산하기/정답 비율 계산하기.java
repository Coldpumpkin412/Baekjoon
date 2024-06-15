import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int correctNum = 0;
        int countNum = 0;
        
        Map<String, Integer> map=new HashMap<>();
        
        for(int i=0 ; i<N ; i++) {
            String str[] = br.readLine().split(" ");
            String userID = str[1];
            
            if(userID.equals("megalusion")) {
                continue;
            }
            Integer tmp = map.get(userID);
            
            if(tmp == null) {
                tmp=0;
            }else if(tmp < 0) {
                continue;
            }
            
            tmp++;
            
            if(Integer.parseInt(str[2]) == 4) {
                correctNum++;
                countNum += tmp;
                tmp *= -1;
            }
            map.put(userID, tmp);
        }
        
        double answer;
        
        if(countNum == 0) {
            answer = 0;
        }else {
            answer = (double)correctNum / (double)countNum;
        }
        
        System.out.println(answer*100);
    }
}