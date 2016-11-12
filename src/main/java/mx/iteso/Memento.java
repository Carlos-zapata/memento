package mx.iteso;

/**
 * Created by Carlos Flores on 12/11/2016.
 */
public class Memento {
    private String state;

    public Memento(String stateToSave) { state = stateToSave; }
    public String getSavedState() { return state; }
}
