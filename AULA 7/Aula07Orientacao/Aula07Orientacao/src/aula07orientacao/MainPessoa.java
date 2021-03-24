/*
 Criar uma classe com nome Pessoa
Atributos:
Nome publico
idade privado
peso privado
Métodos acessores
(getters e setters)
 */
package aula07orientacao;
import java.util.Scanner;

public class MainPessoa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite o nome: ");
        p1.nome = ler.next();
        //invocação dos métodos por causa da visibilidade dos atributos - privados
        System.out.println("Digite a idade: ");
        p1.setIdade(ler.nextInt());
        System.out.println("Digite o peso: ");
        p1.setPeso(ler.nextDouble());
        
        //configuração de saída
        System.out.println("Visualizando dados");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Peso: " + p1.getPeso());       
        
        
    }
    
}
