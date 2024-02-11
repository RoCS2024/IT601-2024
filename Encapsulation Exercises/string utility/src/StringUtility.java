public class StringUtility {
    private String name;

    public StringUtility() {
    }

    public StringUtility(String name) {
        this.name = name;
    }

    public void getName(String name){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }

    public int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public boolean isValidString(String input) {
        return input.matches("[a-zA-Z\\s]+");
    }

    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}

class Reverse {
    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }
}