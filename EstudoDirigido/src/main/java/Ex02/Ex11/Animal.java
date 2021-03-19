package Ex02.Ex11;

import java.util.Scanner;
public class Animal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Cachorro cl = new Cachorro();
        
        System.out.println("Vamos começar falando sobre cachorros!");
        System.out.println("Vou pedir para você me contar um pouco mais sobre ele.");
        
        System.out.println("Digite a cor do pelo:");
        cl.corPelo = ler.nextLine();
        
        System.out.println("Digite a raça do cachorro:");
        cl.raça = ler.nextLine();
        
        System.out.println("Carrregando...");
        System.out.println(cl);
        System.out.println("INTERESSANTE! A cor do pelo do doguinho é " + cl.corPelo + ", e a raça é " + cl.raça);
        
        Mosca ml = new Mosca();
        
        System.out.println("Agora vamos falar sobre Moscas!");
        
        System.out.println("Digite qunatas patas ela tem:");
        ml.qtdPatas = ler.nextInt();
        
        System.out.println("Agora digite qual o seu especime:");
        ml.especie = ler.nextLine();
        
        System.out.println("Carregando...");
        System.out.println(ml);
        System.out.println("Por mais que é uma animal nojento é interessante! Pois pelo  o que você disse ela tem" 
                + ml.qtdPatas + ", e pertence a o especime " + ml.especie);
        
        Papagaio pl = new Papagaio();
        
        System.out.println("Para terminar falaremos sobre Papagaios!");
        
        System.out.println("Digite a cor das penas da ave:");
        pl.corPena = ler.nextLine();
        
        System.out.println("Agora digite que tipo de Papagaio ele é: ");
        pl.raça = ler.nextLine();
        
        System.out.println("Carregango...");
        System.out.println(pl);
        System.out.println("Legal! Suas penas são da cor " + pl.corPena + ", e é um papagaio do tipo " + pl.raça);
    }
}
