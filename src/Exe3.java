//Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
//um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
//que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
//exemplo.

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		
		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool = alcool + 1;
			}
			else if (combustivel == 2) {
				gasolina = gasolina + 1;
			}
			else if (combustivel == 3) {
				diesel = diesel + 1;
			}
			
			combustivel = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool:" + alcool);
		System.out.println("Gasolina:" + gasolina);
		System.out.println("Diesel:" + diesel);
		
		sc.close();

	}

}
