import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {
	JFrame frame; 
	JPanel panel;
	JTextField text1;
	JTextField text2;
	JButton button; 
	JTextField text0;
	/**
     * Method to test whether a character is a letter or not.
     * @param c The character to test
     * @return True if it's a letter
     */
     private static boolean isLetter(char c) {
          return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
     }
     public void framecreation() {
    	JFrame frame = new JFrame();
    	JPanel panel = new JPanel();
    	JTextField text0 = new JTextField();    
    	JTextField text1 = new JTextField(20);
    	JTextField text2 = new JTextField();
    	JButton button = new JButton("Translate");
    	frame.setVisible(true);
    	text0.setEditable(false);
    	text2.setEditable(false);
    	text2.setText("Traslation");
    	text0.setText("English Here---->");
    	frame.add(panel);
    	panel.add(text0);
    	panel.add(text1);
    	panel.add(button);
    	panel.add(text2);
    	frame.pack();
     }
     public static void main(String[] args) {
		PigLatin latin = new PigLatin();
		latin.framecreation();
	}

     /**
     * Method to translate one word into pig Latin.
     * @param word The word in English
     * @return The pig Latin version
     */
     private static String pigWord(String word) {
          int split = firstVowel(word);
          return word.substring(split)+"-"+word.substring(0, split)+"ay";
     }

     /**
     * Method to translate a sentence word by word.
     * @param s The sentence in English
     * @return The pig Latin version
     */
     public String translate(String s) {
          String latin = "";
          int i = 0;
          while (i < s.length()) {

     // Take care of punctuation and spaces
          while (i < s.length() && !isLetter(s.charAt(i))) {
               latin = latin + s.charAt(i);
               i++;
               
          }

     // If there aren't any words left, stop.
          if (i>=s.length()) break;

     // Otherwise we're at the beginning of a word.
          int begin = i;
          while (i < s.length() && isLetter(s.charAt(i))) {
               i++;
          }
     // Now we're at the end of a word, so translate it.
          int end = i;
          latin = latin + pigWord(s.substring(begin, end));
          }
          return latin;
     }

     /**
     * Method to find the index of the first vowel in a word.
     * @param word The word to search
     * @return The index of the first vowel
     */
     	private static int firstVowel(String word) {
          word = word.toLowerCase();
          for (int i=0; i < word.length(); i++)
               if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
                    word.charAt(i)=='i' || word.charAt(i)=='o' ||
                    word.charAt(i)=='u')
                    return i;
               return 0;
     }
}

