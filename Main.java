public class Main {

	public static void main(String[] args) {
		
		Bolsista b1 = new Bolsista(/*"Josias", 4534,"Cultura no IFSC","Oficina de Integração"*/);
		 
		b1.setNome("Carol");
		b1.setMatricula(54534);
		b1.setProjeto("Cultura no IFSC");
		b1.setDisciplina("Oficina de Integração");
		
		System.out.println("\nNome do bolsista: " + b1.getNome());
		System.out.println("Número da matícula: " + b1.getMatricula());
		System.out.println("Nome do projeto: " + b1.getProjeto());
		System.out.println("Disciplina: " + b1.getDisciplina());

	}

}