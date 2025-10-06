import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int contagemAlunos = 0, aprovados = 0;
		
		while (true) {
			
			System.out.println("Deseja calcular sua média de notas? ");
			String condicao = input.next().toLowerCase();
		
			if (condicao.equals("sim"))
			{
				System.out.println("Quantos alunos serão cadastrados? ");
				double qntdAlunos = input.nextDouble();
				
				if(qntdAlunos > 0) {
						
					Calc calculadora = new Calc();
						
					for (int i = 0; i < qntdAlunos; i++ ) {
									
						System.out.println("\nAluno: "+ ++contagemAlunos);
									
						System.out.println("\nDigite a primeira nota: ");
						double num1 = input.nextDouble();
								
						System.out.println("\nDigite a segunda nota: ");
						double num2 = input.nextDouble();
						
						System.out.println("\nDigite a terceira nota: ");
						double num3 = input.nextDouble();
						
						System.out.println("\nDigite a quarta nota: ");
						double num4 = input.nextDouble();
						
						if (num1 >= 0 && num1 <= 10 && num2 >= 0 && num2 <= 10 && num3 >= 0 && num3 <= 10 && num4 >= 0 && num4 <= 10) {
							
							double media = calculadora.returnMedia(num1, num2, num3, num4);
							System.out.println("\nMédia de: "+media);
						
							if (media > 7) {
								aprovados += 1;
							}
						}
						else {
								System.out.println("Uma ou mais notas são inválidas! Digite valores entre 0 e 10.");
						}	 
					}
				}	
						
				else {
					System.out.println("Digite um número válido!");
				}
			}
			
			else { break; }
			
			System.out.println("Quantidade de aprovados: "+aprovados+"\n");
		}
	}
}