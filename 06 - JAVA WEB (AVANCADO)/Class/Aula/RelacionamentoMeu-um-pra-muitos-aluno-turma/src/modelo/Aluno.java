package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private int matricula;
	private String nome;
	// CRIAR RELAÇÃO DE TURMA PARA ALUNO(1,1)
	private List<Turma> turmas;
	
	public Aluno() {
		super();
		turmas = new ArrayList<Turma>();
	}
	
	
	public Aluno(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Turma> getTurma() {
		return turmas;
	}


	public void setTurmas(List<Turma> turma) {
		this.turmas = turma;
	}

	public void add(Turma turma) {
		turmas.add(turma);
	}
	
	public Turma geTurma(int id) {
		return turmas.get(id);
	}
}
