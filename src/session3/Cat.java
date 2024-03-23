package session3;

public class Cat extends Animal{

    private String Act;
    private int Age;



    public Cat(String name, String act, int age) {
        super(name);
        Act = act;
        Age = age;
    }

    public String getAct() {
        return Act;
    }

    public void setAct(String act) {
        Act = act;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }
}
