package carrinhoDeCompras;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//declaração da lista e de seu construtor
public class CarrinhoDeCompras {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Item> listaDeItem = new ArrayList<>();

    //adicionando item
    public static void adcionarItem(){
        String nome; double preco; int quantidade;
        System.out.println("Entre com nome do item a ser adicionado" );
        scanner.nextLine();
        nome = scanner.next();
        scanner.nextLine();
        System.out.println("Entre com o preço do item a ser adicionado" );
        preco = scanner.nextDouble();
        System.out.println("Entre com a quantidade do item a ser adicionado" );
        quantidade = scanner.nextInt();
        listaDeItem.add(new Item(nome, preco, quantidade));
    }
    //removee item com base no seu nome
    public static void removerItem(){
        String nome;
        List<Item> itensRemover = new ArrayList<>();
        System.out.println("Digite o nome do produto a ser removido");
        scanner.nextLine();
        nome = scanner.next();
        scanner.nextLine();
        for(Item i : listaDeItem){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(i);
            }

        }
        itensRemover.removeAll(itensRemover);
    }
    public static Double calcVal(){
        double result =0.00;
        double calcValList =0.00;
        for(Item c : listaDeItem){
            if(c.getPreço() > 0 ){
                result =  c.getPreço() * c.getQuantidade();
                calcValList =+ result;
            }
            return result;
        }
        return null;
    }
    public static void returnCalc(){
        System.out.println("Vaor do carrinho:" + " " + CarrinhoDeCompras.calcVal());
    }

    public static void exibirItens(){
        System.out.println(listaDeItem.toString());
    }


    public static void main(String[] args){
        var option = -1;
        while(option!=0){
            System.out.println("================");
            System.out.println("Escolha uma opção");
            System.out.println("=================");
            System.out.println("1.Adcionar item");
            System.out.println("2.Remover item");
            System.out.println("3.Calcular valor total  de itens");
            System.out.println("4.Exibir todos os itens");
            System.out.println("5.Sair");
            option = scanner.nextInt();
            switch (option){
                case 1 -> adcionarItem();
                case 2 -> removerItem();
                case 3 -> returnCalc();
                case 4 -> exibirItens();
                case 5 ->{option = 0; System.out.println("Saindo . . . ");}
            }

        }

    }
}
