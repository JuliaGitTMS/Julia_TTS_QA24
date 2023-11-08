package lesson9_hw;

public class taskAdd5 {
    public static void main(String[] args) {
        String str = "Yjbfkx?* jjbxlb, 23746 dxkjvb!";
        doubleLetters(str);
    }

    public static void doubleLetters (String str){
        for (char c:str.toCharArray()){
            if (Character.isLetter(c)){
                System.out.print(String.valueOf(c)+String.valueOf(c));
            } else System.out.print(c);
        }
    }
}
