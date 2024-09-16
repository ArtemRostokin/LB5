import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Создаем массив с набором слов
        String[] words = {"яблоко", "банан", "яблоко", "апельсин", "банан", "яблоко", "киви", "киви", "банан", "виноград"};

        // HashMap для подсчета количества вхождений каждого слова
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова
        System.out.println("Уникальные слова: " + wordCount.keySet());
        // Выводим количество вхождений каждого слова
        System.out.println("Количество вхождений каждого слова: " + wordCount);
    }
}
