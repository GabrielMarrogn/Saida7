import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = new ArrayList<>();
        String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for (int i = 97; i < 123; i++) {
            numeros.add(i);
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i) +" e " +letras[i]);
        }
    }

}
