package Ex02;

import java.util.Scanner;
public class Produto {
    String nome;
    double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    Produto() {
       }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String verificarValor(){
        String resposta = null;
    if (valor >= 50) {
            System.out.println("Esse produto terá desconto!");
    
}else {
        System.out.println("Esse produto não terá desconto!");
}
        return resposta;
    }
   
    public double verificarValor2(){
        if (this.valor >=50) {
            valor = (valor-(valor * 0.2));
        }else {
            valor = valor;
        }
        return valor;
    }
    
}
    

