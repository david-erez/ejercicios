package poo;
// 3. Clase Rectángulo: atributos (base, altura); métodos calcularÁrea(), calcularPerímetro().

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5.0, 3.0);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
    
}
