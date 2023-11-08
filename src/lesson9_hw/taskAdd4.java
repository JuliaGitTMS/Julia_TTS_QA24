package lesson9_hw;

public class taskAdd4 {
    public static void main(String[] args) {
        String str = "WoW dkkd ldkshfslk,.. jkf";
        System.out.println(isPalindrome(str, 3));
    }

    public static boolean isPalindrome(String str, int wordNumber) {
        if (wordNumber > str.split("\\W+").length) {
            System.out.println("Неверный номер слова");
            System.exit(0);
        } else {
            char charArr[] = str.split("\\W+")[wordNumber - 1].toCharArray();
            for (int i = 0; i < charArr.length / 2; i++) {
                if (charArr[i] != charArr[charArr.length - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
