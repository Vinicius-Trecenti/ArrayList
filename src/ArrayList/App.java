package ArrayList;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //No programa principal, instancie pelo menos 5 objetos da classe 
        //Conta e armazene-os em um ArrayList
        //... aguarde...

        Conta c1 = new Conta(122, "Joao Zinho",28);
        Conta c2 = new Conta(36, "Pe Drinho",17);
        Conta c3 = new Conta(443, "A ninha", 22);
        Conta c4 = new Conta(123, "Vini cinho", 20);
        Conta c5 = new Conta(321, "Lu quinha", 19);

        ArrayList<Conta> bd = new ArrayList<Conta>();

        bd.add(c1);
        bd.add(c2);
        bd.add(c3);
        bd.add(c4);
        bd.add(c5);

    
        //System.out.println(bd.toString());

        System.out.println(bd);

        bd.sort(null);

        System.out.println(bd);
        

    }
}
