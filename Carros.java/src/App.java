public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Cars!");

        Carro c1 = new Carro("Volkswagen", "Fusca", 1985, false, null);
        System.out.println(c1.setAno(1981));
        System.out.print(c1.setFabricante("Volkswagen"));
        System.out.println(c1.setFabricante("Volkswagen"));
        System.out.println(c1.setModelo("Brasilia"));
        System.out.println(c1.setLigado(true));
      
        

        Funilaria funilaria = new Funilaria(null, null, null, null, null, null, null, null, null);
        funilaria.setPintura(null);
        funilaria.setSolda(null);
        funilaria.soldar();

        Monobloco eixos = new Monobloco(null, null, null, null);
        eixos.adiconarEixos();
        eixos.montarCarrocerria();

    }
}
