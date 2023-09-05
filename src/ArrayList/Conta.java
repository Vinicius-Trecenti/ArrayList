package ArrayList;
//Crie uma Classe "Conta" com os atributos int numero, String nome e int idade
public class Conta implements Comparable<Conta>{
    int numero;
    String nome;
    int idade;


    //Crie um construtor para os atributos acima
    Conta(int numero, String nome, int idade){
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Conta - idade = " + idade + ", nome = " + nome + ", numero = " + numero + "\n";
    }

    public int compareTo(Conta OutraConta){
        if(this.idade > OutraConta.idade){
            return 1;
        }
        if(this.idade < OutraConta.idade){
            return -1;
        }
        return 0;

    }
}