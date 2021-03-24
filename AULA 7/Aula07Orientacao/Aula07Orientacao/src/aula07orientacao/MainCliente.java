/*
 Criar uma classe "Cliente" com as seguintes informações:
Atributos:
Nome (de tipo String)
Idade (de tipo int)
renda (de tipo double)
Métodos:
construtor
getNome (método acessor)
setNome (método acessor)
getIdade (método acessor)
setIdade (método acessor)
getRenda (método acessor)
setRenda (método acessor)
classificarIdade (com retorno String informando se o cliente é maior de idade ou não)
classificarRenda (com retorno String informando se o cliente é rico (renda superior a 15000) o
 */
package aula07orientacao;

import java.util.Scanner;
public class MainCliente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        
        //invocação dos métodos acessores
        System.out.println("Nome do Cliente: ");
        c1.setNome(ler.next());
        
        System.out.println("Idade do cliente: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Renda do cliente: ");
        c1.setRenda(ler.nextDouble());
        
        //configuração das visualizações pelos métodos criados
        //invocação de métodos
        System.out.print(c1.classificarRenda());
        System.out.println("\n" + c1.classificarIdade());
                
    }
    
}
