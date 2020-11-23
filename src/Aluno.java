import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer {

	String novaData;
	String nome;

	public Aluno(String nome) {
		this.nome = nome;

	}

	public String getName() {
		return this.nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public void update(Observable o, Object arg) {
		if (o instanceof Professor) {
			Professor professor = (Professor) o;
			novaData = professor.getData();
		}
		System.out.print("O professor " + ((Professor) o).getName() + " mudou a data da prova para " + novaData + "\n");
	}

	public String toString() {
		return "" + nome + "";
	}
}
