import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class SynonymDictionary {
    private Map<String, Set<String>> dictionary;

    public SynonymDictionary() {
        dictionary = new TreeMap<>();
    }

    // Метод для добавления синонимов
    public void add(String term, String synonym) {
        dictionary.computeIfAbsent(term, k -> new TreeSet<>()).add(synonym);
    }

    // Метод для получения синонимов
    public Set<String> get(String term) {
        return dictionary.getOrDefault(term, new TreeSet<>());
    }

    // Метод для печати всего справочника
    public void printDictionary() {
        System.out.println(dictionary);
    }

    public static void main(String[] args) {
        SynonymDictionary sd = new SynonymDictionary();
        sd.add("быстрый", "проворный");
        sd.add("быстрый", "скорый");
        sd.add("умный", "скорый");
        sd.add("умный", "сообразительный");
        sd.add("умный", "смышленый");
        sd.add("большой", "огромный");
        sd.add("большой", "гигантский");
        sd.add("большой", "масштабный");

        System.out.println("Синонимы для 'быстрый': " + sd.get("быстрый"));
        System.out.println("Синонимы для 'умный': " + sd.get("умный"));

        System.out.println("\nВесь справочник:");
        sd.printDictionary();
    }
}


