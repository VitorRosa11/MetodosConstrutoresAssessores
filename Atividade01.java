

package metodosconstrutoresassessores.atividade01;

/**
 *
 * @author vitorb
 */
public class Atividade01 {

    public static void main(String[] args) {
       
     Carro01 carro1 = new Carro01 ("Chevrolet", "Prisma", 2012, 125000.00);

       
        carro1.exibirInformacoes();
        
        System.out.println("A marca do carro é: " + carro1.getMarca());
        System.out.println("O modelo do carro é: " + carro1.getModelo());
        System.out.println("O ano do carro é: " + carro1.getAno());
    }
}

