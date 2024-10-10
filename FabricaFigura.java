public class FabricaFigura {
    private static FabricaFigura instancia;

    // Construtor privado para aplicar Singleton
    private FabricaFigura() {}

    // Método estático para obter a instância da fábrica
    public static FabricaFigura getInstancia() {
        if (instancia == null) {
            instancia = new FabricaFigura();
        }
        return instancia;
    }

    // Método para criar um Círculo
    public Figura criarCirculo() {
        return new Circulo();  // Aqui podemos criar uma nova instância sempre
    }

    // Método para criar diferentes tipos de Triângulo
    public Figura criarTriangulo(String tipo) {
        return new Triangulo(tipo);
    }

    // Método para criar um Quadrado
    public Figura criarQuadrado() {
        return new Quadrado();
    }
}