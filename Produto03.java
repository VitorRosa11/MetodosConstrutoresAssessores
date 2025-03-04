
package metodosconstrutoresassessores.atividade03;

/**
 *
 * @author vitorb
 */
public class Produto03 {
    
private String nome;
    private double preco;
    private int quantidade;

    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    
    public void aumentarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas. Nova quantidade: " + this.quantidade);
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    
    public void diminuirQuantidade(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades removidas. Nova quantidade: " + this.quantidade);
        } else {
            System.out.println("Quantidade inválida para remover.");
        }
    }

   
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}


