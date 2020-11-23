import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {

		List<Professor> professores = new ArrayList<>();
		List<Aluno> alunos = new ArrayList<>();
		ArrayList<Aluno> conectados = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n1 - Criar Professor");
			System.out.println("2 - Criar Aluno");
			System.out.println("3 - Conectar aluno a Professor");
			System.out.println("4 - Desconectar Aluno de Professor");
			System.out.println("5 - Definir data de Avaliação");
			System.out.println("6 - Sair da aplicação");
			System.out.print("\nEntre com a opcao desejada: ");

			opcao = Integer.parseInt(scanner.nextLine());

			switch (opcao) {

			case 1:
				String nome;
				System.out.print(" Digite o nome do Professor : ");
				nome = scanner.nextLine();
				professores.add(new Professor(nome));
				System.out.println(professores);
				break;
			case 2:
				String nomeAluno;
				System.out.print(" Digite o nome do Aluno: ");
				nomeAluno = scanner.nextLine();
				alunos.add(new Aluno(nomeAluno));
				System.out.println(alunos);
				break;

			case 3:
				String professorEscolhido;
				String alunoEscolhido;

				System.out.println(professores);
				System.out.print(" Escolha um Professor : ");
				professorEscolhido = scanner.nextLine();
				System.out.println("\n");
				System.out.println(alunos);
				System.out.print("Escolha um Aluno: ");
				alunoEscolhido = scanner.nextLine();
				conectados.add(new Aluno(alunoEscolhido));

				System.out.println(conectados);

				for (Professor prof : professores) {
					for (Aluno aluno : alunos) {
						if (prof.getName().equals(professorEscolhido) && aluno.getName().equals(alunoEscolhido)) {
							prof.addObserver(aluno);
							System.out.println(prof.countObservers());

						}

					}
				}

				break;

			case 4:
				String escolhidoAluno;
				String escolhidoProf;

				System.out.println(professores);
				System.out.print(" Escolha um Professor : ");
				escolhidoProf = scanner.nextLine();
				System.out.println("\n");
				System.out.println(conectados);
				System.out.print("Escolha um Aluno: ");
				alunoEscolhido = scanner.nextLine();
				for (Professor prof : professores)
					for (Aluno aluno : alunos)
						if (prof.getName().equals(alunoEscolhido)) {
							prof.deleteObserver(aluno);
							System.out.println(prof.countObservers());
						}
				break;

			case 5:
				String profEscolhido;
				String dataProva;
				System.out.println(professores);
				System.out.print("Escolha um Professor : ");
				profEscolhido = scanner.nextLine();
				System.out.print("Digite a Data da Prova: ");
				dataProva = scanner.nextLine();

				for (Professor prof : professores)
					if (prof.getName().equals(profEscolhido)) {
						prof.setDataAvaliacao(dataProva);

					}

				break;

			}
		} while (opcao != 6);

	}
}
