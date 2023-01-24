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
    private boolean acelerar;

    public Carro() {
    }

    public Carro(String fabricante, String modelo, int ano, boolean carroLigado) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.carroLigado = carroLigado;

    }

    public void mstrarInfoarmacoes() {

        System.out.println("O carro está ligado? " + isLigado());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Ano do Automóvel: " + getAno());
        System.out.println("Modelo do automóvel: " + getModelo());

    }

    public boolean ligarCarro() {

        if (carroLigado) {

            System.out.println("Ligando o carro... " + isLigado());
        }
        System.out.println("O carro esta desligado. " + !isLigado());

        return true;
    }

    public boolean acelerar(boolean b, boolean c) {

        if (!carroLigado) {

            System.out.println("Impossível acelerar, o carro esta parado.");
        }

        System.out.println("Acelerando o carro");
        return carroLigado;

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
