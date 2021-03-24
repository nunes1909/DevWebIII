/*
 *Criar uma classe "Numero" com as seguintes informações:
Atributos:
valor (de tipo int)
Métodos
construtor
getValor (método acessor)
setValor (método acessor)
verificarValor (retornando uma String informando se o valor é positivo ou  negativo)
 */
package aula07orientacao;

public class Numero {
    //atributo está definido como privado
    private int valor;
    
    //métodos acessores
    //método set é responsável por "gravar, armazenar" o valor do atributo
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //método get - obtém o dado "digitado" pelo método set
    public int getValor() {
        return this.valor;
    }
    
    //método de execução, é o método da comparação
    public String verificarValor() {
        String resposta;
        if(this.valor >= 0) {
            resposta = "Este número é positivo!";
        }else{
            resposta = "Este número é negativo!";
        }
        return resposta;
        
    }  
    
    
}
