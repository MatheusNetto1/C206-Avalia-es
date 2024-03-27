package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arena arena = new Arena("Arena1", "Lugar da Arena1");

        int opcaoMenu;
        int opcaoSaida = 1;
        int opcaoCadastro = 1;

        String novoNomeRapper;
        float novaNotaRapper;
        int novaIdadeRapper;
        String novoMicrofone;


        while (opcaoSaida == 1) {
            System.out.println("\n\tBem vindo ao menu da Arena!");
            System.out.println("\nEscolha entre as opções abaixo:");
            System.out.println("1 Adicionar um novo Rapper");
            System.out.println("2 Mostrar informações da Arena e de seus Rappers");
            System.out.println("3 Mostrar qual Rapper tem microfone dourado");
            System.out.println("4 Mostrar qual Rapper ganhou a batalha e qual ficou em último lugar");

            System.out.print("Opção: ");
            opcaoMenu = sc.nextInt();
            sc.nextLine();

            switch (opcaoMenu) {
                case 1:
                    while (opcaoCadastro == 1){

                        System.out.print("\tNome: ");
                        novoNomeRapper = sc.nextLine();

                        System.out.print("\tNota: ");
                        novaNotaRapper = sc.nextFloat();

                        System.out.print("\tIdade: ");
                        novaIdadeRapper = sc.nextInt();
                        sc.nextLine();

                        System.out.print("\tMaterial do microfone: ");
                        novoMicrofone = sc.nextLine();

                        Rapper novoRapper = new Rapper(novoNomeRapper, novaNotaRapper, novaIdadeRapper, novoMicrofone);
                        arena.addRapper(novoRapper);

                        System.out.print("Gostaria de continuar o cadastro? (1 - sim | 0 - não) ");
                        do {
                            opcaoCadastro = sc.nextInt();
                        } while (opcaoCadastro != 0 && opcaoCadastro !=1);
                        sc.nextLine();
                    }
                    break;
                case 2:
                    arena.mostraInfo();
                    break;
                case 3:
                    arena.microfoneDou();
                    break;
                case 4:
                    arena.ranking();
                    break;
                default:
                    break;
            }

            System.out.print("Gostaria de voltar ao menu? (1 - sim | 0 - não) ");
            do {
                opcaoSaida = sc.nextInt();
            } while (opcaoSaida != 0 && opcaoSaida != 1);
            sc.nextLine();
        }

        sc.close();
    }
}