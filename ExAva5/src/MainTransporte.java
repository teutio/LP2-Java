import java.util.ArrayList;

public class MainTransporte {
    public static void main(String[] args) {

        ArrayList<Transporte> lista = new ArrayList<>();
        Onibus busao = new Onibus(true);
        lista.add(busao);
        Metro metrows = new Metro(5);
        lista.add(metrows);
        Bike bikes = new Bike(2.5);
        lista.add(bikes);
        
        for(int i =0;i < lista.size();i++){
            System.out.println(lista.get(i).exibirDetalhes());
        }
















    }
}
