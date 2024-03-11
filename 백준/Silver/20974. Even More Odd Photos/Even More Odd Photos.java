import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd = 0;    //홀수 갯수
        int even = 0;   //짝수 갯수
        int answer = 0; //그룹 갯수

        //N입력
        int N = sc.nextInt();
        
        //홀, 짝 개수 세기
        while(N-->0) {
            int num = sc.nextInt();
            
            if(num%2 == 0){
                ++even;
            }else{
                ++odd;
            }
        }

        while(true) {
            //짝수그룹증가
            if(even > 0) {
                --even;
            } else if(odd >= 2) {
                odd -= 2;
            } else {
                break;
            }
            
            ++answer;
            
            //홀수그룹증가
            if(odd > 0) {
                --odd;
            }else {
                break;
            }
            ++answer;
        }
        
        if(odd > 0) {
            --answer;
        }
        
        System.out.println(answer);
    }
}