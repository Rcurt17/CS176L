import java.util.Scanner;

class Student_and_Quiz {

    public static void main(String[] args) {
        
        Student name = new Student();
        name.getName();
        Student quiz = new Student();
        quiz.addQuiz();


        }
    }
    class Student {


            public String getName() {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter your name: ");
                
                String name = input.nextLine();
                
                input.close();
                
                return name;

            }

            public int addQuiz() {
                int numberOfQuizzez = 0;

                int total = 0;
                
                Scanner input = new Scanner(System.in);

                while (numberOfQuizzez < 5) {
                    System.out.print("Enter quiz scores:  ");

                    int quizScore = input.nextInt();
                    
                    int totalQuizScore = total + quizScore;
                    
                    numberOfQuizzez++;

                    if (quizScore == 5) {
                        
                        System.out.println("Your total quiz score is: " + totalQuizScore);
                        
                        input.close();
                        
                        break;     
                    }
                }
                return total;
            }
}