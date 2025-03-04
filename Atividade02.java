

package metodosconstrutoresassessores.atividade02;

/**
 *
 * @author vitorb
 */
public class Atividade02 {

    public static void main(String[] args) {
       
 Livro livro1 = new Livro("Viagem ao centro da terra", "Julio Vérne", 1899, "Ficção");

       
        Livro livro2 = new Livro("Rádio silêncio", "Alice Osemann");

        
        livro1.exibirInformacoes();
        System.out.println();
        livro2.exibirInformacoes();
        
       
        String generoBuscado = "Romance";
        if (livro1.pertenceAoGenero(generoBuscado)) {
            System.out.println("\nO livro '" + livro1.getTitulo() + "' pertence ao gênero " + generoBuscado + ".");
        } else {
            System.out.println("\nO livro '" + livro1.getTitulo() + "' NÃO pertence ao gênero " + generoBuscado + ".");
        }
    }
}

