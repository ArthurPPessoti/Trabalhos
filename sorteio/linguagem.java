import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        // Criando a lista de itens
        ArrayList<String> items = new ArrayList<>();
        items.add("Python");
        items.add("Java");
        items.add("C");
        items.add("Lua");
        items.add("C++");
        items.add("JavaScript");
        items.add("C#");
        items.add("GOlang");
        items.add("Ruby");

        // Criando objeto Random para sortear
        Random random = new Random();
        
        // Sorteando um item aleatório
        int indexSorteado = random.nextInt(items.size());
        String itemSorteado = items.get(indexSorteado);
/*
        // Exibindo o resultado
        System.out.println("Lista de itens:");
        for (String item : items) {
            System.out.println("- " + item);
        }
*/        
        System.out.println("Item sorteado: " + itemSorteado);
    }
}