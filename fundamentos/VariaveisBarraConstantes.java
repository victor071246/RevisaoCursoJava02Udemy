package fundamentos;

public class VariaveisBarraConstantes {

    public static void main(String[] args) {
        double raio;
        raio = 4.5;
        final double PI = 3.1416;
        double area = PI * raio * raio;

        System.out.println("área é " + area + "m2.");

        System.out.printf("Área é %f m2.\n" , area);
        System.out.printf("Área é %.2f m2." , area);
    }

}
