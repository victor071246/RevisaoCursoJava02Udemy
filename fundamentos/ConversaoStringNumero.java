package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        String resposta1 = JOptionPane.showInputDialog("Qual é a nota 1?");
        String resposta2 = JOptionPane.showInputDialog("Qual a nota 2?");

        System.out.println(resposta1 + resposta2);
    }
}
