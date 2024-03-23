package session3;

public class Dog extends Animal {
    private int age;
    private int height;

    public Dog( String name, int age, int height) {
        //goi toi constructor cua animal
        //gia tri cua field trog lop cha se dc gan
        //Constructor Animal (String name) sẽ dc gọi và gán gtri
        super(name);
        //sau do giá trị field trong lớp con mới dc gán
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override //Thực hiện triển khai phương thức abtract
    public String getAnimalName() {
        return "Dog";
    }
    public static void main(String[] args){
        Dog quick = new Dog("Quick",5,12);
        quick.getAnimalName();
        System.out.println("Name: " +quick.getName());
        System.out.println(" animal name: " +quick.getAnimalName());
    }
}
