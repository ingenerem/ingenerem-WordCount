
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        if(in != null && in.length()!=0){
            String [] words = in.split(" ");
            return words.length;

        }
        
        return 0;
    }
}
