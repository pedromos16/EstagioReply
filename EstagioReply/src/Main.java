import java.util.Scanner;

//Calculadora
public class Main {
    public static void main(String[] args) {
        int opcao = 0, num1 = 0, num2 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Soma de dois números inteiros e positivos");
        System.out.println("2 - Multiplicação de dois números inteiros, podendo o primeiro ser negativo ou positivo, o segundo positivo");
        System.out.println("3 - Desconto de um determinado valor");
        System.out.print("Selecione o número da operação desejada: ");
        opcao = entrada.nextInt();
        System.out.println();

        if (opcao>=1 && opcao<=3){
            System.out.print("Agora digite o primeiro valor: ");
            num1 = entrada.nextInt();
            System.out.println();
            System.out.print("Digite o segundo valor: ");
            num2 = entrada.nextInt();
            System.out.println();
        }

        switch (opcao) {
            case 1:
                if(num1>=0 && num2>=0) {
                    Calculadora soma = new Calculadora(num1, num2);
                    System.out.println("Valor da soma: "+soma.somar());
                }else{
                    System.out.println("Valores inválidos");
                }
                break;
            case 2:
                if(num2>=0) {
                    Calculadora multiplicacao = new Calculadora(num1, num2);
                    System.out.println("Valor da multiplicação: "+multiplicacao.multiplicar());
                }else{
                    System.out.println("Valores inválidos");
                }
                break;
            case 3:
                if(num1>=0 && num2>=0) {
                    Calculadora desconto = new Calculadora(num1, num2);
                    System.out.println("Valor após o desconto: "+desconto.descontar());
                }else{
                    System.out.println("Valores inválidos");
                }
                break;
            default:
                System.out.println("O número da opção escolhido é inválido! Digite um número entre 1 a 3.");
        }

    }
}

class Calculadora{
    private double num1, num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int somar(){

        return (int) (this.num1 + this.num2);
    }

    public int multiplicar(){
        return (int) (this.num1 * this.num2);
    }

    public double descontar(){
        return (this.num1 - (this.num1 * (this.num2/100)));
    }
}

/**
 * Pedro Márcio Oliveira Silveira
 *
 * Linguagem: Java
 *
 * 1 -
 *
 * Resposta = Letra C (Falso)
 *
 * Código:
 *
 * if (((4 > 2) && (5 == 3)) && ((4 > 2) || (5 == 5)))
 *             System.out.println("Verdadeiro");
 *         else
 *             System.out.println("Falso");
 *
 * 2 -
 *
 * int A = 10, B = 20, C = B;
 *
 *         B = A;
 *
 *         A = C;
 *
 *         System.out.println(A);
 *
 *         System.out.println(B);
 *
 *
 * 3 -
 *
 * import java.util.Scanner;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *
 *         double salario = 0, percentual = 0, resultado = 0;
 *
 *         Scanner entrada = new Scanner(System.in);
 *
 *         System.out.print("Digite seu salário: ");
 *
 *         salario = entrada.nextDouble();
 *
 *         System.out.println();   //espaçar e ficar mais organizado
 *
 *         System.out.print("Digite o percentual de reajuste: ");
 *
 *         percentual = (entrada.nextDouble()/100);  //transforma o valor em decimal, exemplo => 50 em 0.5
 *
 *         System.out.println();   //espaçar e ficar mais organizado
 *
 *         resultado = salario + (salario * percentual);
 *
 *         System.out.println("O valor reajustado é "+resultado);
 *     }
 * }
 *
 *
 *
 * 4 -
 *
 * Resultado = 30
 *
 * Código:
 *
 * public class Main {
 *     public static void main(String[] args) {
 *
 *         System.out.println(avaliar(120, 30));
 *     }
 *
 *     static  public int avaliar (int a, int b){
 *         int ma = a;
 *         if(ma < b)
 *             ma = b;
 *         int me = a;
 *         if(me > b)
 *             me = b;
 *         double resultado = (ma % me);
 *         if(resultado == 0)
 *             return me;
 *         else
 *             return avaliar (me, ma); //é uma função recursiva
 *     }
 * }
 *
 *
 *
 * 5 -
 *
 * Resposta = 2 4
 *
 * Código:
 *
 * int [] v = {2, 4, 6, 8, 10 , 12};
 *         System.out.println((v[0] + " " + v[1]));
 *
 * 6 -
 *
 * Resposta: Letra A (A primeira chamada da “funcao_A” com o argumento 2 provoca uma segunda chamada
 * da “funcao_A” com o argumento 1)
 *
 * Código:
 *
 *
 * public class Main {
 *
 *     static int i = 0; //iterações
 *     public static void main(String[] args) {
 *         System.out.println("Resultado: "+funcao_A(2));
 *         System.out.println("Iterações: "+i);
 *     }
 *
 *     public static int funcao_A(int n) {
 *         i++;
 *         int f;
 *         System.out.println("Valor de n é "+n+" na iteração "+i);  //testando o n na primeira e segunda iteração, testagem por força bruta
 *         if ((n == 1) || (n == 0))
 *             return 1;
 *         f = funcao_A(n - 1) * n; //recursividade
 *         return f;
 *     }
 * }
 *
 *
 * 7 -
 *
 * Resposta: B (Apenas I e II)
 *
 * Justificativa: Subclasses podem SIM incorporar atributos ou operações adicionais específicas.
 *
 *
 * 8 -
 *
 * Código: No inicio
 *
 *
 */