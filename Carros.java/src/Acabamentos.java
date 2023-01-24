public class Acabamentos {

    private String verificarECorrigirErros;

    public Acabamentos() {
    }

    public Acabamentos(String verificarImperfeicoes) {
        this.verificarECorrigirErros = verificarECorrigirErros;

    }

    public void localizarECorrigirErros() {

        System.out.println(
                "Após a montagem e verificação da carroceria, o veiculo passa por uma fase de acabamentos, com o objetivo de localizar e corrigir pequenas imperfeições."
                        + isVerificarECorrigirErros());
    }

    public String isVerificarECorrigirErros() {
        return verificarECorrigirErros;
    }

    public void setVerificarECorrigirErros(String verificarECorrigirErros) {
        this.verificarECorrigirErros = verificarECorrigirErros;
    }

}