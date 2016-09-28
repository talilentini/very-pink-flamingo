public class TestDataTypes{
  
  //give the real grade when a curve is applied
  public int computeGrade(int x){
    
    int grade = x + 10;
    
    return grade;
  }

  public static void main(String[] args){
    
    int origionalGrade = 67;
    
    int curvedGrade = computeGrade(origionalGrade);
    
    System.out.println("New Grade is: " + curvedGrade);
    
    
    
    
    
    
    //review datatypes
    //int --> integer, whole number
    //write a program that holds someone's age
    int age = 18;
    int index = 1;
    
    //double --> decimal number
    double x = 2.3;
      //write a program that holds how much money is in an account
      double balance = 1000.38;
    double portion = 0.5;
    
    //String --> a string of characters
    String a = "cat";
    String b = "lsjafldk!@";
    String c = "32";
    
    String word = a + b; //output ---> "catlsjafldk!@"
    
    System.out.println(word);
    
    
    //char --> a single character
    char xx = 'x';
    char yy = '3';
    char zz = '!';
    
    
  }
}