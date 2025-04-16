public class Student {
    private Name name;
    private Course[] courseList = new Course[5];
    private Address address;

    public void addCourse(Course c) {
        System.out.println("Adding a course...");

    }

    public void setAddress(Address address){
        this.address = address;
    }

}
