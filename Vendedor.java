public class Vendedor implements Visitante {
    public Vendedor(String nome){
        this.nome = nome;
    }
    private final String nome;
    public void visitEmpresa(Empresa e){

    }
    public void visitIndustria(Industria i){

    }
    public void visitResidencia(Residencia r){

    }
    public String getNome() {
        return nome;
    }
    
}
