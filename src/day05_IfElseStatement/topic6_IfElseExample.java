package day05_IfElseStatement;

public class topic6_IfElseExample {

    public static void main(String[] args) {
        // check if a student will be accepted to school
        // 1) SAT score must be 90 or more
        // 2) writing skill 5 or above

        double stscore = 90;
        int wrscore = 7;

        if(stscore>=90&& wrscore>=5){
            System.out.println("student is accepted");
        }else {
            System.out.println("student is rejected");
        }


    }
}
