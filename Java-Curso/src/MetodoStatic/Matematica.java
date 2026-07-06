package MetodoStatic;
  private static double valorPi = 3.14f;

public class Matematica {
    public static int somar(int numeroA, int numeroB){
        return numeroA + numeroB;
    }

    public static double calcularAreaQuadrada(double lado){
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio){
        // PI * raio * raio
        // PI = 3,14
        double area = valorPI * raio * raio;
        return area;
    }
}
