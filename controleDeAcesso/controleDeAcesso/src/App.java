public class App {
    public static void main(String[] args) {
        String txt = "Maria";

        if (txt != "Maria") {
            System.out.println(txt + "Seu acesso não está autorizado");
        } else {
            System.out.println(txt + " Seu acesso foi autorizado");
            System.out.println("...");
        }
    }
}