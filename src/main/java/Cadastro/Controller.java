package Cadastro;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<Produto> Pro=new ArrayList();

    public void InserirProduto(String nome, int unidade){
        Produto produto=new Produto();
        produto.setNome(nome);
        produto.setUnidade(unidade);
            Pro.add(produto);

        if(Pro.isEmpty()){
                System.out.println("Erro");
            }else{
                System.out.println("OK");
            }

    }
    public void MostrarProduto(){
        for (int i = 0; i < Pro.size(); i++) {
            System.out.println(Pro.get(i).getNome());
            System.out.println(Pro.get(i).getUnidade());

        }
    }




}
