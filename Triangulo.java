public class Triangulo implements Figura {
    private String tipo;

    public Triangulo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um triângulo " + tipo + ".");
    }
}