
package metodosconstrutoresassessores.atividade02;

/**
 *
 * @author vitorb
 */
public class Livro02 {
    
 private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

   
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0; // Valor padrão
        this.genero = "Desconhecido";
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    
    public boolean pertenceAoGenero(String generoConsulta) {
        return this.genero.equalsIgnoreCase(generoConsulta);
    }

   
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + (anoPublicacao == 0 ? "Desconhecido" : anoPublicacao));
        System.out.println("Gênero: " + genero);
    }
}


