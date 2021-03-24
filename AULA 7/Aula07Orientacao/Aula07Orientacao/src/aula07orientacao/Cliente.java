/*
 *Criar uma classe "Cliente" com as seguintes informações:
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
classificarRenda (com retorno String informando se o cliente é rico (renda superior a 15000) ou não).
 */
package aula07orientacao;
public class Cliente {
    private String nome;
    private int idade;
    private double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade() {
        String resposta;
        if(this.idade >= 18) {
            resposta = "Esse cliente é maior de idade";
        }else{
            resposta = "Esse cliente é menor de idade";
        }
        return resposta;                
    }
    
    public String classificarRenda() {
        String resp;
        if(this.renda > 1500){
            resp = "Esse cliente é rico";
        }else{
            resp = "Esse cliente não é rico";
        }
        return resp;
    
    }   
    
}
