import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();

        int T = sc.nextInt();
        
        while(T-->0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int data = 1;
            
            for(int i=0 ; i<B ; i++) {
                data *= A;
                data %= 10;
            }
            if(data == 0) {
                data = 10;
            }
                
            
            list.add(data);
        }

        for(int i=0 ; i<list.size() ; i++){
            System.out.println(list.get(i));
        }
            
    }
}