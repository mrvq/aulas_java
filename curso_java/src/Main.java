import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int x = sc.nextInt();
		
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);
		sc.close();
	}

}
