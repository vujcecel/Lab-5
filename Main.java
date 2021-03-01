import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    student1.print();

    // Dot operators are better because not unnecessarily adding to the call stack
    // Use getters/setters when doing validation/data protection (make variables private)
    // So if we wanted to validate that the set GPA is between 0.0 and 4.0
    // or the major is a valid major in our database etc.
    Student student2 = new Student();
    student2.name = "Evan Vujcec";
    student2.gpa = 4.3;
    student2.major = "Information Systems";
    student2.print();
    
    ArrayList<Double> gpas = new ArrayList<Double>();
    // Should probably be in try/catch blocks but too much work
    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double sum = 0;
    for (double gpa : gpas)
      sum += gpa;
    System.out.println("The average GPA is " + sum / gpas.size());
  }
}