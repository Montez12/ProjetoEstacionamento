
public class Professor {

	String nome;
	String titulacao;
	double valorHoraAula;
	int totalDeAulas;
	
	public double calcularSalario() {
		
		double salarioBase,adicionalHoraAula, descansoSemanal, salarioTotal;
		
	 salarioBase = totalDeAulas * 4.5 * valorHoraAula;
	
	if (titulacao.equalsIgnoreCase("Mestre")) {
		salarioBase 	 = salarioBase*1.03;		
	}	
	else if(titulacao.equalsIgnoreCase("Doutor")) {
		salarioBase = salarioBase*1.085;
	}
	
	 adicionalHoraAula = salarioBase *0.05;
	
	 descansoSemanal = (adicionalHoraAula + salarioBase)/6;
	
	
	 salarioTotal = 	salarioBase + adicionalHoraAula + descansoSemanal;
	
	return salarioTotal;
	
	
	}
	
	//Aplicar aumento no aumento do valor da ora aula

	public void ajusarHoraAula(double porcentagem) {
		valorHoraAula *= (1+porcentagem/100);
		
	}
	
	public String retornarDados() {
		String aux = " ";
		aux += "Nome: "+nome+"\n";
		aux += "Titulação: "+titulacao+"\n";
		aux += "Salario: R$ "+calcularSalario()+"\n";
		return aux;
	}
	


}
