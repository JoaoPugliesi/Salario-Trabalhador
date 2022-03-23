import java.util.Scanner;

public class SalarioTrabalhador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nome do funcionário(a): ");
		String nome = input.nextLine();
		
		System.out.print("Informe o salário base: R$");
		float salario = input.nextFloat();
		
		System.out.print("Informe a gratificação: R$");
		float auxilio = input.nextFloat();
		
		float salarioBruto = salario + auxilio;
		System.out.printf("O salário Bruto do funcionário(a) é: R$%.2f \n", salarioBruto);
		
		
		if (salarioBruto < 1000) {
			
			float irrf = (salarioBruto * 15) /100;
			float salarioLiquido1 = salarioBruto - irrf;
			float desconto = salarioBruto - salarioLiquido1;
			System.out.printf("O salário líquido do funcionário(a) é: R$%.2f \n", salarioLiquido1);
			System.out.print("Salário líquido descontado o valor de R$" +desconto + "referente ao desconto de 15% do IRRF.");
			
		}else {
			
			float irrf1 = (salarioBruto * 20) /100;
			float salarioLiquido2 = salarioBruto - irrf1;	
			float desconto = salarioBruto - salarioLiquido2;
			System.out.printf("O salário líquido do funcionário(a) é: R$%.2f \n", salarioLiquido2);
			System.out.print("Salário líquido descontado o valor de R$" +desconto + " referente ao desconto de 20% do IRRF.");
		}

	}
	

}
