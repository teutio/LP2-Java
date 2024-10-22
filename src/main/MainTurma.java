package main;
import java.util.Scanner;
import obj.Aluno;
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



public class MainTurma {

	public static void main(String[] args) {
		Aluno[] turma = new Aluno[50];
		Scanner sc =  new Scanner(System.in);
		int entrada =0;
		int qtd = 0;
		System.out.println("1 - Cadastrar um aluno\n" + 
				"2 - Buscar um aluno pelo nome\n" + 
				"3 - Exibir a lista de alunos\n" + 
				"4 - Calcular a média da turma\n" + 
				"5 - Sair");
		entrada = sc.nextInt();
		do {
			if(entrada == 1) {
				
			}
			
			if(entrada == 2) {
		
			}
			
			if(entrada == 3) {
				
			}
			
			if(entrada == 4) {
				
			}
			
			if(entrada == 5) {
				break;
			}
			
			
		} while(entrada == 1||entrada == 2||entrada==3);
		
		
		
		
		
		
		
		
		
		
		
		
sc.close();

	}

}
