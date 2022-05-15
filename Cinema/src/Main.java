import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Agendamento
        List<Programacao> programacosCinema = new ArrayList<>();
        System.out.print("Insira o numero de entrada: ");
        Scanner scr = new Scanner(System.in);
        int numeroEntrada = scr.nextInt();
        for (int i=0; i<numeroEntrada; i++){
            System.out.printf("Entrada de Agendamento: \n", (i+1));

            Scanner scr2 = new Scanner(System.in);
            String entradaA = scr2.nextLine();
            Programacao programacaoCinema = new Programacao(entradaA);
            programacosCinema.add(programacaoCinema);
        }

        //Programacao
        List<Agendamentos> agendamentos = new ArrayList<>();
        System.out.println("Insira o Numero de Entrada de Dados: ");
        Scanner scr2 = new Scanner(System.in);
        numeroEntrada = scr2.nextInt();
        for (int i=0; i<numeroEntrada; i++){
            Scanner scr3 = new Scanner(System.in);
            System.out.printf("Programação: \n", (i+1));

            String entrada = scr3.nextLine();
            Agendamentos agendamento = new Agendamentos(entrada);
            agendamentos.add(agendamento);

        }

        //Saida
        StringBuilder saidaString = new StringBuilder();
        for (Programacao prog : programacosCinema){
            String nomeFilme = prog.getNome();
            int faixaEtaria = prog.getFaixaEtaria();
            saidaString.append(nomeFilme).append("\n");

            for (Agendamentos ag : agendamentos){
                if (nomeFilme.equalsIgnoreCase(ag.getFilme())){
                    if(ag.getIdade() >= faixaEtaria){
                        saidaString.append("  ").append(ag.getNome()).append("\n");
                    }
                }
            }
        }
        System.out.println(String.valueOf(saidaString));
    }
    }
