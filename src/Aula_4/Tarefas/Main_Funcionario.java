package Aula_4.Tarefas;

import java.util.Scanner;

public class Main_Funcionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opt = "";
        Funcionario f = null;
        
        int cracha;
        String nome;
        char tipoVinculo;
        float valorHora, qtdeHora, salario, valorDesconto;
        
        while(!opt.equals("4")) {
            System.out.println("\n\n1- Cadastrar\n2- Consultar\n3- Alterar\n4- Sair");
            System.out.print("Opcao: ");
            opt =  scan.next();
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1": // cadastrar
                    System.out.print("Cracha: ");
                    cracha = scan.nextInt();
                    System.out.print("Nome: ");
                    nome = scan.next();
                    System.out.print("Tipo Vinculo (N)ormal ou (H)orista: ");
                    tipoVinculo =  scan.next().charAt(0);
                    System.out.print("Valor Desconto: ");
                    valorDesconto = scan.nextFloat();
                    
                    f = new Funcionario();
                    f.setCracha(cracha);
                    f.setNome(nome);
                    f.setTipoVinculo(tipoVinculo);
                    f.setValorDesconto(valorDesconto);
                    
                    if (f.getTipoVinculo() == 'H') {
                        System.out.print("Quantidade Hora: ");
                        qtdeHora = scan.nextFloat();
                        System.out.print("Valor hora: ");
                        valorHora = scan.nextFloat();
                        
                        f.setValorHora(valorHora);
                        f.setQtdeHora(qtdeHora);
                        salario = f.calcularSalario();
                    } else {
                        System.out.print("Salario: ");
                        salario = scan.nextFloat();
                    }
                    
                    f.setSalario(salario);
                    break;
                case "2":
                    if (f != null) {
                         System.out.println(f.imprimir());
                    } else {
                        System.out.println("\n\n## Funcionario não foi cadastrada!");
                    }
                    break;
                case "3":
                    if (f == null) {
                        System.out.println("\n\n## Funcionario não foi cadastrada!");
                        break;
                    }
                    
                    if (f.getTipoVinculo() == 'H') {
                        System.out.print("Quantidade Hora: ");
                        qtdeHora = scan.nextFloat();
                        System.out.print("Valor hora: ");
                        valorHora = scan.nextFloat();
                        
                        f.setValorHora(valorHora);
                        f.setQtdeHora(qtdeHora);
                        salario = f.calcularSalario();
                    } else {
                        System.out.print("Salario: ");
                        salario = scan.nextFloat();
                    }
                    
                    f.setSalario(salario);
                    break;
                default:
                    System.out.println("\n\n## Opcao Invalida");
                    break;
            }
        }
        
    }
}
