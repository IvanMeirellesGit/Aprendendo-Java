public class App {
    public static void main(String[] args) {

        // Instanciando Strings
        String primeira = "Java";
        String segunda = "Csharp";
        String terceira = new String("Python");

        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);

        // Comparar a primeira com a segunda String
        boolean result = primeira.equals(segunda);
        System.out.println("A primeira é igual a segunda? " + result);

        // Comparar a segunda com a terceira String
        result = segunda.equals(terceira);
        System.out.println("A segunda é igual a terceira? " + result);
    }
}