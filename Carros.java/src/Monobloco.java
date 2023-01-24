public class Monobloco {

    private String chassi;
    private String carroceria;
    private String eixos;
    private String suspensao;

    
    public Monobloco() {
    }

    public Monobloco(String chassi, String carroceria, String eixos, String suspensao) {
        this.chassi = chassi;
        this.carroceria = carroceria;
        this.eixos = eixos;
        this.suspensao = suspensao;
    }

    public void adiconarEixos() {
        System.out.println("Instalando os eixos dianteiros e trazeiros; "+getEixos());

    }

    public void montarCarrocerria() {
        System.out.println("Na fase de montagem da carrocerria, procede-se à acoplagem das várias partes do veículo e a sua soldagem, trabalho essencialmente realizado por robots."+ getCarroceria());

    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getEixos() {
        return eixos;
    }

    public void setEixos(String eixos) {
        this.eixos = eixos;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }
    

}
