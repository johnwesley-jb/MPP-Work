package A;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ExamData {
    private String studentName;
    private double testScore;

    public ExamData(String studentName, double testScore) {
        this.studentName = studentName;
        this.testScore = testScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getTestScore() {
        return testScore;
    }

    public static void main(String[] args) {
        List<ExamData> data = new ArrayList<ExamData>() {
            {
            add(new ExamData("George",91.3));
            add(new ExamData("Tom",88.9));
            add(new ExamData("Rick",80));
            add(new ExamData("Harold",90.8));
            add(new ExamData("Ignatius",60.9));
            add(new ExamData("Anna",77));
            add(new ExamData("Susan",87.3));
            add(new ExamData("Phil",99.1));
            add(new ExamData("Alex",84));
            }
        };


        DoubleSummaryStatistics stats = data.stream()
                .collect(Collectors.summarizingDouble(ExamData::getTestScore));
        System.out.printf("Average: %.2f%n",stats.getAverage());
        System.out.printf("Min: %.2f%n", stats.getMin());
        System.out.printf("Max: %.2f%n", stats.getMax());
    }


}
