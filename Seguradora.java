public final class Seguradora {
    
    private Seguradora() {
        this.renda = 10000.0;
        Vendedor v = new Vendedor("Artur");
        Acionador a = new Acionador("Guilherme");
        this.vlSeguroAutomovel = 3600;
        this.vlSeguroDanosMeiosAmbiente = 3000;
        this.vlSeguroEstagiario = 200;
        this.vlSeguroExplosaoIncendio = 500;
        this.vlSeguroMoradia = 450;
        this.vlSeguroOdontologico = 250;
        this.vlSeguroRouboFurto = 1000;
        this.vlSeguroSaude = 7200;
        this.vlSeguroTerceiros = 500;
        this.vlSeguroResponCivil = 1500;
    }

    private static Seguradora s = null;
    private double renda;
    private Vendedor v;
    private Acionador a;
    private double vlSeguroAutomovel;
    private double vlSeguroDanosMeiosAmbiente;
    private double vlSeguroEstagiario;
    private double vlSeguroExplosaoIncendio;
    private double vlSeguroMoradia;
    private double vlSeguroOdontologico;
    private double vlSeguroRouboFurto;
    private double vlSeguroSaude;
    private double vlSeguroTerceiros;
    private double vlSeguroResponCivil;
    public double getRenda() {
        return renda;
    }
    public static Seguradora getSeguradora(){
        if(s == null)
            s = new Seguradora();
        return s;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
    public Vendedor getV() {
        return v;
    }
    public Acionador getA() {
        return a;
    }
    public double getVlSeguroAutomovel() {
        return vlSeguroAutomovel;
    }
    public void setVlSeguroAutomovel(double vlSeguroAutomovel) {
        this.vlSeguroAutomovel = vlSeguroAutomovel;
    }
    public double getVlSeguroDanosMeiosAmbiente() {
        return vlSeguroDanosMeiosAmbiente;
    }
    public void setVlSeguroDanosMeiosAmbiente(double vlSeguroDanosMeiosAmbiente) {
        this.vlSeguroDanosMeiosAmbiente = vlSeguroDanosMeiosAmbiente;
    }
    public double getVlSeguroEstagiario() {
        return vlSeguroEstagiario;
    }
    public void setVlSeguroEstagiario(double vlSeguroEstagiario) {
        this.vlSeguroEstagiario = vlSeguroEstagiario;
    }
    public double getVlSeguroExplosaoIncendio() {
        return vlSeguroExplosaoIncendio;
    }
    public void setVlSeguroExplosaoIncendio(double vlSeguroExplosaoIncendio) {
        this.vlSeguroExplosaoIncendio = vlSeguroExplosaoIncendio;
    }
    public double getVlSeguroMoradia() {
        return vlSeguroMoradia;
    }
    public void setVlSeguroMoradia(double vlSeguroMoradia) {
        this.vlSeguroMoradia = vlSeguroMoradia;
    }
    public double getVlSeguroOdontologico() {
        return vlSeguroOdontologico;
    }
    public void setVlSeguroOdontologico(double vlSeguroOdontologico) {
        this.vlSeguroOdontologico = vlSeguroOdontologico;
    }
    public double getVlSeguroRouboFurto() {
        return vlSeguroRouboFurto;
    }
    public void setVlSeguroRouboFurto(double vlSeguroRouboFurto) {
        this.vlSeguroRouboFurto = vlSeguroRouboFurto;
    }
    public double getVlSeguroSaude() {
        return vlSeguroSaude;
    }
    public void setVlSeguroSaude(double vlSeguroSaude) {
        this.vlSeguroSaude = vlSeguroSaude;
    }
    public double getVlSeguroTerceiros() {
        return vlSeguroTerceiros;
    }
    public void setVlSeguroTerceiros(double vlSeguroTerceiros) {
        this.vlSeguroTerceiros = vlSeguroTerceiros;
    }
    public double getVlSeguroResponCivil() {
        return vlSeguroResponCivil;
    }
    public void setVlSeguroResponCivil(double vlSeguroResponCivil) {
        this.vlSeguroResponCivil = vlSeguroResponCivil;
    }

}