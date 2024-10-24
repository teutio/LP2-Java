package main;
import java.util.Scanner;
import obj.Aluno;


public class MainTurma {

	public static void main(String[] args) {
		Aluno[] turma = new Aluno[50];
		Scanner sc =  new Scanner(System.in);
		int entrada =0;
		int qtd = 0;
		double media = 0.0;
		System.out.println("1 - Cadastrar um aluno\n" + 
				"2 - Buscar um aluno pelo nome\n" + 
				"3 - Exibir a lista de alunos\n" + 
				"4 - Calcular a média da turma\n" + 
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
				System.out.println("N1: ");
				double n1 = sc.nextDouble();
				System.out.println("N2: ");
				double n2 = sc.nextDouble();
				turma[qtd] = new Aluno(matricula, nome, n1, n2);
				System.out.println("Aluno Cadastrado!!");
				turma[qtd].dados();
				System.out.println();
				qtd = qtd+1;
			}
			
			if(entrada == 2) {
				System.out.println("Nome para procurar: ");
				sc.nextLine();
				String nome = sc.nextLine();

				for(int i = 0; i<qtd; i++){
						if(turma[i].busca(nome)) {
							turma[i].dados();
							break;
						}
				}

			}
			
			if(entrada == 3) {
				System.out.println("----------Turma----------");
				for(int i = 0; i<qtd; i++)
					turma[i].dados();
			}


			if(entrada == 4) {

				//if(qtd > 0) {
					for (int i = 0; i < qtd; i++) {
						media += turma[i].getMed(); // consertar
						System.out.println(media);
					}
					media = media / qtd;
					System.out.println("Média da Turma: " + media);
					media = 0.0;
				//}
				//else
				//	System.out.println("A turma está vazia.");
			}
			
			if(entrada == 5) {
				break;
			}
			System.out.println("1 - Cadastrar um aluno\n" +
								"2 - Buscar um aluno pelo nome\n" +
								"3 - Exibir a lista de alunos\n" +
								"4 - Calcular a média da turma\n" +
								"5 - Sair");
			entrada = sc.nextInt();
			System.out.println(qtd);
		} while(entrada == 1||entrada == 2||entrada==3||entrada==4);
sc.close();

	}

}
/*Escreva uma classe que represente um aluno de um curso X. Os dados
do aluno são: matrícula, nome, nota1, nota2 e média. Escreva a classe em
Java contendo:
a) Construtor padrão e outro com a matrícula, nome, nota1 e nota2;
b) Métodos de acesso (getter/setter);
c) Um méto do que retorne a média do aluno (deve ser utilizado no construtor);
d) Um méto do para comparação de dois nomes, retornando o resultado da
comparação;
e) Um mét odo que permita exibir os dados do aluno.
Em seguida, você deve criar a classe MainTurma que cria uma lista de
alunos e permita:
1- Cadastrar um aluno;
2- Buscar um aluno pelo nome;
3- Exibir a lista de alunos
4- Calcular a média da turma.
5- Sair
*/

