package lesson9_hw;

// Дана строка произвольной длины. Вывести на экран самое короткое слово.
// Вывести на экран самое длинное слово (последнее, если их несколько)

public class taskAdd2 {
    public static void main(String[] args) {
        String str = "dlkgh  sdkgj: sdlkgsld!!Р dk wdllkkgslw f*";
        shortestWord(str);
        longestWord(str);
    }

    public static void shortestWord(String str) {
        String shortWord = str.split("\\W+")[0];
        for (String s : str.split("\\W+")) {
            if (s.length() <= shortWord.length()) {
                shortWord = s;
            }
        }
        System.out.println("Последнее самое короткое слово: " + shortWord);
    }

    public static void longestWord(String str) {
        String longWord = str.split("\\W+")[0];
        for (String s : str.split("\\W+")) {
            if (s.length() >= longWord.length()) {
                longWord = s;
            }
        }
        System.out.println("Последнее самое длинное слово: " + longWord);
    }
}
