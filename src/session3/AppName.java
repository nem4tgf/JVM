package session3;

public class AppName {
    public static void main(String[] args) {
        Dog quick = new Dog("Quick",5,120);
        System.out.println("Name: " +quick.getName());
        System.out.println("Animal Name: " +quick.getAnimalName());


        System.out.println("==================");


        //Gọi các phươn thức khai báo trên lớp dog
        System.out.println("Age: "+quick.getAge());
        System.out.println("Height: "+quick.getHeight());

        //The hien tinh da hinh
        Dog quick2 = new PhuQuocDog("PQ Dog", 3,130);
        System.out.println("Animal Name:"+quick2.getAnimalName());

        System.out.println("==================");

        Cat slow = new Cat("Tom","Sleep",4);
        System.out.println("Animal Name:"+slow.getAnimalName());
        System.out.println("Activities: "+slow.getAct());
        System.out.println("Age: "+slow.getAge());

        System.out.println("==================");

        Duck last = new Duck("Quac","Swim",60);
        System.out.println("Animal Name: "+last.getAnimalName());
        System.out.println("Activity: "+last.getAct());
        System.out.println("Height: "+last.getHeight());




    }
}
