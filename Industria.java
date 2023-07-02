public class Industria implements Local{
    public Industria(String cnpj) {
        this.cnpj = cnpj;
        this.seguroDanosMeiosAmbiente = false;
        this.seguroExplosaoIncendio = false;
        this.seguroRouboFurto = false;
        this.seguroTerceiros = false;
    }

    public Industria(String cnpj, boolean seguroRouboFurto, boolean seguroExplosaoIncendio,
            boolean seguroDanosMeiosAmbiente, boolean seguroTerceiros) {
        this.cnpj = cnpj;
        this.seguroRouboFurto = seguroRouboFurto;
        this.seguroExplosaoIncendio = seguroExplosaoIncendio;
        this.seguroDanosMeiosAmbiente = seguroDanosMeiosAmbiente;
        this.seguroTerceiros = seguroTerceiros;
    }

    private final String cnpj;
    private boolean seguroRouboFurto;
    private boolean seguroExplosaoIncendio;
    private boolean seguroDanosMeiosAmbiente;
    private boolean seguroTerceiros;
    public void aceitar(Visitante v){
        v.visitIndustria(this);
    }
    public boolean temSeguroRouboFurto() {
        return seguroRouboFurto;
    }
    public void setSeguroRouboFurto(boolean seguroRouboFurto) {
        this.seguroRouboFurto = seguroRouboFurto;
    }
    public boolean temSeguroExplosaoIncendio() {
        return seguroExplosaoIncendio;
    }
    public void setSeguroExplosaoIncendio(boolean seguroExplosaoIncendio) {
        this.seguroExplosaoIncendio = seguroExplosaoIncendio;
    }
    public boolean temSeguroDanosMeiosAmbiente() {
        return seguroDanosMeiosAmbiente;
    }
    public void setSeguroDanosMeiosAmbiente(boolean seguroDanosMeiosAmbiente) {
        this.seguroDanosMeiosAmbiente = seguroDanosMeiosAmbiente;
    }
    public boolean temSeguroTerceiros() {
        return seguroTerceiros;
    }
    public void setSeguroTerceiros(boolean seguroTerceiros) {
        this.seguroTerceiros = seguroTerceiros;
    }
    public String getCnpj() {
        return cnpj;
    } 
}
