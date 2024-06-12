import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //N 입력
        int N = sc.nextInt();
        
        for(int i=1 ; i<=N ; i++){
            System.out.print("*");
        }

        for(int i=1 ; i<=2*N-3 ; i++){
            System.out.print(" ");
        }
        
        for(int i=1 ; i<=N ; i++){
            System.out.print("*");
        }

        System.out.println();
        
        for(int i=2 ; i<N ; i++){
            
            for(int j=1 ; j< i; j++){
                System.out.print(" ");
            }
        
            System.out.print("*");
            
            for(int j=1 ; j<=N-2 ; j++){
                System.out.print(" ");
            }
    
            System.out.print("*");
            
            for(int j=2*N-N ; j>i ; j--){
                System.out.print(" ");
            }
            
            for(int j=2*N-N-1 ; j>i ; j--){
                System.out.print(" ");
            }
            
            for(int j=1 ; j<=N-(N-1) ; j++){
                System.out.print("*");
            }  
            
            for(int j=1 ; j<=N-2 ; j++){
                System.out.print(" ");
            }

            System.out.println("*");
        }
        
        //

        for(int i=1 ; i<=N-1 ; i++){
            System.out.print(" ");
        }
        
        System.out.print("*");

        for(int i=1 ; i<=N-2 ; i++){
            System.out.print(" ");
        }
        
        System.out.print("*");
        
        for(int i=1 ; i<=N-2 ; i++){
            System.out.print(" ");
        }
        
        System.out.println("*");
    
        for(int i=N-1 ; i>=2 ; i--){
            
            for(int j=i ; j>1 ; j--){
                System.out.print(" ");
            }
            
            System.out.print("*");
            
            for(int j=N-2 ; j>=1 ; j--){
                System.out.print(" ");
            }
            
            System.out.print("*");
            
            for(int j=2*N-N ; j>i ; j--){
                System.out.print(" ");
            }
            
            for(int j=2*N-N-1 ; j>i ; j--){
                System.out.print(" ");
            }
            
            for(int j=1 ; j<=N-(N-1); j++){
                System.out.print("*");
            }            

            for(int j=N-2 ; j>=1 ; j--){
                System.out.print(" ");
            }
            
            System.out.println("*");
        }
        
        //
        for(int i=1 ; i<=N ; i++){
            System.out.print("*");
        }
        
        for(int i=1 ; i<=2*N-3 ; i++){
            System.out.print(" ");
        }
        
        for(int i=1; i<=N ; i++){
            System.out.print("*");
        }
    }
}