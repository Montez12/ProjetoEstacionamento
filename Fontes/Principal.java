import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		Professor professor = new Professor();
		
		System.out.println("Digite o Nome do Professor - >");
		professor.nome=teclado.nextLine();
		
		System.out.println("Digite a titulação do professor - >");
		professor.titulacao=teclado.nextLine();
		
		System.out.println("Digite o valor da Hora Aula - >");
		professor.valorHoraAula = teclado.nextDouble();
		
		System.out.println("Digite o Total de Aulas - >");
		professor.totalDeAulas = teclado.nextInt();
		
		System.out.println();
		System.out.println(professor.retornarDados());
		
		//aplicar um aumento do valor da aula
		professor.ajusarHoraAula(10);
		
		System.out.println();
		System.out.println(professor.retornarDados());
		
		teclado.close();
	}
	
}
