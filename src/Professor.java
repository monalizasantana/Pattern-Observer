import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;

public class Professor extends Observable {
	private String nome;
	private String dataProva;
	public Controle conectados;

	public Professor(String nome) {
		this.nome = nome;
	}

	public String getName() {
		return nome;
	}

	public String getData() {
		return dataProva;
	}

	public void setDataAvaliacao(String dataProva) {
		this.dataProva = dataProva;
		setChanged();
		this.notifyObservers(dataProva); // quando a altera��o da data ocorrer, esse � momento correto para notificar os
		// observers
	}

	public String toString() {
		return "" + nome + " ";
	}

}
