import java.util.ArrayList;
public class Main {

    public void soma(){
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println("O valor da variavel soma é: "+ soma);
    }

    public  void isInFibonacciSequence(int n) {
        ArrayList<Integer> fibSequencia = new ArrayList<>();
        fibSequencia.add(0);
        fibSequencia.add(1);

        while (fibSequencia.get(fibSequencia.size() - 1) < n) {
            int nextNumero = fibSequencia.get(fibSequencia.size() - 1) + fibSequencia.get(fibSequencia.size() - 2);
            fibSequencia.add(nextNumero);
        }
        boolean flag = fibSequencia.contains(n);
        String aux = flag ? "SIM" : "NÃO";
        System.out.println("O numero se encontra na sequencia de Fibonacci ? "+ aux);
    }

    public void inverterString(String string){
        String aux = "";
        for(int i = string.length()-1;i >= 0;i--){
            aux += string.charAt(i);
        }
        System.out.println(aux);
    }

    public static void main(String[] args) {
        Main m = new Main();

        m.soma();
        m.inverterString("tegraT");
        m.isInFibonacciSequence(7);

        /*/
     a) A sequência está adicionando 2 a cada termo: 1 + 2 = 3, 3 + 2 = 5, 5 + 2 = 7. Portanto, o próximo número é 7 + 2 = 9.

        Resposta: a) 9

     b) Cada termo está sendo multiplicado por 2: 2 * 2 = 4, 4 * 2 = 8, 8 * 2 = 16, 16 * 2 = 32, 32 * 2 = 64. Portanto, o próximo número é 64 * 2 = 128.

        Resposta: b) 128

    c) Cada termo é o quadrado do seu índice: 0² = 0, 1² = 1, 2² = 4, 3² = 9, 4² = 16, 5² = 25, 6² = 36. Portanto, o próximo número é 7² = 49.

        Resposta: c) 49

    d) Parece ser os quadrados dos números pares: 2² = 4, 4² = 16, 6² = 36, 8² = 64. Portanto, o próximo número é 10² = 100.

        Resposta: d) 100

    e) Sequência de Fibonacci, onde cada termo é a soma dos dois anteriores: 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8. Portanto, o próximo número é 5 + 8 = 13.

        Resposta: e) 13
     /*/
    }
}