package Me;
import Me.Student;
import java.util.Scanner;

public class ImplementStudent {

  public static void main(String[] args) {
  // create scanner object
  Scanner input = new Scanner(System.in);
  
  // prompt user for input
  System.out.println("Enter student name");
  
  String nem = input.nextLine();
  
  // create an array
  double[] grade = new double[3];
  
  // prompt user for input
  System.out.println("Enter grades");
  
  for(int i = 0; i < grade.length; i++)
  grade[i] = input.nextInt();
  
  // create a student object
  Student francis = new Student();
  
  francis.setName(nem);
  francis.setGrades(grade);
  
  // print result
  System.out.println(francis.printStudentDetails());
  
  }

}
Name: Francis Zgambo Reg number: bsc-com-ne-11-18
