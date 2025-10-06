import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int cont = 0;
		
		while (true) {
		System.out.println("Deseja calcular sua média de notas? ");
		String cond = input.next();
		
			if (cond.equalsIgnoreCase("Sim"))
			{
				System.out.println("Quantos alunos serão cadastrados? ");
				double qnt = input.nextDouble();
				
					if(qnt == 0) {
						System.out.println("Digite um número válido!");
					}
					else 
					{	
						
						for (int i = 0; i < qnt; i++ ) {
							
						System.out.println("\nAluno: "+ ++cont);
							
						System.out.println("\nDigite a primeira nota: ");
						double num1 = input.nextDouble();
						
						System.out.println("\nDigite a segunda nota: ");
						double num2 = input.nextDouble();
						
						System.out.println("\nDigite a terceira nota: ");
						double num3 = input.nextDouble();
						
						System.out.println("\nDigite a quarta nota: ");
						double num4 = input.nextDouble();
						
						}
						
						
					}
			}
			else { break; }
		}

	}

}
