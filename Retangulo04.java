
package metodosconstrutoresassessores.atividade04;

/**
 *
 * @author vitorb
 */
public class Retangulo04 {
    
 private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public void exibirInformacoes() {
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }
}


