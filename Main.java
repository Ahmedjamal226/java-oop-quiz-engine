package quiz_console_app;

public class Main {
    public static void main(String[] args) {
        Question_service questionService = new Question_service();
        questionService.playQuiz();
        questionService.printScore();
    }}