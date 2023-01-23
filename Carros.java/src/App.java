public class App {
    public static void main(String[] args) throws Exception {
       
        Carro carro = new Carro("Volkswagen", "Fusca", 1985, false, null);
        carro.setAno(0);
        carro.setFabricante("Volkswagen");
        carro.setModelo("Brasilia");
        carro.setLigado(false);
        carro.acelerar(true, false);

        Funilaria funilaria = new Funilaria(null, null, null, null, null, null, null, null, null);
        funilaria.mstrarInfoarmacoesFunilaria();
        funilaria.fazerPintura();
        funilaria.soldar();
        
        Monobloco eixos = new Monobloco(null, null, null, null);
        eixos.adiconarEixos();
        eixos.montarCarrocerria();
        eixos.getCarroceria();
        eixos.getChassi();
        eixos.getSuspensao();
        
        Motor motor = new Motor(null, null, null, null, null, null, null, null, null, null);
        motor.instalarMotor();
        motor.getAneisDePistao();
        motor.getRadiador();
        motor.getValvulas();
        motor.getVelasDeIgnicao();

        Acabamentos acabamentos = new Acabamentos(null);
        acabamentos.localizarEcorrigirErros();
      

    }
}
