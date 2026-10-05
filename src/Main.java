public class Main {
    public static void main(String[] args){
        student s1=new student("s01","ali",18,"IT",1.9);
        student s2=new student("s02","caliyo",20,"BUSINESS",3.4);
        student s3=new student("s03","caasho",19,"ACCOUNTING",3.2);
        student s4=new student("s04","cabdi",21,"CS",3.5);

        s1.displaystudentinfo();
        s1.checkpass();

        s2.displaystudentinfo();
        s2.checkpass();

        s3.displaystudentinfo();
        s3.checkpass();

        s4.displaystudentinfo();
        s4.checkpass();
    }
}
