package main;

import obj.Diretor;
import obj.Filme;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        ArrayList<Filme> catalogo = new ArrayList<>();
        System.out.println("1 - Cadastrar um filme\n" +
                "2 - Buscar um filme pelo título\n" +
                "3 - Sair e Ver Catálogo");
        entrada = sc.nextInt();
        do {
            if(entrada == 1) {
                System.out.println("Cadastro Filme-----------");
                sc.nextLine();
                System.out.println("Titulo: ");
                String titul = sc.nextLine();
                System.out.println("Descricao: ");
                String desc = sc.nextLine();
                System.out.println("Duracao em Min: ");
                int duracao = sc.nextInt();
                sc.nextLine();
                System.out.println("Nome do Diretor: ");
                String nom = sc.nextLine();
                System.out.println("Local de Nascimento do Diretor: ");
                String loc = sc.nextLine();
                System.out.println("Tempo de Experiência do Diretor: ");
                int temp = sc.nextInt();
                sc.nextLine();
                Diretor dir = new Diretor(nom,temp,loc);
                Filme film = new Filme(titul, desc, dir, duracao);
                catalogo.add(film);
                System.out.println("Filme Cadastrado!!");
                System.out.println(catalogo.get(catalogo.size()-1));
                System.out.println();
            }

            else if(entrada == 2) {
                System.out.println("Título para procurar: ");
                sc.nextLine();
                String nome = sc.nextLine();
                for(int i = 0; i<catalogo.size(); i++){
                    System.out.println(catalogo.get(i).comparacao(nome));
                }
            }

            else if(entrada == 3) {

                System.out.println("----------Catálogo Filmes----------");
                for(int i = 0; i<catalogo.size(); i++)
                    System.out.println(catalogo.get(i));
                System.out.println("----------Catálogo Filmes----------");
                System.out.println("\nFIM");
                break;
            }
            System.out.println("1 - Cadastrar um filme\n" +
                    "2 - Buscar um filme pelo título\n" +
                    "3 - Sair e Ver Catálogo");
            entrada = sc.nextInt();
        } while(entrada == 1||entrada == 2||entrada==3);

        sc.close();
    }
}