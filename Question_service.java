package quiz_console_app;

import java.util.Scanner;

public class Question_service {
   Question[] questions = new Question[5];
    String[] selection = new String[5];
   public Question_service() {
    questions[0] = new Question(1, "What is the capital of France?", "London", "Berlin", "Paris", "Madrid", "Paris");
    questions[1] = new Question(2, "What is the largest planet in our solar system?", "Earth", "Jupiter", "Saturn", "Mars", "Jupiter");
    questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
    questions[3] = new Question(4, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Pb", "Au");
    questions[4] = new Question(5, "What is the largest mammal?", "Elephant", "Blue Whale", "Giraffe", "Hippopotamus", "Blue Whale");
    }
    public void playQuiz() {
        int i=0;
        for (Question q : questions) {
            System.out.println("Question no. " + q.getId() );
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            Scanner scanner = new Scanner(System.in);
            selection[i]=scanner.nextLine();
            i++;
            
        }
        for(String s : selection) {
            System.out.println(s);
        
        }

        

        }
        public void printScore(){
            int score=0;
            for(int i=0;i<questions.length;i++) {
                if(selection[i].equals(questions[i].getAnswer())) {
                    score++;
                }
            }
            System.out.println("Your score is: " + score);


    }
}
