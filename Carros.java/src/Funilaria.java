public class Funilaria {
    private String pintura;
    private String pistolaDePintura;
    private String secador;
    private String martelinhoDeOuro;
    private String compressorDeAr;
    private String equipamentoDeProtecao;
    private String solda;
    private String alinhadorCiborg;
    private String repuxameiraEletrica;
    private String sistemaEletrico;

    public Funilaria() {
    }

    public Funilaria(String pintura, String pistolaDePintura, String secador, String martelinhoDeOuro,
            String compressorDeAr, String equipamentoDeProtecao, String solda, String alinhadorCiborg,
            String repuxameiraEletrica) {
        this.pintura = pintura;
        this.pistolaDePintura = pistolaDePintura;
        this.secador = secador;
        this.martelinhoDeOuro = martelinhoDeOuro;
        this.compressorDeAr = compressorDeAr;
        this.equipamentoDeProtecao = equipamentoDeProtecao;
        this.solda = solda;
        this.alinhadorCiborg = alinhadorCiborg;
        this.repuxameiraEletrica = repuxameiraEletrica;
    }

     public void mstrarInfoarmacoesFunilaria() {

    
      System.out.println("Pistola De Pintura: " + getPistolaDePintura());
      System.out.println("Secador: " + getSecador());
      System.out.println("Usar martelinho de ouro. " + getMartelinhoDeOuro());
      System.out.println("Compresor de ar. " + getCompressorDeAr());
      System.out.println("Equipamento de proteção " + getEquipamentoDeProtecao());
      System.out.println("Solda " + getSolda());
      System.out.println("Alinhador ciborg " + getAlinhadorCiborg());
      System.out.println("Repuxamento elétrico. " + getRepuxameiraEletrica());
     
     }

    public void iniciarFunilaria() {

        System.out.println("Peças são soldadas dando forma à carroceria do veiculo. ");

    }

    public void soldar() {

        System.out.println(
                "As partes da carroceria se encontram e começam a soldagem, cerca de 70% das soldagens são feitas por braços robóticos nos mais de cinco mil pontos de solda. ");

    }

    public void fazerPintura() {

        System.out
                .println("Já com a carroçaria verificada e completamente montada, o automóvel segue para a pintura. ");

        System.out.println(
                "Antes da pintura a carroceria passa por um pré-tratamento retirando impurezas do processo de soldagem, e depois o carro e mergulhado em um líquido nivelante e anticorrosivo.");

        System.out.println(
                "Depois o automóvel passa pelo processo de calafetação, que impermeabiliza o carro e logo em seguida ocorre a aplicação do prime, que deixa o veículo com a cor parecida com a definitiva.");

    }

    public String getPintura(String pintura) {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public String getPistolaDePintura() {
        return pistolaDePintura;
    }

    public void setPistolaDePintura(String pistolaDePintura) {
        this.pistolaDePintura = pistolaDePintura;
    }

    public String getSecador() {
        return secador;
    }

    public void setSecador(String secador) {
        this.secador = secador;
    }

    public String getMartelinhoDeOuro() {
        return martelinhoDeOuro;
    }

    public void setMartelinhoDeOuro(String martelinhoDeOuro) {
        this.martelinhoDeOuro = martelinhoDeOuro;
    }

    public String getCompressorDeAr() {
        return compressorDeAr;
    }

    public void setCompressorDeAr(String compressorDeAr) {
        this.compressorDeAr = compressorDeAr;
    }

    public String getEquipamentoDeProtecao() {
        return equipamentoDeProtecao;
    }

    public void setEquipamentoDeProtecao(String equipamentoDeProtecao) {
        this.equipamentoDeProtecao = equipamentoDeProtecao;
    }

    public String getSolda() {
        return solda;
    }

    public void setSolda(String solda) {
        this.solda = solda;
    }

    public String getAlinhadorCiborg() {
        return alinhadorCiborg;
    }

    public void setAlinhadorCiborg(String alinhadorCiborg) {
        this.alinhadorCiborg = alinhadorCiborg;
    }

    public String getRepuxameiraEletrica() {
        return repuxameiraEletrica;
    }

    public void setRepuxameiraEletrica(String repuxameiraEletrica) {
        this.repuxameiraEletrica = repuxameiraEletrica;
    }

    public String getSistemaEletrico() {
        return sistemaEletrico;
    }

    public void setSistemaEletrico(String sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
    }

    public String getPintura() {
        return pintura;
    }

}
