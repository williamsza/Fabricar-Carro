public class TestaCarro {
    public static void main(String[] args) throws Exception {

        System.out.println("-----------------------------------------------------------------");

        Monobloco eixos = new Monobloco();
        eixos.adiconarEixos();
        eixos.montarCarrocerria();

        System.out.println("------------------------------------------------------------------");

        Motor motor = new Motor();
        motor.instalarMotor();

        System.out.println("----------------------------------------------------------------");

        Funilaria funilaria = new Funilaria();
        funilaria.soldar();
        funilaria.fazerPintura();

        System.out.println("--------------------------------------------------------------------");

        Acabamentos acabamentos = new Acabamentos();
        acabamentos.localizarECorrigirErros();

        System.out.println("--------------------------------------------------------------------");

        Carro brasilia = new Carro();
        brasilia.setAno(1981);
        brasilia.setFabricante("Volkswagen");
        brasilia.setModelo("Brasilia");
        brasilia.acelerar(true, true);
        brasilia.mstrarInfoarmacoes();

        System.out.println("--------------------------------------------------------------------");

        Carro fusca = new Carro();
        fusca.setAno(1950);
        fusca.setFabricante("Volkswagen");
        fusca.setModelo("Fusca");
        fusca.isLigado();
        fusca.acelerar(true, false);
        fusca.setAno(1950);
        fusca.mstrarInfoarmacoes();

        System.out.println("--------------------------------------------------------------------");

        Carro golQuadrado = new Carro();
        golQuadrado.setAno(1994);
        golQuadrado.setFabricante("Volkswagen");
        golQuadrado.setModelo("Gol quadrado");
        golQuadrado.isLigado();
        golQuadrado.acelerar(false, true);
        golQuadrado.mstrarInfoarmacoes();

        
    }

}
