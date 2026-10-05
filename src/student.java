public class student {
    private String studentid;
    private String name;
    private int age;
    private String dep;
    private double gpa;

    private static String universityName ="jamhuriya university";
    public student(String studentid,String name,int age,String dep, double gpa
    ){
        this.studentid=studentid;
        this.name=name;
        this.dep=dep;
        if (age>0){
            this.age=age;
        }
        else {this.age=0;
        }
        if (gpa>=0.0 && gpa<=4.0){
            this.gpa = gpa;
        }
        else{
            this.gpa=0.0;
        }
    }
    public void displaystudentinfo(){
        System.out.println("student id:"+ studentid);
        System.out.println("name :"+name);
        System.out.println("age:" + age);
        System.out.println("dep:"+dep);
        System.out.println("gpa:"+gpa);
        System.out.println("university:"+universityName);

    }
    public void checkpass(){
        if(gpa>=2.0){
            System.out.println("passed");
        }
        else {
            System.out.println("failed");}

    }

}



