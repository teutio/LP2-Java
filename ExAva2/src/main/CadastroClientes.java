package main;
import obj.Cliente;
/*Crie uma classe para representar os dados de um cliente, contendo código, nome, cpf e
telefone. Implemente nessa classe os construtores e métodos de acesso/modificação
necessários e também para impressão. Implemente um mét odo para verificação se um
dado nome é igual ao do objeto, que será utilizado para busca.
Em seguida, crie uma classe CadastroClientes que apresente o seguinte menu:
1- Cadastrar cliente
2- Buscar cliente pelo nome
3- Exibir dados dos clientes
4- Sair
Considere que possam ser cadastrados até 50 clientes, mas o cadastro deve ser feito de
acordo com a vontade do usuário.
*/

import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        Cliente[] lista = new Cliente[50];
        Scanner sc =  new Scanner(System.in);
        int entrada =0;
        int qtd = 0;
        System.out.println("1 - Cadastrar um cliente\n" +
                "2 - Buscar um cliente pelo nome\n" +
                "3 - Exibir a lista de clientes\n" +
                "4 - Sair\n");
        entrada = sc.nextInt();
        do {
            if(entrada == 1) {
                System.out.println("Cadastro -----------");
                sc.nextLine();
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                System.out.println("Código: ");
                int matricula = sc.nextInt();
                sc.nextLine();
                System.out.println("CPF: ");
                String n1 = sc.nextLine();
                System.out.println("Número: ");
                String n2 = sc.nextLine();
                lista[qtd] = new Cliente(matricula, nome, n1, n2);
                System.out.println("Cliente Cadastrado!!");
                lista[qtd].dados();
                System.out.println();
                qtd = qtd+1;
            }

            if(entrada == 2) {
                System.out.println("Nome para procurar: ");
                sc.nextLine();
                String nome = sc.nextLine();

                for(int i = 0; i<qtd; i++){
                    if(lista[i].busca(nome)) {
                        lista[i].dados();
                        break;
                    }
                }

            }

            if(entrada == 3) {
                System.out.println("----------Clientes----------");
                for(int i = 0; i<qtd; i++)
                    lista[i].dados();
            }


            if(entrada == 4) {
                break;
            }

            System.out.println("1 - Cadastrar um cliente\n" +
                    "2 - Buscar um cliente pelo nome\n" +
                    "3 - Exibir a lista de clientes\n" +
                    "4 - Sair\n");
            entrada = sc.nextInt();
        } while(entrada == 1||entrada == 2||entrada==3);
        sc.close();
    }
}