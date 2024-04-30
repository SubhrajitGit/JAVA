class student{
    String name;
    int roll;
    static String College;
    //Static Block RUn Only Once when Class File Upload 
    static{
        College = "DRIEMS";
    }
    //Insted of Declaring Same College Multiple Times We Can Use Static Block To Overcome Memory Load
    public student(String name,int roll){
        this.name = name;
        this.roll = roll;
        // this.College = College;
    }
}
public class staticVar {
    public static void main(String[] args) {
       student s1 = new student("Subhrajit",1);
       student s2 = new student("Suvendu", 2); 
       student s3 = new student("Pabitra", 3); 
    }
}
