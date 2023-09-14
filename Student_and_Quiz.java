import java.util.Scanner;

class Student_and_Quiz {

    public static void main(String[] args) {
        
        Student name = new Student();
        name.getName();
        

        }
    }
    class Student {

            public String getName() {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name = input.nextLine();
                System.out.println(name);
                input.close();
                return name;

            }

            public int addQuiz(int score) {
                int numberOfQuizzez = 0;
                Scanner input = new Scanner(System.in);

                while (numberOfQuizzez < 5) {
                    System.out.print("Enter quiz scores:  ");
                    int quizScore = input.nextInt();
                    numberOfQuizzez++;

                    if (quizScore == 5) {
                        

                    }


                }


                return addQuiz(score);

            }
}