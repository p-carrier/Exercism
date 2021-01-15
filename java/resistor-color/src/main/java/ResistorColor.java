import java.util.Dictionary;
import java.util.Hashtable;

class ResistorColor {

    private Dictionary colorLibrary = new Hashtable();

    public ResistorColor() {
        colorLibrary.put("Black", 0);
        colorLibrary.put("Brown", 1);
        colorLibrary.put("Red", 2);
        colorLibrary.put("Orange", 3);
        colorLibrary.put("Yellow", 4);
        colorLibrary.put("Green", 5);
        colorLibrary.put("Blue", 6);
        colorLibrary.put("Violet", 7);
        colorLibrary.put("Grey", 8);
        colorLibrary.put("White", 9);
    }

    int colorCode(String color) {

        return colorLibrary.get(color);
    }

    String[] colors() {
        return new String[1];
    }
}
