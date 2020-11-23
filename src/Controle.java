import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Controle {
	List<Aluno> conectados = new ArrayList<>();

	public String nomeAluno;
	public String nomeProfessor;

	public Controle(String nomeAluno, String nomeProfessor) {
		this.nomeAluno = nomeAluno;
		this.nomeProfessor = nomeProfessor;
	}

	public String getAlunoEscolhido() {
		return nomeAluno;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void add(Aluno nomeAluno) {
		conectados.add(nomeAluno);
	}
	
}
