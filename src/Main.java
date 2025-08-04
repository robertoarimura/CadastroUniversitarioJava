import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        System.out.print("Quantos membros acadêmicos deseja adicionar?: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < quantidade; i++){
            System.out.printf("\nMembro %d: \n", i + 1);
            System.out.print("É Aluno, Professor ou Monitor?: ");
            String tipo = sc.nextLine().trim().toLowerCase();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();

            switch (tipo) {
                case "aluno" -> {
                    System.out.print("Horas de estudo: ");
                    int horasEstudoMensal = sc.nextInt();
                    sc.nextLine();

                    pessoas.add(new Aluno(nome, matricula, horasEstudoMensal));
                }
                case "professor" -> {
                    System.out.print("Aulas ministradas: ");
                    int aulasMinistradas = sc.nextInt();
                    sc.nextLine();

                    pessoas.add(new Professor(nome, matricula, aulasMinistradas));
                }
                case "monitor" -> {
                    System.out.print("Horas de monitoria: ");
                    int horasMonitoria = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = sc.nextLine();
                    System.out.println();
                    pessoas.add(new Monitor(nome, matricula, horasMonitoria, disciplina));
                }
                default -> {
                    System.out.println("Tipo inválido. Pulando membro.");
                    i--;
                }
            }
        }

        System.out.println("\n--- Membros Cadastrados ---");
        for (Pessoa p : pessoas){
            System.out.println();
            p.mostrarDados();
            if (p instanceof MembroUniversitario m) {
                m.apresentar();
                System.out.printf("Atividade mensal (pontuação): %.2f%n", m.calcularAtividadeMensal());
            }
        }
        sc.close();
        }

}
