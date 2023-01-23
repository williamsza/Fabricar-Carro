public class Motor {

    private String valvulas;
    private String velasDeIgnicao;
    private String pistao;
    private String aneisDePistao;
    private String biela;
    private String virabrequim;
    private String blocoDoMotor;
    private String filtroDeOleo;
    private String radiador;
    private String reservatorio;

    public Motor(String valvulas, String velasDeIgnicao, String pistao, String aneisDePistao, String biela,
            String virabrequim, String blocoDoMotor, String filtroDeOleo, String radiador, String reservatorio) {
        this.valvulas = valvulas;
        this.velasDeIgnicao = velasDeIgnicao;
        this.pistao = pistao;
        this.aneisDePistao = aneisDePistao;
        this.biela = biela;
        this.virabrequim = virabrequim;
        this.blocoDoMotor = blocoDoMotor;
        this.filtroDeOleo = filtroDeOleo;
        this.radiador = radiador;
        this.reservatorio = reservatorio;
    }

    public void instalarMotor() {

        System.out.println("iniciando a montagem do motor....");

    }

    public String getValvulas() {
        return valvulas;
    }

    public void setValvulas(String valvulas) {
        this.valvulas = valvulas;
    }

    public String getVelasDeIgnicao() {
        return velasDeIgnicao;
    }

    public void setVelasDeIgnicao(String velasDeIgnicao) {
        this.velasDeIgnicao = velasDeIgnicao;
    }

    public String getPistao() {
        return pistao;
    }

    public void setPistao(String pistao) {
        this.pistao = pistao;
    }

    public String getAneisDePistao() {
        return aneisDePistao;
    }

    public void setAneisDePistao(String aneisDePistao) {
        this.aneisDePistao = aneisDePistao;
    }

    public String getBiela() {
        return biela;
    }

    public void setBiela(String biela) {
        this.biela = biela;
    }

    public String getVirabrequim() {
        return virabrequim;
    }

    public void setVirabrequim(String virabrequim) {
        this.virabrequim = virabrequim;
    }

    public String getBlocoDoMotor() {
        return blocoDoMotor;
    }

    public void setBlocoDoMotor(String blocoDoMotor) {
        this.blocoDoMotor = blocoDoMotor;
    }

    public String getFiltroDeOleo() {
        return filtroDeOleo;
    }

    public void setFiltroDeOleo(String filtroDeOleo) {
        this.filtroDeOleo = filtroDeOleo;
    }

    public String getRadiador() {
        return radiador;
    }

    public void setRadiador(String radiador) {
        this.radiador = radiador;
    }

    public String getReservatorio() {
        return reservatorio;
    }

    public void setReservatorio(String reservatorio) {
        this.reservatorio = reservatorio;
    }

}
