

package metodosconstrutoresassessores.atividade05;

/**
 *
 * @author vitorb
 */
public class Atividade05 {

    public static void main(String[] args) {
       
   
  ContaBancaria conta1 = new ContaBancaria("12345-6", "João Silva");

        conta1.exibirInformacoes();
        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta1.sacar(400.0);
        conta1.exibirInformacoes();
    }
}
