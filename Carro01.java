
package metodosconstrutoresassessores.atividade01;

/**
 *
 * @author vitorb
 */
public class Carro01 {
    
  private String marca;
    private String modelo;
    private int ano;
    private double preco;

   
    public Carro01tring marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

   
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
    }
}


