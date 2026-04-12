import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Note, Integer> notes = new HashMap<>();

    public void addNotes(Note noteType, int quantity) {
        if(notes.containsKey(noteType)) {
            notes.put(noteType, notes.get(noteType) + quantity);
        }
        else {
            notes.put(noteType, quantity);
        }
    }

    public int getTotal() {
        int total = 0;

        for(Map.Entry<Note, Integer> entry : notes.entrySet()) {
            total += entry.getKey().amount * entry.getValue();
        }

        return total;
    }

    public int getFiveHundredNotes() {
        return notes.get(Note.FIVE_HUNDRED);
    }

    public int getHundredNotes() {
        return notes.get(Note.HUNDRED);
    }

    public int getFiftyNotes() {
        return notes.get(Note.FIFTY);
    }

    public int getOneNotes() {
        return notes.get(Note.ONE);
    }

    public void deductNotes(int quantity, Note noteType) {
        notes.put(noteType, notes.get(noteType) - quantity);
    }
}
