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

    private String fabricante;
    private String modelo;
    private int ano;
    private boolean carroLigado;

    public Carro(String fabricante, String modelo, int ano, boolean carroLigado, String sistemaEletrico) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.carroLigado = carroLigado;

    }

    public void mstrarInfoarmacoes() {

        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("O carro esta ligado?. " + isLigado());

    }

    public boolean ligarCarro() {

        if (!carroLigado) {

            System.out.println("O carro esta desligado. ");
        }
        System.out.println("Ligando o carro... " + isLigado());

        return true;
    }

    public boolean acelerar(Boolean acelerar, boolean parado) {
        if (!carroLigado) {
            System.out.println("Impossível acelerar, o carro esta parado.");
            return false;
        }

        System.out.println("Acelerando o carro");
        return true;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String setFabricante(String fabricante) {
        return this.fabricante = fabricante;

    }

    public String getModelo() {
        return modelo;
    }

    public String setModelo(String modelo) {
        return this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public int setAno(int ano) {
        return this.ano = ano;
    }

    public boolean isLigado() {

        return carroLigado;
    }

    public boolean setLigado(boolean motorLigado) {
        return this.carroLigado = motorLigado;
    }

}
