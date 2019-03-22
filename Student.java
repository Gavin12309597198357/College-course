public class Student
{
    CollegeCourse[] courses = new CollegeCourse[5];
    private int sNum;
    private int CollegeCourse;

    Student(){
        for (int i=0; i<courses.length; i++){
            this.courses[i]=new CollegeCourse();}
    }

    public void setCourseID(String id, int index) {this.courses[index].setCourseID(id);}
    public CollegeCourse getCourse(int index) { return this.courses[index];}
    public void setStudentNum(int stu) {this.sNum=stu;}
    public int getStudentNum() {return this.sNum;}
    public void setCreditHours(int ch, int index) {this.courses[index].setCreditHours(ch);}
    public CollegeCourse getCredit(int index) {return this.courses[index];}
    public void setGrades(char grd, int index) {this.courses[index].setGrades(grd);}
    public CollegeCourse getGrades(int index) {return this.courses[index];}
    public void setCollegeCourse(int cc) {this.CollegeCourse=cc;}
    public int getCollegeCourse() {return this.CollegeCourse;}
}