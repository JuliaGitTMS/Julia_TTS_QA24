package lesson9_hw;

public class task1 {
    public static void main(String[] args) {
        String str1 = "5553-abc-3434-fjf-1a2b";
        String str2 = "4513 лgj-3434-fjf-1j4j";
        System.out.println(checkString(str1));
        System.out.println(checkString(str2));
        twoBlocksOfNumbers(str1);
        setStars(str1);
        justLetters(str1);
        abcCheck(str1);
        check555(str1);
        checkTheEnd(str1);
    }

    public static boolean checkString(String str) {
        if (str.matches("\\d{4}-[a-zA-Zфа-яА-Я]{3}-\\d{4}-[a-zA-Zфа-яА-Я]{3}-\\d?[a-zA-Zфа-яА-Я]?\\d?[a-zA-Zфа-яА-Я]?")) {
            return true;
        } else return false;
    }

    public static void twoBlocksOfNumbers(String str) {
        System.out.println(str.substring(0, 4) + str.substring(9, 13));
    }

    public static void setStars(String str) {
        System.out.println(new StringBuilder(str).replace(5, 8, "***")
                .replace(14, 17, "***"));
    }

    public static void justLetters(String str) {
        StringBuilder tempStr = new StringBuilder();
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                tempStr.append(c);
            }
        }
        System.out.println(tempStr.insert(3, '/')
                .insert(7, '/')
                .insert(9, '/'));
    }

    public static void abcCheck(String str) {
        System.out.println("Содержит ли документ abc: " + str.toLowerCase().contains("abc"));
    }

    public static void check555(String str) {
        System.out.println("Начинается ли документ с 555: " + str.startsWith("555"));
    }

    public static void checkTheEnd(String str) {
        System.out.println("Заканчивается ли документ на 1a2b: " + str.endsWith("1a2b"));
    }
}
