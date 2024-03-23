package session3;
//khai bao lop
//lop nay co the chua 1 hc nhieu abtract or nhieu phuong thuc abtract
//cho phet cac lop con ke thua va thay doi hanh vi
public abstract class Animal {
    private String name;

    public Animal(){
        this.name=this.getAnimalName();
    }

    public Animal(String name){
        //Gan gtri mac dinh cho name
        //this.name="Tom";
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    //Abstract day la lp triu tuong: co the dc sua o lop cin
    //Lop con dinh nghia lai hanh vi ma no muon
    //The hien tinh da hinh
    //khong chua ma (code) ben trong
    //Phari thuoc vao 1 lop abs

    public abstract String getAnimalName();


}
