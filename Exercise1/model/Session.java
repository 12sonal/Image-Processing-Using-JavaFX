package exercise1.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Session {
    private double avgQuizScore = 0;
    private ArrayList<FullTime> fullTimeStudentList;
    private ArrayList<PartTime> partTimeStudentList;

    public Session() {
        this.fullTimeStudentList = new ArrayList<FullTime>();
        this.partTimeStudentList = new ArrayList<PartTime>();
    }

    public void addFullTimeStudent(FullTime student) {
        fullTimeStudentList.add(student);
    }

    public void addPartTimeStudent(PartTime student) {
        partTimeStudentList.add(student);
    }

    public double getAvgQuizScore() {
        return avgQuizScore;
    }

    public ArrayList<FullTime> getFullTimeStudentList() {
        return fullTimeStudentList;
    }

    public ArrayList<PartTime> getPartTimeStudentList() {
        return partTimeStudentList;
    }

    public void calculateAvgQuizScore(Student student, ArrayList<Integer> quizScore) {
        for (int score : quizScore) {
            avgQuizScore += score;
        }
        System.out.println("\nAverage quiz score for " + student.getName() + " is " + avgQuizScore / quizScore.size());
    }

    public void printQuizScore(Student student, ArrayList<Integer> quizScore) {
        quizScore.sort(Comparator.naturalOrder());
        System.out.println("\nQuiz scores for " + student.getName() + " in ascending order\n " + quizScore);
    }

    public void printPartTimeStudentNames() {
        for (PartTime s : partTimeStudentList) {
            System.out.println(s.getName());
        }
    }

    public void printFullTimeStudentScores() {
        for (FullTime s : fullTimeStudentList) {
            System.out.println("Exam scores for full time " + s.getName() + " is " + s.printExamScore());
        }
    }
}
