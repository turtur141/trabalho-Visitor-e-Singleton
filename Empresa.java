public class Empresa implements Local {
    
    
    public Empresa(String cnpj, int qtdEquipe) {
        this.cnpj = cnpj;
        this.qtdEquipe = qtdEquipe;
        this.seguroEstagiario = false;
        this.seguroOdontologico = false;
        this.seguroSaude = 0;
        this.seguroResponCivil = false;
    }
    
    public Empresa(String cnpj, int qtdEquipe, boolean seguroResponCivil, int seguroSaude, boolean seguroEstagiario,
            boolean seguroOdontologico) {
        this.cnpj = cnpj;
        this.qtdEquipe = qtdEquipe;
        this.seguroResponCivil = seguroResponCivil;
        this.seguroSaude = seguroSaude;
        this.seguroEstagiario = seguroEstagiario;
        this.seguroOdontologico = seguroOdontologico;
    }

    private final String cnpj;
    private int qtdEquipe;
    private boolean seguroResponCivil;
    private int seguroSaude;
    private boolean seguroEstagiario;
    private boolean seguroOdontologico;
    public void aceitar(Visitante v){
        v.visitEmpresa(this);
    }
    
    public int getQtdEquipe() {
        return qtdEquipe;
    }

    public void setQtdEquipe(int qtdEquipe) {
        this.qtdEquipe = qtdEquipe;
    }

    public boolean temSeguroResponCivil() {
        return seguroResponCivil;
    }
    public void setSeguroResponCivil(boolean seguroResponCivil) {
        this.seguroResponCivil = seguroResponCivil;
    }
    public int temSeguroSaude() {
        return seguroSaude;
    }
    public void setSeguroSaude(int seguroSaude) {
        this.seguroSaude = seguroSaude;
    }
    public boolean temSeguroEstagiario() {
        return seguroEstagiario;
    }
    public void setSeguroEstagiario(boolean seguroEstagiario) {
        this.seguroEstagiario = seguroEstagiario;
    }
    public boolean temSeguroOdontologico() {
        return seguroOdontologico;
    }
    public void setSeguroOdontologico(boolean seguroOdontologico) {
        this.seguroOdontologico = seguroOdontologico;
    }

    public String getCnpj() {
        return cnpj;
    }
    
}
