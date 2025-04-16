public class Course {
    private Student[] classList = new Student[30];
    private Faculty faculty;

    public void addStudent(Student S){
        //add student code here
    }

    public void setFaculty(Faculty faculty){
        this.faculty = faculty;
    }

    public Faculty getFaculty(){
        return this.faculty;
    }
}
