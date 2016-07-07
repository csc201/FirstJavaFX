package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import view.ReportView;

/**
 * test
 */
public class Controller {
    @FXML
    TextField scores1;
    @FXML
    TextField scores2;
    @FXML
    TextField scores3;
    @FXML
    TextField scores4;
    @FXML
    TextField scores5;
    @FXML
    TextField scores6;

    public void calculateGrade() {
        String report="";
        TextField scoresTxtField []= new TextField [6];
        scoresTxtField[0] = scores1;
        scoresTxtField[1] = scores2;
        scoresTxtField[2] = scores3;
        scoresTxtField[3] = scores4;
        scoresTxtField[4] = scores5;
        scoresTxtField[5] = scores6;

        double scores[] = new double[6];

        for(int i=0; i<scores.length; i++) {
            scores[i] = Double.parseDouble(scoresTxtField[i].getText());
            report += ("Your score is " + scores[i] + " and your grade is " + getLetterGrade(scores[i]) + "\n");
        }
        report +="The average score is " + findAverage(scores);

        ReportView reportView = new ReportView(report);
    }

    public static double findAverage(double scores[]){
        double sum = 0;
        for(double eachValue:scores){
            sum += eachValue;
        }
            double average = sum/scores.length;
        return average;
    }
    private char getLetterGrade(double score) {
        char grade;
        int points = (int)(score/10);

        switch(points) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        return grade;
    }
}
