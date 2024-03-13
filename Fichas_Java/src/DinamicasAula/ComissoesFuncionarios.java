package DinamicasAula;

import java.util.Scanner;

public class ComissoesFuncionarios {

    static double aoQuadrado(double n) {
        return n * n;
    }

    static double raizQuadrada(double n) {
        double temp;
        double sr = n / 2;
        do {
            temp = sr;
            sr = (temp + (n / temp)) / 2;
        } while ((temp - sr) != 0);

        return sr;
    }

    static int funcionarioMaisEstavel(int[][] vendasFuncionario) {

        double[] mediaFuncionarios = new double[vendasFuncionario.length];
        double[] desvioFuncionarios = new double[vendasFuncionario.length];

        // calcular medias
        double media, soma = 0, count = 0;
        for (int i = 0; i < vendasFuncionario.length; i++) {
            for (int j = 1; j < vendasFuncionario[0].length; j++) {
                soma += vendasFuncionario[i][j];
                count++;
            }
            media = soma / count;
            mediaFuncionarios[i] = media;
            soma = 0;
            count = 0;
        }

        double resultado = 0, desvio, valorFinal;

        for (int i = 0; i < vendasFuncionario.length; i++) {
            for (int j = 1; j <= vendasFuncionario.length; j++) {
                resultado += aoQuadrado(vendasFuncionario[i][j] - mediaFuncionarios[i]);
            }

            desvio = resultado / (vendasFuncionario[0].length - 1);
            valorFinal = raizQuadrada(desvio);

            desvioFuncionarios[i] = valorFinal;
        }

        double menor = 0;
        double indentificador_menor = 0;
        for (int n = 0; n < desvioFuncionarios.length; n++) {

            if (n == 0 || desvioFuncionarios[n] < menor) {
                menor = desvioFuncionarios[n];
                indentificador_menor = vendasFuncionario[n][0];
            }
        }

        return (int) indentificador_menor;
    }

    static int funcionarioMenosEstavel(int[][] vendasFuncionario) {
        double[] mediaFuncionarios = new double[vendasFuncionario.length];
        double[] desvioFuncionarios = new double[vendasFuncionario.length];

        // calcular medias
        double media, soma = 0, count = 0;
        for (int i = 0; i < vendasFuncionario.length; i++) {
            for (int j = 1; j < vendasFuncionario[0].length; j++) {
                soma += vendasFuncionario[i][j];
                count++;
            }
            media = soma / count;
            mediaFuncionarios[i] = media;
            soma = 0;
            count = 0;
        }

        double resultado = 0, desvio, valorFinal;

        for (int i = 0; i < vendasFuncionario.length; i++) {
            for (int j = 1; j <= vendasFuncionario.length; j++) {
                resultado += aoQuadrado(vendasFuncionario[i][j] - mediaFuncionarios[i]);
            }

            desvio = resultado / (vendasFuncionario[0].length - 1);
            valorFinal = raizQuadrada(desvio);

            desvioFuncionarios[i] = valorFinal;
        }

        double maior = 0;
        double indentificador_maior = 0;
        for (int n = 0; n < desvioFuncionarios.length; n++) {


            if (n == 0 || desvioFuncionarios[n] > maior) {

                maior = desvioFuncionarios[n];
                indentificador_maior = vendasFuncionario[n][0];
            }
        }

        return (int) indentificador_maior;
    }

    public static int melhorFuncionarioMes(int[][] funcionario) {

        int melhorFuncionario = 0;
        int melhorValor = 0;


        // Iterar sobre a matriz para encontrar o melhor funcionário de cada mês
        for (int i = 0; i < funcionario.length; i++) {
            for (int j = 1; j < funcionario[i].length; j++) {
                if (funcionario[i][j] > melhorValor) {
                    melhorFuncionario = funcionario[i][0];
                    melhorValor = funcionario[i][j];
                }
            }
        }
        return melhorFuncionario;
    }

    public static int piorFuncionarioMes(int[][] funcionario) {

        int piorFuncionario = 0;
        int piorValor = 0;


        // Iterar sobre a matriz para encontrar o melhor funcionário de cada mês
        for (int i = 0; i < funcionario.length; i++) {
            for (int j = 1; j < funcionario[i].length; j++) {
                if (funcionario[i][j] < piorValor) {
                    piorFuncionario = funcionario[i][0];
                    piorValor = funcionario[i][j];
                }
            }
        }
        return piorFuncionario;
    }


    public static String[] pesquisarInfo(String[][] matrizFuncionario, int idFuncionario) {

        //encontrar a linha correspondente ao id do funcionário;

        String[] infos = new String[4];

        for (int i = 0; i < infos.length; i++) {
            infos[i] = matrizFuncionario[idFuncionario][i];

        }
        return infos;
    }

