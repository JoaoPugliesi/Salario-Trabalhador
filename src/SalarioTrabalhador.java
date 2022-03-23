import java.util.Scanner;

public class SalarioTrabalhador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nome do funcion�rio(a): ");
		String nome = input.nextLine();
		
		System.out.print("Informe o sal�rio base: R$");
		float salario = input.nextFloat();
		
		System.out.print("Informe a gratifica��o: R$");
		float auxilio = input.nextFloat();
		
		float salarioBruto = salario + auxilio;
		System.out.printf("O sal�rio Bruto do funcion�rio(a) �: R$%.2f \n", salarioBruto);
		
		
		if (salarioBruto < 1000) {
			
			float irrf = (salarioBruto * 15) /100;
			float salarioLiquido1 = salarioBruto - irrf;
			float desconto = salarioBruto - salarioLiquido1;
			System.out.printf("O sal�rio l�quido do funcion�rio(a) �: R$%.2f \n", salarioLiquido1);
			System.out.print("Sal�rio l�quido descontado o valor de R$" +desconto + "referente ao desconto de 15% do IRRF.");
			
		}else {
			
			float irrf1 = (salarioBruto * 20) /100;
			float salarioLiquido2 = salarioBruto - irrf1;	
			float desconto = salarioBruto - salarioLiquido2;
			System.out.printf("O sal�rio l�quido do funcion�rio(a) �: R$%.2f \n", salarioLiquido2);
			System.out.print("Sal�rio l�quido descontado o valor de R$" +desconto + " referente ao desconto de 20% do IRRF.");
		}

	}
	

}
