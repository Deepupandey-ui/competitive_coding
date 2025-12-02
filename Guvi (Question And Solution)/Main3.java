//Q.3 :-1657. Student Result Evaluation


import java.util.Scanner;
interface Marks{
   void enterMarks(int marks);
}
interface Attendence{
    void enterAttendance(int attendance);
}
class Student implements Marks,Attendence{
    int marks;
    int attendence;
   public void enterMarks(int marks){
        this.marks=marks;
    }
   public void enterAttendance(int attendence){
        this.attendence=attendence;
    }
  public  void checkResult(){
        if(marks>=40 && attendence>=75){
            System.out.println("Result: Pass");
        }
        else{
            System.out.println("Result: Fail");
        }
    }
    
}
public class Main3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        int attendence=sc.nextInt();
        Student ac=new Student();
        ac.enterMarks(marks);
        ac.enterAttendance(attendence);
        ac.checkResult();
    }
} 