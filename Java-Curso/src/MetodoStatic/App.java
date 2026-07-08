package MetodoStatic;

public class App {
    static void main(String[] args) {
       Carro ferrari = new Carro("Ferrari", 2023);

       Carro fusca = new Carro("Fusca", 1999);
       fusca.setNome("fusca branco");

       ferrari.anoCompra = 2007;
       fusca.anoCompra = 2020;

       Carro.anoCompra = 2016;

       System.out.println(ferrari.getNome());
       System.out.println(ferrari.anoCompra);

       System.out.println(fusca.getNome());
       System.out.println(Carro.anoCompra);
    }
}
