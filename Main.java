import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Local> mapa = new ArrayList<Local>();
        Randomizer rand = Randomizer.getRandom();
        GeraCnpj g = new GeraCnpj();
        for(int j = 0; j<20;j++){
            int opcao = rand.getNextRandom(3);
            if(opcao == 1){
                Residencia r = new Residencia(j+10,rand.getNextRandom(10));
                mapa.add(r);
            }
            if(opcao == 2){
                Empresa e = new Empresa(g.NovoCnpj(), rand.getNextRandom(30));
                mapa.add(e);
            }
            if(opcao == 3){
                Industria i = new Industria(g.NovoCnpj());
                mapa.add(i);
            }
        }
        Seguradora seguradora = Seguradora.getSeguradora();
        int k =0;
        for(Local l :mapa){
            k++;
            System.out.println("\n\n\nVendedor: *toc* *toc* *toc*");
            int random = rand.getNextRandom(10);
            if(random == 1)
                System.out.println("*Ninguem atendeu*");
            else{
                l.aceitar(seguradora.getVendedor());
            }
            if(k<20)
                System.out.println("*Indo ate a proxima casa...*");
        }
        System.out.printf("Renda final da seguradora: R$%f", seguradora.getRenda());
    }
}
