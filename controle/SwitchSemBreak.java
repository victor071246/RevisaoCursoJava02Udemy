package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "amarela";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei fazer o Bassai-Dai/Jion/Kanku-Dai");
            case "marrom":
                System.out.println("Sei fazer o Tekki Shodan");
            case "roxa":
                System.out.println("Sei fazer o Tekki Shodan");
            case "verde":
                System.out.println("Sei fazer o Heian Yondan");
            case "laranja":
                System.out.println("Sei fazer o Heian Sandan");
            case "amarela":
                System.out.println("Sei fazer o Heian Shodan");
            default:
                System.out.println("não sei nada");
        }
    }
}
