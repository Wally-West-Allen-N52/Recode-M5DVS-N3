package modelo;

public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Turma turma = new Turma();
		
		// SETAR INFORMAÇÕES DE ALUNOS
		aluno.setMatricula(123);
		aluno.setNome("Wallace Oliveira");
		turma.setCod(333);
		turma.setSala(22);
		
		
		aluno.add(turma);
		
		
		// CHAMAR TODAS AS INFORMAÇÕES POR ALUNO
		System.out.println("Aluno matricula: "+aluno.getMatricula());
		System.out.println("Aluno nome: "+aluno.getNome());
		System.out.println("Código turma: "+aluno.geTurma(0).getCod());
		System.out.println("Sala: "+aluno.geTurma(0).getSala());
		
	}

}
