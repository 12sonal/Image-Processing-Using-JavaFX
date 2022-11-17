import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    private static String[] names = {"John", "Burner", "Carry", "Alex", "Maxwell", "Fernando", "Roman", "Brock",
            "Turner", "Bell", "Cook", "Root"};
    private static String[] subjects = {"Mathematics", "Data Structure", "Java", "Python", "Physics", "Chemistry"};
    private static String[] countries = {"USA", "Japan", "Australia"};
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            HashMap<String, Integer> quizScores = new HashMap<>();
            for (int j = 0; j < 15; j++) {
                int minScore = 0;
                int maxScore = 10;
                int quizScore = (int) (Math.random()*(maxScore-minScore+1)+minScore);

                int subjectIndex = (int) (Math.random()*((subjects.length - 1) +1)+0);
                quizScores.put(subjects[subjectIndex], quizScore);
            }

            int firstNameIndex = (int) (Math.random()*((names.length - 1) +1)+0);
            int lastNameIndex = (int) (Math.random()*((names.length - 1) +1)+0);
            int countryIndex = (int) (Math.random()*((countries.length - 1) +1)+0);
            int examScore1 = (int) (Math.random()*((500 - 1) +1)+0);
            int examScore2 = (int) (Math.random()*((500 - 1) +1)+0);

            int partTime = (int) (int) (Math.random()*((1 - 0) +1)+0);
            if (partTime == 1) {
                Student student = new PartTime(names[firstNameIndex], names[lastNameIndex], countries[countryIndex], quizScores);
                students.add(student);
            }
            else  {
                Student student = new FullTime(names[firstNameIndex], names[lastNameIndex], countries[countryIndex], quizScores, examScore1, examScore2);
                students.add(student);
            }
        }


        Session session = new Session(students);
        System.out.println("Average quiz score is: " + session.calculateAverageQuizScore());
        System.out.println("\nQuiz Scores in ascending is: ");
        session.quizScoresInAscending();
        System.out.println("\nNames of part time students: ");
        session.namesOfPartTimeStudents();
        System.out.println("\nNames of full time students: ");
        session.namesOfFullTimeStudents();
    }
}
