import session2.Person;
import java.sql.PreparedStatement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person newName = new Person();
        newName.setName("Hai");
        newName.setPhone("12367568");
        newName.setBornYear(1223);
        Person truongGia = new Person("Binh",1992,"098765412");
        Person truongTung =new Person("Tung", 1922, "012351132");
        Person noname; //chua cap phat va khoi tao
        //Lay ten cua doi tuong
        truongGia.getName();
        truongGia.setName("Huy");

        }
    }
