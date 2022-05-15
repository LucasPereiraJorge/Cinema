public class Programacao {
    private String nome;
    private int faixaEtaria;
    private int capacidade;

    public Programacao(String programacao){
        String[] entradaA = programacao.split(";", 3);
        this.nome = entradaA[0];
        this.faixaEtaria= Integer.parseInt(entradaA[1]);
        this.capacidade = Integer.parseInt(entradaA[2]);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setFaixaEtaria(int faixaEtaria){
        if(faixaEtaria.equalsIgnoreCase("L")){
            this.faixaEtaria = 0;
            return 0;
        } else{
            this.faixaEtaria = StringToInteger(faixaEtaria);
            return StringToInteger(faixaEtaria);
        }
    }

    public int getFaixaEtaria(){
        return faixaEtaria;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public int getCapacidade(){
        return capacidade;
    }
}