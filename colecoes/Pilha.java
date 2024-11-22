package colecoes;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("O Pequeno Príncipe");
        pilha.push("O Hobbit");
        pilha.push("Don Quixote");

        System.out.println("peek...");//Pega o de cima sem tirar
        System.out.println(pilha.peek());

        System.out.println("pop...");//Retira o topo da pilha e o retorna
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
    }
}
