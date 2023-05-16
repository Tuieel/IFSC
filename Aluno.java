public class Aluno extends Pessoa {
	private int Matricula;
	
	public Aluno() {}
	
	public Aluno(String nome, int matricula) {
		super(nome);
		this.Matricula = matricula;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
}