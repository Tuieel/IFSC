public class Bolsista extends Aluno {
	private String Projeto;
	private String Disciplina;
	
	public Bolsista () {}

	public String getProjeto() {
		return Projeto;
	}
	
	public Bolsista(String nome, int matricula,String projeto,String disciplina) {
		super(nome, matricula);
		this.Projeto = projeto;
		this.Disciplina = disciplina;
	}

	public void setProjeto(String projeto) {
		Projeto = projeto;
	}

	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
}