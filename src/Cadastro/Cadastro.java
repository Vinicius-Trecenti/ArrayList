package Cadastro;

import java.util.Comparator;

public class Cadastro implements Comparable<Cadastro>{
    // Crie a classe Cadastro com os atributos nome, idade, cpf, rg, data_nasc,
    // sexo, signo, mae, pai, email,
    // senha, cep, endereco, numero, bairro, cidade, estado, telefone_fixo, celular,
    // altura, peso, tipo_sanguineo, cor


    String nome;

    String idade;
    String cpf;
    String rg;

    String data_nasc;
    String sexo;
    String signo;
    String mae;
    String pai;
    String email;
    String senha;
    String cep;
    String endereco;

    String numero;

    String bairro;
    String cidade;
    String estado;
    String telefone_fixo;
    String celular;

    String altura;
    String peso;

    String tipo_sanguineo;
    String cor;

    Cadastro(String[] vetor) {
        this.nome = vetor[0];

        this.idade = vetor[1];
        this.cpf = vetor[2];
        this.rg = vetor[3];

        this.data_nasc = vetor[4];
        this.sexo = vetor[5];
        this.signo = vetor[6];
        this.mae = vetor[7];
        this.pai = vetor[8];
        this.email = vetor[9];
        this.senha = vetor[10];
        this.cep = vetor[11];
        this.endereco = vetor[12];

        this.numero = vetor[13];

        this.bairro = vetor[14];
        this.cidade = vetor[15];
        this.estado = vetor[16];
        this.telefone_fixo = vetor[17];
        this.celular = vetor[18];

        this.altura = vetor[19];
        this.peso = vetor[20];

        this.tipo_sanguineo = vetor[21];
        this.cor = vetor[22];

    }

    @Override
    public String toString() {
        return  nome + ", " + idade + ", " + cpf + ", " + rg + ", " + data_nasc+ ", " + sexo+ ", " +signo+ ", " + 
                mae + ", " + pai + ", " + email + ", " + senha + ", " + cep + ", " + endereco + ", " + numero + ", " +
                bairro + ", " +cidade + ", " + estado + ", " + telefone_fixo + ", " + celular + ", " + altura + ", " + 
                peso + ", " + tipo_sanguineo + cor;
    }

    public int compareTo(Cadastro Outrocadastro){
        if(this.nome.compareTo(Outrocadastro.nome) > 0){
            return 1;
        }

        if(this.nome.compareTo(Outrocadastro.nome) < 0){
            return -1;
        }
        return 0;
    }
    

}
