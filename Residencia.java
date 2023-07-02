public class Residencia implements Local{
    public Residencia(int numero, int qtdPessoas){
        this.numero = numero;
        this.qtdPessoas=qtdPessoas;
        this.seguroAutomovel = false;
        this.seguroMoradia = false;
        this.qtdSeguroVida = 0;
    }
    
    public Residencia(int numero, int qtdPessoas, boolean seguroMoradia, boolean seguroAutomovel,
            int qtdSeguroVida) {
        this.numero = numero;
        this.qtdPessoas = qtdPessoas;
        this.seguroMoradia = seguroMoradia;
        this.seguroAutomovel = seguroAutomovel;
        this.qtdSeguroVida = qtdSeguroVida;
    }

    private final int numero;
    private int qtdPessoas;
    private boolean seguroMoradia;
    private boolean seguroAutomovel;
    private int qtdSeguroVida;

    public void aceitar(Visitante v){
        v.visitResidencia(this);
    }
    
        public int getNumero() {
        return numero;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public boolean isTemSeguroMoradia() {
        return seguroMoradia;
    }

    public void setTemSeguroMoradia(boolean seguroMoradia) {
        this.seguroMoradia = seguroMoradia;
    }

    public boolean seguroAutomovel() {
        return seguroAutomovel;
    }

    public void setSeguroAutomovel(boolean seguroAutomovel) {
        this.seguroAutomovel = seguroAutomovel;
    }

    public int getSeguroVida() {
        return qtdSeguroVida;
    }

    public void setSeguroVida(int qtdSeguroVida) {
        this.qtdSeguroVida = qtdSeguroVida;
    }
}