import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Funcionario func;
    double soma = 0;

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    int op = 0;
    int opsn = 0;

    while (op != 7) {

      System.out.println("\u001B[47m");
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("----------Menu----------");
      
       System.out.println("\u001B[36m");
       System.out.flush();
      System.out.println("1. Cadastrar novo funcionário");
      System.out.println("2. Listar os funcionários cadastrados");
      System.out.println("3. Listar salários dos funcionários");
      System.out.println("4. Apresentar total dos salários dos funcionários");
      System.out.println("5. Apresentar total de horas trabalhadas por todos os funcionários");
      System.out.println("6. Sair");
       System.out.println("\u001B[37m");
      System.err.println("Digite a opção desejada: ");
      op = s.nextInt();
      s.nextLine();

      if (op == 1) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------Cadastro----------\n");

        System.out.println("Digite o nome do funcionário: ");
        String nome = s.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------Cadastro----------\n");

        System.out.println("Digite o telefone do funcionário: ");
        String telefone = s.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------Cadastro----------\n");

        System.out.println("Digite o email do funcionário:");
        String email = s.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------Cadastro----------\n");

        System.out.println("Digite as horas trabalhadas pelo funcionário: ");
        int horasTrabalhadas = s.nextInt();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("----------Cadastro----------\n");

        System.out.println("Digite o valor ganho por hora pelo funcionário:");
        double valorPorh = s.nextDouble();

        func = new Funcionario(nome, telefone, email, horasTrabalhadas, valorPorh);

        funcionarios.add(func);

        System.out.print("\033[H\033[2J");
        System.out.flush();

      } else if (op == 2) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("--------Funcionários--------\n");
        System.out.println("Lista de funcionários: \n");
        for (int i = 0; i < funcionarios.size(); i++) {
          func = funcionarios.get(i);
          System.out.println(func.getNome() + " - " + func.getTelefone() + " - " + func.getEmail());
        }
        System.out.println("\nDigite <ENTER> para sair desta aba");
        s.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

      } else if (op == 3) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("----------Salários----------\n");
        System.out.println("Lista de salários:");

        for (int i = 0; i < funcionarios.size(); i++) {
          func = funcionarios.get(i);
          System.out.printf("%s - R$ %.2f\n", func.getNome(), func.calcularSalario());
        }
        System.out.println("\nDigite <ENTER> para sair desta aba");
        s.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

      } else if (op == 4) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("-------Pagamento total-------\n");
        System.out.print("Total de Salários: ");

        soma = 0;

        for (int i = 0; i < funcionarios.size(); i++) {
          func = funcionarios.get(i);

          soma = soma + func.calcularSalario();

        }

        System.out.printf("\nR$ %.2f\n", soma);

        System.out.println("\nDigite <ENTER> para sair desta aba");
        s.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

      } else if (op == 5) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("--------Horas total--------\n");
        System.out.print("Total de horas: \n");

        soma = 0;

        for (int i = 0; i < funcionarios.size(); i++) {
          func = funcionarios.get(i);

          soma = soma + func.getHorasTrabalhadas();

        }

        System.out.println((int) soma + "h");

        System.out.println("\nDigite <ENTER> para sair desta aba");
        s.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

      } else if (op == 6) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Deseja mesmo sair? \n 1 - Sim \n 2 - Não");
        opsn = s.nextInt();

        if (opsn == 1) {
          op = 7;
        } else {
          System.out.print("\033[H\033[2J");
          System.out.flush();
        }
      }

    }

  }
}