    public static void imprimirInfo(String[] infos) {

        String linhaDados = "";
        String[] cabecalho = new String[4];
        cabecalho[0] = "ID:";
        cabecalho[1] = "Nome:";
        cabecalho[2] = "Telefone:";
        cabecalho[3] = "Email:";

        for (int i = 0; i < infos.length; i++)
            linhaDados = linhaDados + cabecalho[i] + " : " + infos[i] + "; ";

        String asteriscos = "";
        for (int i = 0; i < linhaDados.length() + 4; i++) {
            asteriscos = asteriscos + "*";
        }

        System.out.println(asteriscos);
        System.out.println("* " + linhaDados + " *");
        System.out.println(asteriscos);

    }


    /**
     * Função para Editar Contactos
     *
     * @param listaContatos
     * @return matriz com os contatos atualizados
     */
    static String[][] editarInfo(String[][] listaContatos) {

        Scanner input = new Scanner(System.in);
        int id_Funcionario, contato, opcao;
        String email;

        System.out.print("Qual o ID do Funcionario que deseja alterar: ");
        id_Funcionario = input.nextInt();
        System.out.println("Estas são as informações atuais:");

        for (int i = id_Funcionario; i <= id_Funcionario; i++) {
            for (int j = 0; j < listaContatos[i].length; j++) {
                System.out.print(listaContatos[i][j] + " | ");
            }
        }
        System.out.println();
        System.out.print("\n Qual destes dados pretende alterar :");


        do {
            System.out.println("\n1. Email");
            System.out.println("2. Telefone");
            System.out.println("3. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o novo email: ");
                    listaContatos[id_Funcionario][3] = input.next();

                    for (int i = id_Funcionario; i <= id_Funcionario; i++) {
                        for (int j = 0; j < listaContatos[i].length; j++) {
                            System.out.print(listaContatos[i][j] + " | ");
                        }
                    }
                    System.out.println();
                    break;
                case 2:

                    System.out.print("Insira o novo contacto: ");
                    listaContatos[id_Funcionario][2] = input.next();

                    for (int i = id_Funcionario; i <= id_Funcionario; i++) {
                        for (int j = 0; j < listaContatos[i].length; j++) {
                            System.out.print(listaContatos[i][j] + " | ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Xau Vítor!!!");
                    break;

                default:
                    System.out.println("Opção Invalida!");

            }

        } while (opcao != 3);

        return listaContatos;
    }


    /**
     * Calcula o somatório de cada mês, compara os meses e returna o indice do melhor mês
     *
     * @param matriz Matriz[][size:13]
     * @return int indice do melhor mês
     */
    public static int melhorMes(int matriz[][]) {
        int soma, melhor = 0, melhorMes = 0;

        //tomar o primeiro mes como o melhor inicial
        for (int linha = 0; linha < matriz.length; linha++) {
            melhor += matriz[linha][1];
        }

        //achar melhor
        for (int coluna = 1; coluna < matriz[0].length; coluna++) {
            soma = 0;
            //somatório do mes
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += matriz[linha][coluna];
            }
            //comparar mes com o mes anterior
            if (soma > melhor) {
                melhor = soma;
                melhorMes = coluna;
            }
        }
        return melhorMes;
    }

