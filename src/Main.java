public class Main {
    public static void main(String[] args) {

        String str = "Kapak";
        String temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            temp += str.charAt(i);


            if (temp.equals(str)) {

                System.out.println("This word is Polidromic");
            }
        }
    }
}