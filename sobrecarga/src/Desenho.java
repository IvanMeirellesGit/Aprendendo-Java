public class Desenho {

    // Método sem parâmetro
    public void mostrar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    // Método com um parâmetro
    public void mostrar(char simbolo) {
        for (int i = 0; i < 10; i++) {
            System.out.println(simbolo);
        }
    }

    public void mostrar(char simbolo, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(simbolo);
        }
    }
}