    /**
     * Calcula o somatório de cada mês, compara os meses e returna o indice do pior mês
     *
     * @param matriz Matriz[][size:13]
     * @return int indice do pior mês
     */
    public static int piorMes(int matriz[][]) {
        int soma, pior = 0, piorMes = 0;

        //tomar o primeiro mes como o pior inicial
        for (int linha = 0; linha < matriz.length; linha++) {
            pior += matriz[linha][1];
        }
        //achar pior
        for (int coluna = 2; coluna < matriz[0].length; coluna++) {
            soma = 0;
            //somatório do mes
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += matriz[linha][coluna];
            }
            //comparar mes com o mes anterior
            if (soma < pior) {
                pior = soma;
                piorMes = coluna;
            }
        }
        return piorMes;
    }

    /**
     * Traduz o indice do mes para o seu nome
     *
     * @param m Mês
     */
    public static void traducaoMes(int m) {
        m++;
        switch (m) {
            case 1 -> System.out.print("Janeiro");
            case 2 -> System.out.print("Fevereiro");
            case 3 -> System.out.print("Março");
            case 4 -> System.out.print("Abril");
            case 5 -> System.out.print("Maio");
            case 6 -> System.out.print("Junho");
            case 7 -> System.out.print("Julho");
            case 8 -> System.out.print("Agosto");
            case 9 -> System.out.print("Setembro");
            case 10 -> System.out.print("Outubro");
            case 11 -> System.out.print("Novembro");
            case 12 -> System.out.print("Dezembro");
            default -> System.out.print("inválido");
        }
    }

    /**
     * Função que avalia o melhor funcionario do ano
     *
     * @param matriz valores inteiros
     * @return codigo melhor funcionario
     */
    public static int melhorFuncionarioAno(int[][] matriz) {

        int[] vetor = new int[matriz.length];

        int soma, maior, funcionario = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int k = 1; k < matriz[0].length; k++) {
                soma += matriz[i][k];
                vetor[i] = soma;
            }
        }

        maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                funcionario = i;
            }
        }

        return funcionario;

    }

    /**
     * Função que avalia o pior funcionario do ano
     *
     * @param matriz valores inteiros
     * @return codigo pior funcionario
     */
    public static int piorFuncionarioAno(int[][] matriz) {

        int[] vetor = new int[matriz.length];

        int soma, menor, func = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int k = 1; k < matriz[0].length; k++) {
                soma += matriz[i][k];
                vetor[i] = soma;
            }
        }

        menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                func = i;
            }
        }

        return func;

    }

    public static void main(String[] args) {

        // Import Scanner
        Scanner input = new Scanner(System.in);

        // Matriz vendas
        int[][] matrizVendas = {
                {0, 500, 1200, 2300, 3200, 4200, 5500, 6100, 7200, 8400, 9100, 9800, 9900},
                {1, 90, 1500, 2400, 3300, 4400, 5700, 6300, 7300, 8500, 9200, 9900, 5500}, // Pior mês
                {2, 900, 1700, 2500, 3400, 4600, 5900, 6500, 7400, 8600, 9300, 5200, 5600},
                {3, 1100, 1900, 2600, 3500, 4800, 6100, 6700, 7500, 8700, 9400, 5400, 5700},
                {4, 9300, 9100, 9700, 9600, 9000, 9300, 9900, 7600, 8800, 9500, 1600, 11800}, // Melhor ano -> Melhor mês
                {5, 500, 2000, 100, 100, 200, 7500, 100, 2700, 900, 600, 1100, 900}, // Pior ano
                {6, 1700, 2500, 2900, 3800, 5400, 6700, 7300, 7800, 9100, 9700, 6000, 6000},
                {7, 3970, 3710, 3820, 3950, 3600, 3900, 3500, 3900, 3700, 3800, 3850, 3990}, // Mais estavel
                {8, 2100, 2900, 3100, 4000, 5800, 7100, 7700, 8000, 9500, 9900, 6400, 6200}
        };

        // Melhor mês total: Outubro
        // Pior mês total: Janeiro
        // Melhor mês p/ funcionario: 4 em outubro
        // Pior mês p/ funcionario: 1 em janeiro

        // Matriz funcionarios
        String[][] matrizFuncionarios = {
                {"0", "Vitor Santos", "911222111", "vmvs007@gmail.com"},
                {"1", "Joaquim Alberto", "922333422", "quim@bombeiros.pt"},
                {"2", "Quim Barreiros", "911122233", "mestre.culinaria@musica.pt"},
                {"3", "Manuel Luís Goucha", "944455566", "mlgoucha@tvi.pt"},
                {"4", "Fernando Mendes", "955566677", "preco.certo@espetaculo.pt"},
                {"5", "Fátima Lopes", "900011122", "fatima.lopes@tv.com"},
                {"6", "Cristina Ferreira", "966677788", "cristina.ferreira@tvi.pt"},
                {"7", "Célia Careca", "966677788", "curral.moinas@portugal.pt"},
                {"8", "Afonso Henriques", "966677788", "1@portugal.pt"},
        };

        // Declarar variáveis locais
        int opcao, opcaoInterior;

        do {

            System.out.println("\uD83C\uDFE2\uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5 Gestão de Funcionários e Vendas \uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5\uD83C\uDFE2\n");
            System.out.println("1. Editar Base de Dados \uD83D\uDDC2️");
            System.out.println("2. Análise Valores p/ Mês \uD83D\uDCC5\uD83D\uDCB0");
            System.out.println("3. Pesquisar Funcionarios \uD83D\uDD0E\uD83D\uDC64");
            System.out.println("4. Análise Funcionários p/ Ano \uD83D\uDCC6\uD83D\uDC64️");
            System.out.println("5. Análise Funcionários p/ Mês \uD83D\uDCC5\uD83D\uDC64");
            System.out.println("6. Análise da Estabilidade Funcionários ⚖️\uD83D\uDC64");
            System.out.println("7. Sair ❌");

            System.out.print("\nInsira a sua opção: ");
            opcao = input.nextInt();

            System.out.println();

            switch (opcao) {

                case 1: // Editar Base de Dados
                    System.out.println("***** Editar Base de Dados *****\n");

                    matrizFuncionarios = editarInfo(matrizFuncionarios);


                    break;

                case 2: // Análise Valores p/ Mês
                    System.out.println("***** Análise Valores p/ Mês *****\n");

                    System.out.println("1. Melhor Mês em Total Vendas \uD83D\uDFE2");
                    System.out.println("2. Pior Mês em Total Vendas \uD83D\uDD34");

                    System.out.print("\nInsira a sua opção: ");
                    opcaoInterior = input.nextInt();

                    switch (opcaoInterior) {
                        case 1: // Melhor Mês em Total Vendas

                            traducaoMes(melhorMes(matrizVendas));

                            break;

                        case 2: // Pior Mês em Total Vendas

                            traducaoMes(piorMes(matrizVendas));

                            break;

                        default: // Inválida
                            System.out.println("⚠️ Opção Inválida ⚠️");

                    }


                    break;

                case 3: // Pesquisar Funcionarios
                    System.out.println("***** Pesquisar Funcionarios *****\n");

                    System.out.print("Insira o id do funcionario a pesquisar: ");
                    int funcPesquisar = input.nextInt();


                    imprimirInfo(pesquisarInfo(matrizFuncionarios, funcPesquisar));

                    break;

                case 4: // Análise Funcionários p/ Ano
                    System.out.println("***** Análise Funcionários p/ Ano *****\n");

                    System.out.println("1. Melhor Funcionario Anual \uD83D\uDFE2");
                    System.out.println("2. Pior Funcionario Anual \uD83D\uDD34");

                    System.out.print("\nInsira a sua opção: ");
                    opcaoInterior = input.nextInt();

                    switch (opcaoInterior) {
                        case 1: // Melhor Funcionario Anual

                            System.out.println("Melhor Funcionário Anual: ");
                            imprimirInfo(pesquisarInfo(matrizFuncionarios, melhorFuncionarioAno(matrizVendas)));

                            break;

                        case 2: // Pior Funcionario Anual

                            System.out.println("Pior Funcionário Anual: ");
                            imprimirInfo(pesquisarInfo(matrizFuncionarios, piorFuncionarioAno(matrizVendas)));
                            break;

                        default: // Inválida
                            System.out.println("⚠️ Opção Inválida ⚠️");

                    }

                    break;

                case 5: // Análise Funcionários p/ Mês
                    System.out.println("***** Análise Funcionários p/ Mês *****\n");

                    System.out.println("1. Melhor Funcionario Mensal \uD83D\uDFE2");
                    System.out.println("2. Pior Funcionario Mensal \uD83D\uDD34");

                    System.out.print("\nInsira a sua opção: ");
                    opcaoInterior = input.nextInt();

                    switch (opcaoInterior) {
                        case 1: // Melhor Funcionario Mensal

                            imprimirInfo(pesquisarInfo(matrizFuncionarios,melhorFuncionarioMes(matrizVendas)));
                            break;

                        case 2: // Pior Funcionario Mensal
                            imprimirInfo(pesquisarInfo(matrizFuncionarios,piorFuncionarioMes(matrizVendas)));
                            break;

                        default: // Inválida
                            System.out.println("⚠️ Opção Inválida ⚠️");

                    }

                    break;

                case 6: // Análise da Estabilidade Funcionários
                    System.out.println("***** Análise da Estabilidade Funcionários *****\n");

                    System.out.println("1. Funcionario Mais Estável \uD83D\uDFE2");
                    System.out.println("2. Funcionario Menos Estável \uD83D\uDD34");

                    System.out.print("\nInsira a sua opção: ");
                    opcaoInterior = input.nextInt();

                    switch (opcaoInterior) {
                        case 1: // Funcionario Mais Estável
                            imprimirInfo(pesquisarInfo(matrizFuncionarios,funcionarioMaisEstavel(matrizVendas)));
                            break;

                        case 2: // Funcionario Menos Estável
                            imprimirInfo(pesquisarInfo(matrizFuncionarios,funcionarioMenosEstavel(matrizVendas)));
                            break;

                        default: // Inválida
                            System.out.println("⚠️ Opção Inválida ⚠️");

                    }

                    break;

                case 7: // Saida
                    System.out.println("Volte sempre...");
                    break;

                default: // Opção Inválida
                    System.out.println("⚠️⚠️⚠️ Opção Inválida ⚠️⚠️⚠️");
            }

            System.out.println("\n\n\n");

        } while (opcao != 7);
    }
}
