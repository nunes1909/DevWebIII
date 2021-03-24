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
//nome da classe
public class Pessoa {
    //atributos da classe
    public String nome;
    private int idade;
    private double peso;
    
    //métodos da classe
    //sempre serão métodos acessores qdo os atributos forem privados

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }    
      
}
