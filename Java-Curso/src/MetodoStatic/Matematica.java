package MetodoStatic;

public class Matematica {

    private static double valorPI = 3.14f;

    public static int somar(int numeroA, int numeroB){
        return numeroA + numeroB;
    }

    public static double calcularAreaQuadrado(double lado){
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio){
        // PI * raio * raio
        // PI = 3.14
        double area = valorPI * raio * raio;
        return area;
    }

    public static double calcularDobroDaAreaCirculo(double raio){
        double area = calcularAreaCirculo(raio);
        return area;
    }

}
