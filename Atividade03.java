

package metodosconstrutoresassessores.atividade03;

/**
 *
 * @author vitorb
 */
public class Atividade03 {

    public static void main(String[] args) {
       
   
  Produto produto1 = new Produto("Playstation 5", 3500.00);

        
        produto1.exibirInformacoes();
        
        produto1.aumentarQuantidade(5);
        
        produto1.diminuirQuantidade(6);
       
        produto1.diminuirQuantidade(2);
      
        System.out.println();
        produto1.exibirInformacoes();
    }
}
