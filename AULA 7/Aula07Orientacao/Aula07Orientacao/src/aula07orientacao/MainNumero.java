/*
 *Criar uma classe "Numero" com as seguintes informações:
Atributos:
valor (de tipo int)
Métodos
construtor
getValor (método acessor)
setValor (método acessor)
verificarValor (retornando uma String informando se o valor é positivo ou negativo)
 */
package aula07orientacao;
import java.util.Scanner;

public class MainNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero n1 = new Numero();
        
        //invocando o método acessor
        System.out.println("Digite um número: ");
        n1.setValor(ler.nextInt());
        
        //invocando o método de verificação
        System.out.println(n1.verificarValor());        
        
    }
    
}
