import java.util.*;

public class Session {
    private ArrayList<Student> students;

    public Session(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public double calculateAverageQuizScore() {
        double total = 0;
        double count = 0;
        for (Student student: students) {
            for (Map.Entry<String, Integer> set :
                    student.getQuizScores().entrySet()) {
                total += set.getValue();
                count += 1;
            }
        }
        return total/count;
    }

    public void quizScoresInAscending() {
        ArrayList<Integer> quizScores = new ArrayList<>();
        for (Student student: students) {
            for (Map.Entry<String, Integer> set :
                    student.getQuizScores().entrySet()) {
                quizScores.add(set.getValue());
            }
        }

        Collections.sort(quizScores);
        for(Integer quizScore: quizScores) {
            System.out.println(quizScore);
        }
    }

    public void namesOfPartTimeStudents() {
        for(Student student: students) {
            if (student instanceof PartTime) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }

    public void namesOfFullTimeStudents() {
        for(Student student: students) {
            if (student instanceof FullTime) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }

}
