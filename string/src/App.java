class App {
    public static void main(String[] args) {
        String valor = "Descomplica - Java";

        System.out.println(valor);
        System.out.println(valor.contains("Java"));
        System.out.println(valor.length());

        System.out.println("Com o println existe quebra de linha");
        System.out.print("Com o print normal nao tem quebra de linha");
        System.out.printf("Com o printf tambêm não existe quebra de linha.");
    }
}