package Thread;

import java.util.Scanner;

public class calcula extends Thread{
	
	public void run(){
		
		int op = 0;
		
		Calcula Num = new Calcula();

		Scanner input = new Scanner(System.in);
		
		do{
			
			System.out.println("1-Soma");
			System.out.println("2-Subtração");
			System.out.println("3-Divisão");
			System.out.println("4-Multiplicação");
			System.out.println("99-Sair");
			
			op = input.nextInt();
			
			switch(op){
				
				case 1:
					System.out.println("Digite o primeiro número: ");
					Num.setNum1( input.nextFloat() );
				
					System.out.println("Digite o segundo número: ");
					Num.setNum2( input.nextFloat() );
					
					System.out.println(Num.getSoma());
					
					break;
					
				case 2: 
					System.out.println("Digite o primeiro número: ");
					Num.setNum1( input.nextFloat() );
				
					System.out.println("Digite o segundo número: ");
					Num.setNum2( input.nextFloat() );
					
					System.out.println(Num.getSubtracao());
					
					break;
				
				case 3:
					System.out.println("Digite o primeiro número: ");
					Num.setNum1( input.nextFloat() );
				
					System.out.println("Digite o segundo número: ");
					Num.setNum2( input.nextFloat() );
					
					System.out.println(Num.getDivisao());
					
					break;
					
				case 4:
					System.out.println("Digite o primeiro número: ");
					Num.setNum1( input.nextFloat() );
				
					System.out.println("Digite o segundo número: ");
					Num.setNum2( input.nextFloat() );
					
					System.out.println(Num.getMultiplicacao());
					
					break;
			
			}
			
				try {
					
					sleep((long)(2000));
					
				}catch(InterruptedException e) {
					
					e.printStackTrace();
				
				}
		
		}while(op!=99);

	}


}
