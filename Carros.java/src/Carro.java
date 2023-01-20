/***
 * 2 ) Descreva em no máximo 200 palavras o que é um automóvel e o que ele faz.
 * Liste os substantivos e verbos separadamente.
 * 
 * Cada substantivo corresponde a um objeto que precisará ser construído
 * para implementar um sistema, nesse caso, um carro.
 * 
 * Selecione 5 dos objetos que você listou e, para cada um,liste vários
 * atributos e comportamentos.
 * 
 * Descreva brevemente como esses objetos interagem entre si e com
 * outros objetos na sua descrição.
 * 
 * Estes passos que você seguiu são típicos do projeto orientado a objetos.
 */

public class Carro {

    private String motor;
    private String funilaria;
   
    private String monoBloco;
    private String montagem;
    private String sistemaEletrico;

    // Contrutor
    public Carro() {
        this.motor = motor;
        this.funilaria = funilaria;
        this.monoBloco = monoBloco;
        this.montagem = montagem;
        this.sistemaEletrico = sistemaEletrico;
    }

    

    public void fazerFunilaria() {

        System.out.println("Após a finalização do motor será iniciaado a funilaria....");

    }

    public void fazerPintura() {

        System.out.println("Após a finalização da funilaria, será iniciada a pintura. ");

    }

    public void montarCarrocerria() {

    }

    public void realizarMontagem() {

        System.out.println("Após a finalização da pintura, será iniciada a montagem. ");

    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getFunilaria() {
        return funilaria;
    }

    public void setFunilaria(String funilaria) {
        this.funilaria = funilaria;
    }

   


    public String getMonoBloco() {
        return monoBloco;
    }

    public void setMonoBloco(String carroceria) {
        this.monoBloco = carroceria;
    }

    public String getMontagem() {
        return montagem;
    }

    public void setMontagem(String montagem) {
        this.montagem = montagem;
    }

    public String getSistemaEletrico() {
        return sistemaEletrico;
    }

    public void setSistemaEletrico(String sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
    }

}
