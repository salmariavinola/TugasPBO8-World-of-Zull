
/**
 * Write a description of class Command here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Command {
    private String commandWord;
    private String secondWord;
    
    /**
     * Constructor for objects of class Command
     */
    public Command(String firstWord, String secondWord) {
        this.commandWord = firstWord;
        this.secondWord = secondWord;
    }

    public String getCommandWord() {
        return commandWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public boolean isUnknown() {
        return commandWord == null;
    }

    public boolean hasSecondWord() {
        return secondWord != null;
    }
}
