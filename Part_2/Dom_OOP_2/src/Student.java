

public class Student extends Person {
    public static final int MIN_SCORE = 2;
    public static final int MAX_SCORE = 6;
    double score;
    Student (String name,short age,boolean isMale,double score) {
        super(name,age,isMale);
        if (score < MIN_SCORE || score >MAX_SCORE) {
            this.score = MIN_SCORE;
        } else {
            this.score = score;
        }
        
    }

   
    void showStudentInfo() {
        System.out.println(this.name + " " + this.age + " " + this.isMale + " " + this.score);
        
    }
    
    
}