import java.util.Scanner; 
 
public class Main { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    int score = 0; 
 
    // Question 1 
    System.out.println("What is the capital of France?"); 
    System.out.println("A) London"); 
    System.out.println("B) Paris"); 
    System.out.println("C) Madrid"); 
    String answer1 = input.nextLine(); 
    if (answer1.equals("B")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Incorrect. The correct answer is B) Paris."); 
    } 
 
    // Question 2 
    System.out.println("What is the largest continent in the world?"); 
    System.out.println("A) Asia"); 
    System.out.println("B) Africa"); 
    System.out.println("C) Europe"); 
    String answer2 = input.nextLine(); 
    if (answer2.equals("A")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Incorrect. The correct answer is A) Asia."); 
    } 
 
    // Question 3 
    System.out.println("What is the square root of 144?"); 
    System.out.println("A) 12"); 
    System.out.println("B) 14"); 
    System.out.println("C) 16"); 
    String answer3 = input.nextLine(); 
    if (answer3.equals("A")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Incorrect. The correct answer is A) 12."); 
    } 
 
    // Display final score 
    System.out.println("You scored " + score + " out of 3."); 
  } 
} 