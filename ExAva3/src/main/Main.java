package main;
import obj.Aluno;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int entrada =0;
		ArrayList <Aluno> turma = new ArrayList<>();
	
		System.out.println("1 - Cadastrar um aluno\n" + 
				"2 - Buscar um aluno pelo nome\n" + 
				"3 - Exibir a lista de alunos\n" + 
				"4 - Remover um aluno\n" + 
				"5 - Sair");
		entrada = sc.nextInt();
		do {
			if(entrada == 1) {
				System.out.println("Cadastro -----------");
				sc.nextLine();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Matrícula: ");
				int matricula = sc.nextInt();
				sc.nextLine();
				System.out.println("Idade: ");
				int idade = sc.nextInt();
				Aluno aluno = new Aluno(matricula, nome, idade);
				turma.add(aluno);
				System.out.println("Aluno Cadastrado!!");
				System.out.println(turma.get(turma.size()-1));
				System.out.println();
			}
			
			else if(entrada == 2) {
				System.out.println("Nome para procurar: ");
				sc.nextLine();
				String nome = sc.nextLine();

				for(int i = 0; i<turma.size(); i++){
						if(turma.get(i).busca(nome)) {
							System.out.println(turma.get(i));
							break;
						}
				}

			}
			
			else if(entrada == 3) {
				System.out.println("----------Turma----------");
				for(int i = 0; i<turma.size(); i++)
					System.out.println(turma.get(i));
			}


			else if(entrada == 4) {
				System.out.println("Qual aluno deseja remover? ");
				sc.nextLine();
				String nome = sc.nextLine();

				for(int i = 0; i<turma.size(); i++){
						if(turma.get(i).busca(nome)) {
							System.out.println(turma.get(i));
							turma.remove(i);
							break;
						}
				}
			}
			
			else if(entrada == 5) {
				break;
			}
			System.out.println("1 - Cadastrar um aluno\n" +
								"2 - Buscar um aluno pelo nome\n" +
								"3 - Exibir a lista de alunos\n" +
								"4 - Remover um aluno\n" +
								"5 - Sair");
			entrada = sc.nextInt();
		} while(entrada == 1||entrada == 2||entrada==3||entrada==4);
sc.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
