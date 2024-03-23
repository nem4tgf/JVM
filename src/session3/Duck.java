package session3;

public class Duck extends Animal{
    private String Act;
    private int Height;

    public Duck(String name, String act, int height) {
        super(name);
        Act = act;
        Height = height;
    }

    public String getAct() {
        return Act;
    }

    public void setAct(String act) {
        Act = act;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    @Override
    public String getAnimalName() {
        return "Duck";
    }
}
