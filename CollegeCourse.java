public class CollegeCourse
{
    private String CourseID;
    private int CourseHours;
    private char Grades;
    
    /** 
     ID Section:
     */
    public String getCourseID()
    {
        return this.CourseID;
    }
    
    
    public void setCourseID(String ID){
        this.CourseID= ID;
    }
    
    
    /** 
     Credit Hours Section:
     */
    
    public int getCreditHours(){
        return this.CourseHours;
    }
    
    public void setCreditHours(int CH){
        this.CourseHours= CH;
    }
    public char getGrades(){
        return Grades;
    }
    
    public void setGrades(char Grd){
        this.Grades= Grd;
    }
}