package Cadastro;

import java.util.Scanner;

public class Main {

public static void main(String[]args){
    Controller controller=new Controller();
    Scanner ler=new Scanner(System.in);

    for(int i=0;i<3;i++) {
        System.out.println("Informe o nome do produto");
        String nomeP = ler.next();
        System.out.println("Informe a quantidade");
        int QTDP = ler.nextInt();


        controller.InserirProduto(nomeP, QTDP);
    }

    controller.MostrarProduto();

}
}
