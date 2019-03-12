public class Student
{
    CollegeCourse[] courses = new CollegeCourse[5];
    private int sNum;

    Student(){
        for (int i=0; i<courses.length; i++){
            this.courses[i]=new CollegeCourse();}
    }

    public void setCourseID(String id, int index) {this.courses[index].setCourseID(id);}
    public CollegeCourse getCourse(int index) { return this.courses[index];}
    public void setStudentNum(int stu) {this.sNum=stu;}
    public int getStudentNum() {return this.sNum;}
}