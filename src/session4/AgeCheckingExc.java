package session4;
//custom exception
public class AgeCheckingExc extends Exception {
    //Đây là phương thức do tự định nghĩa
    public AgeCheckingExc(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Loi nhap vao tuoi: " + super.getMessage();
    }
}
