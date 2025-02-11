public class WordCount {
    public static void countWords(String paragraph) {
        String[] words = new String[100];
        int[] counts = new int[100];
        int size = 0;
        
        paragraph += " "; // Ensure the last word is processed
        String word = "";
        
        for (char c : paragraph.toCharArray()) {
            if (c == ' ') {
                if (!word.isEmpty()) {
                    int i;
                    for (i = 0; i < size; i++) {
                        if (words[i].equals(word)) {
                            counts[i]++;
                            break;
                        }
                    }
                    if (i == size) {
                        words[size] = word;
                        counts[size] = 1;
                        size++;
                    }
                    word = "";
                }
            } else {
                word += c;
            }
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println(words[i] + ": " + counts[i]);
        }
    }

    public static void main(String[] args) {
        String input = "the cat and the hat";
        countWords(input);
    }
}

        