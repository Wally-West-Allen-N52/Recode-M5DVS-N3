package modelo;

public class Turma {

	private int cod;
	private int sala;
	// 
	private Aluno aluno;
	
	public Turma() {
		super();
	}
	
	public Turma(int cod, int sala) {
		super();
		this.cod = cod;
		this.sala = sala;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
}
