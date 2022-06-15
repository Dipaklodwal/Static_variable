class Student{
    int rollno;
    String name;
    static String collegename="Deogiri College of Engineering Aurangabad";
    public Student(int rollno, String name){
    this.rollno=rollno;
    this.name= name;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+collegename);
        }
   }
public class Staticvariabledemo{
      public static void main(String[] args) {
       Student S1=new Student(01,"vishal bade");
       Student S2=new Student(02,"prashant chandge");
       Student S3=new Student(03,"umakat kathar");
       Student S4=new Student(04,"yogesh Devkar");
       Student S5=new Student(05, "Dipak Lodwal");
       S1.display();
       System.out.println("--------------------------------------------------");
       S2.display();
       System.out.println("-------------------------------------------------");
       S3.display();
       System.out.println("------------------------------------------------");
       S4.display();
       System.out.println("-------------------------------------------------");
       S5.display(); 
       System.out.println("---------------------------------------------");
      }
}
        

