public class Vendedor implements Visitante {
    public Vendedor(String nome, Seguradora seguradora){
        this.nome = nome;
        this.s = seguradora;
    }
    private final String nome;
    private Seguradora s;
    public void visitEmpresa(Empresa e){
        Randomizer rand = Randomizer.getRandom();
        System.out.println("Vendedor: Bom dia, voces conhecem a seguradora TUDO SEGURO? Querem fazer um plano com a gente?");
        if((e.temSeguroEstagiario() == true) || (e.temSeguroOdontologico() == true) || (e.temSeguroResponCivil() == true) || (e.temSeguroSaude() != 0)){
            System.out.println("Secretario: Bom dia, nos ja usamos o plano de seguros de voces. \nVendedor: Que bom, ficamos feliz em poder ajudar, ate mais!");
            return;
        }
        else{ System.out.println("Secretario: Bom dia, nao conhecemos.\nVendedor: Nos da TUDO SEGURO temos os melhores planos para voce");
            System.out.printf("Vendedor: Preciso saber o cnpj da empresa e quantas pessoas trabalham nela.\nSecretario: O cnpj e %s e trabalham %d pessoas\n", e.getCnpj(),e.getQtdEquipe());
            int qtd = e.getQtdEquipe();
            System.out.printf("Vendedor: Temos o plano de responsabilidade civil, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroResponCivil());
            if(rand.getNextRandom(2) == 1){
                System.out.println("Secretario: Sim, por favor.");
                e.setSeguroResponCivil(true);
                s.setRenda(s.getRenda()+s.getVlSeguroResponCivil());
            }
            else System.out.println("Secretario: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano de seguro estagiario, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroEstagiario());
            if(rand.getNextRandom(2) == 1){
                System.out.println("Secretario: Sim, por favor.");
                e.setSeguroEstagiario(true);
                s.setRenda(s.getRenda()+s.getVlSeguroEstagiario());
            }
            else System.out.println("Secretario: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano de seguro odontologico, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroOdontologico());
            if(rand.getNextRandom(2) == 1){
                System.out.println("Secretario: Sim, por favor.");
                e.setSeguroOdontologico(true);
                s.setRenda(s.getRenda()+s.getVlSeguroOdontologico());
            }
            else System.out.println("Secretario: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano de seguro de saude para os empregados, ele custa R$%f por empregado. Gostariam de assinar ele?\n",s.getVlSeguroSaude());
            if(rand.getNextRandom(2) == 1){
                System.out.println("Secretario: Sim, por favor.");
                e.setSeguroSaude(qtd);
                s.setRenda(s.getRenda()+(s.getVlSeguroSaude() * qtd));
            }
            else System.out.println("Secretario: Nao, obrigado.");
        }
    }


    public void visitIndustria(Industria i){
        Randomizer rand = Randomizer.getRandom();
        System.out.println("Vendedor: Bom dia, voces conhecem a seguradora TUDO SEGURO? Querem fazer um plano com a gente?");
        if((i.temSeguroDanosMeiosAmbiente() == true) || (i.temSeguroExplosaoIncendio() == true) || (i.temSeguroRouboFurto() == true) || (i.temSeguroTerceiros() == true)){
            System.out.println("Operario: Bom dia, nos ja usamos o plano de seguros de voces. \nVendedor: Que bom, ficamos feliz em poder ajudar, ate mais!");
            return;
        }
        else{ System.out.println(" Operario: Bom dia, nao conhecemos.\nVendedor: Nos da TUDO SEGURO temos os melhores planos para voce");
            System.out.printf("Vendedor: Preciso saber o cnpj da industria.\n Operario: O cnpj e %s\n", i.getCnpj());
            System.out.printf("Vendedor: Temos o plano de danos ao meio ambiente, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroDanosMeiosAmbiente());
            if(rand.getNextRandom(2) == 1){
                System.out.println(" Operario: Sim, por favor.");
                i.setSeguroDanosMeiosAmbiente(true);
                s.setRenda(s.getRenda()+s.getVlSeguroDanosMeiosAmbiente());
            }
            else System.out.println(" Operario: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano de explosao e incendio, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroExplosaoIncendio());
            if(rand.getNextRandom(2) == 1){
                System.out.println(" Operario: Sim, por favor.");
                i.setSeguroExplosaoIncendio(true);
                s.setRenda(s.getRenda()+s.getVlSeguroExplosaoIncendio());
            }
            else System.out.println(" Operario: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano de roubo e furto, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroRouboFurto());
            if(rand.getNextRandom(2) == 1){
                System.out.println(" Operario: Sim, por favor.");
                i.setSeguroRouboFurto(true);
                s.setRenda(s.getRenda()+s.getVlSeguroRouboFurto());
            }
            else System.out.println(" Operario: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano de danos a terceiros, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroTerceiros());
            if(rand.getNextRandom(2) == 1){
                System.out.println(" Operario: Sim, por favor.");
                i.setSeguroTerceiros(true);
                s.setRenda(s.getRenda()+s.getVlSeguroTerceiros());
            }
            else System.out.println(" Operario: Nao, obrigado.");
        }
    }


    public void visitResidencia(Residencia r){
        Randomizer rand = Randomizer.getRandom();
        System.out.println("Vendedor: Bom dia, voces conhecem a seguradora TUDO SEGURO? Querem fazer um plano com a gente?");
        if((r.temSeguroAutomovel() == true) || (r.temSeguroMoradia() == true) || (r.qtdSeguroVida() != 0)){
            System.out.println("Morador: Bom dia, nos ja usamos o plano de seguros de voces. \nVendedor: Que bom, ficamos feliz em poder ajudar, ate mais!");
            return;
        }
        else{ System.out.println("Morador: Bom dia, nao conhecemos.\nVendedor: Nos da TUDO SEGURO temos os melhores planos para voce");
            System.out.printf("Vendedor: Preciso saber o numero da casa e quantas pessoas trabalham nela.\nMorador: O nuemro e %d e moram %d pessoas nessa casa\n", r.getNumero(),r.getQtdPessoas());
            int qtd = r.getQtdPessoas();
            System.out.printf("Vendedor: Temos o plano de seguro automovel, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroAutomovel());
            if(rand.getNextRandom(2) == 1){
                System.out.println("Morador: Sim, por favor.");
                r.setSeguroAutomovel(true);
                s.setRenda(s.getRenda()+s.getVlSeguroAutomovel());
            }
            else System.out.println("Morador: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano seguro moradia, ele custa R$%f. Gostariam de assinar ele?\n",s.getVlSeguroMoradia());
            if(rand.getNextRandom(2) == 1){
                System.out.println("Morador: Sim, por favor.");
                r.setSeguroMoradia(true);
                s.setRenda(s.getRenda()+s.getVlSeguroMoradia());
            }
            else System.out.println("Morador: Nao, obrigado.");
            System.out.printf("Vendedor: Temos tambem o plano de seguro de vida, ele custa R$%f por pessoa. Gostariam de assinar ele?\n",s.getVlSeguroVida());
            if(rand.getNextRandom(2) == 1){
                System.out.println("Morador: Sim, por favor.");
                r.setSeguroVida(qtd);
                s.setRenda(s.getRenda()+(s.getVlSeguroVida()*qtd));
            }
            else System.out.println("Morador: Nao, obrigado.");
        }
    }
    public String getNome() {
        return nome;
    }
    public Seguradora getSeguradora() {
        return s;
    }
    
}
