import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int array[] = new int[3];

		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = Integer.parseInt(sc.nextLine().trim());

		String str = sc.nextLine().trim();

		Arrays.sort(array);

		for(int i=0 ; i<3 ; i++) {
			char c = str.charAt(i);

			if (c == 'A')
				System.out.print(array[0] + " ");
			if (c == 'B')
				System.out.print(array[1] + " ");
			if (c == 'C')
				System.out.print(array[2] + " ");
		}

	}
}