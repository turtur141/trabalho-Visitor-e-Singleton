public class Acionador implements Visitante{
    public Acionador(String nome, Seguradora seguradora){
        this.nome = nome;
        this.s = seguradora;
    }
    private final String nome;
    private Seguradora s;
    public void visitEmpresa(Empresa e){

    }
    public void visitIndustria(Industria i){

    }
    public void visitResidencia(Residencia r){

    }
    public String getNome() {
        return nome;
    }
    public Seguradora getSeguradora() {
        return s;
    }
}
