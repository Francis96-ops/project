package Me;

public class Student {
  
  // data fields
  private String name;
  private double[] grades = new double[3];
  private int totalNumberOfStudents = 0;
  
  // constructor
  Student(){
    totalNumberOfStudents++;
  }
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setGrades(double[] grades){
  this.grades = grades;
    
  }
  
  public double[] getGrades(){
    return grades; 
  }
  
  public int getNumberOfStudents(){
    return totalNumberOfStudents;
  }
  
  public double getAverageGrade(){
    double sum = 0;
    for(int i = 0; i < grades.length; i++){
      sum += grades[i];
    }
    
    return sum/grades.length;
  }
  
  public String printStudentDetails(){
    return "Student name is " + name + " average grade is " + getAverageGrade() + " and the current number of students is " + totalNumberOfStudents;
  }
}
