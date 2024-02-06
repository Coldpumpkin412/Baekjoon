import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{        
        Scanner sc = new Scanner(System.in);
        
        //플레이 한 개월 수 M 입력
        int M = Integer.parseInt(sc.nextLine());
        
        //등급기준액 입력 및 설정
        String[] firstLine = (sc.nextLine()).split(" ");
        int[] payList = {Integer.parseInt(firstLine[0]), Integer.parseInt(firstLine[1]),
                        Integer.parseInt(firstLine[2]), Integer.parseInt(firstLine[3])};
        
        //MVP 등급
        int[] gradeList = new int[M];
        String[] grade = (sc.nextLine()).split("");
        
        for(int i=0 ; i<M ; i++){
            if(grade[i].equals("B")){
                gradeList[i] = 0;
            }else if(grade[i].equals("S")){
                gradeList[i] = 1;
            }else if(grade[i].equals("G")){
                gradeList[i] = 2;
            }else if(grade[i].equals("P")){
                gradeList[i] = 3;
            }else if(grade[i].equals("D")){
                gradeList[i] = 4;
            }
        }

        int answer = 0;
        int pre = 0;
        
        for(int i=0 ; i<M ; i++){
            if(i == 0){
                if(gradeList[i] == 4){
                    answer += payList[3];
                }else{
                    answer += (payList[gradeList[i]]-1);
                    pre = (payList[gradeList[i]]-1);
                }
            }else{
                if(gradeList[i] == 4){
                    answer += payList[3];
                }else{
                    answer += ((payList[gradeList[i]]-1)-pre);
                    pre = ((payList[gradeList[i]]-1)-pre);
                }
            }
        }

        System.out.println(answer);    
    }
}