package Cadastro;

public class testes {

    public static void main(String[] args) {
        //Importe o arquivo dados.csv e crie um objeto da classe Cadastro com as informações de cada linha do arquivo

        //Implemente o comparador de forma que os dados sejam ordenados pelo nome

        //Grave todas as informações ordenadas no arquivo dados_ordenados.txt no mesmo formato do arquivo dados.csv

        //ler o arquivo
        Arquivos objetoArquivos = new Arquivos();

        objetoArquivos.lerArquivo();//leu os arquivos


        objetoArquivos.Write(objetoArquivos.getBancodados());




        
    }
}
