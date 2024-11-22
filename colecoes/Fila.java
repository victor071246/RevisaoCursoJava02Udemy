package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.offer("Maria");
        fila.offer("João");
        fila.add("Pedro");

        System.out.println("Peek/Element...");
        System.out.println(fila.peek());//Pega o primeiro elemento na fila e não remove
        System.out.println(fila.element()); // Faz a mesma coisa do anterior

        System.out.println("Poll/Remove...");
        System.out.println(fila.poll());//Devove o primeiro da fila como resposta e o remove
        System.out.println(fila.remove()); // Faz a mesma coisa do anterior
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        //Enquanto Remove e Element retornam um erro, Peak e Poll retornam null
        
    }
}
