package Candidatura;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Bruno", "Livia", "Andreza", "Vivian", "João"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean antedeu = false;

        do {
            antedeu = antedeu();
            continuarTentando = !antedeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Tentativas realizadas com Sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);
        if (antedeu) {
            System.out.println("Conseguimos contato com o" + candidato + "na" + tentativasRealizadas + "tentativa");
        } else {
            System.out.println("Não conseguimos o contato com o " + candidato + ", numeros maximos de tentativas realizadas" + tentativasRealizadas);
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Bruno", "Livia", "Andreza", "Vivian", "João"};
        System.out.println("Imprimindo a lista de candidatos informando o indice");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Bruna", "Carla", "Bruno", "Livia", "Andreza", "Vivian", "João", "Pedro", "Julia"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "solicitou esse valor de salario"+ salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato"+ candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com uma contra proposta");
        } else {
            System.out.println("Aguardando resultado dos candidatos restantes");
        }
    }
    static boolean antedeu() {
        return ThreadLocalRandom.current().nextBoolean();
    }
    }

