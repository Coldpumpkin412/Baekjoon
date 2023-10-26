import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        //N 입력 및 배열 선언
        int N = sc.nextInt();
        String[] arr = new String[N];
        for(int i=0 ; i<N ; i++) {
        	arr[i] = sc.next();
        }
        
       	for(int i=0 ; i<N ; i++) {
            //KBS1부터 
       		if(arr[i].equals("KBS1")) {
       			String tmp = "";
                
       			for(int j=i ; j>0 ; j--) {
        			System.out.print(4);
                    
        			tmp = arr[j-1];
        			arr[j-1] = arr[j];
        			arr[j] = tmp;
       			}
       			break;
        	}
        	else {
                System.out.print(1);   
            }        		
       	}
       	
       	if(arr[1].equals("KBS2")){
            //KBS1을 첫번째로 옮기고 만약 KBS2가 두번째에 있다면 종료
        	return;
        }
        	
       	for(int i=0 ; i<N ; i++) {
       		if(arr[i].equals("KBS2")) {//KBS2를 두번쨰로
       			String tmp = "";
                
       			for(int j=i ; j>1 ; j--) {
       				System.out.print(4);
                    
       				tmp = arr[j-1];
       				arr[j-1] = arr[j];
        			arr[j] = tmp;
        		}
        		break;
       		}
       		else{
                System.out.print(1);
            }
       			
        }
    }
}