import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Local> mapa = new ArrayList<Local>();
        Random rand = Random.getRandom();
        for(int i = 0; i<20;i++){
            int opcao = rand.getNextRandom(3);
            if(opcao == 1){
                Residencia r = new Residencia(i+10,rand.getNextRandom(10));
                mapa.add(r);
            }
            if(opcao == 2){
                Empresa e = new Empresa("XX.XXX.XXX/XXXX-XX", rand.getNextRandom(8));
                mapa.add(e);
            }
            if(opcao == 3){
                Industria i = new Industria("XX.XXX.XXX/XXXX-XX");
                mapa.add(i);
            }
        }
        Seguradora seguradora = Seguradora.getSeguradora();

        for(Local l :mapa){
            System.out.println("Vendedor: toc toc toc");
            int random = 1 + (int) (Math.random() * 10);
            if(random == 1)
                System.out.println("*Ninguém atendeu*");
            else{
                l.aceitar(seguradora.getV());
            }
        }
    }
}
