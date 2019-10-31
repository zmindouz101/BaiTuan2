import java.util.Arrays;

public class Lecturer extends Person {
    private int lectureID;
    private Subject[] subjects;

    public Lecturer(int lectureID, Subject[] subjects) {
        this.lectureID = lectureID;
        this.subjects = subjects;
    }

    public Lecturer(String name, int age, int lectureID, Subject[] subjects) {
        super(name, age);
        this.lectureID = lectureID;
        this.subjects = subjects;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    private String getSubjectName(){
        String out = "";
        for(int i = 0; i < subjects.length; i++){
            out += (subjects[i].getSubjectName() + ", ");
        }
        return out;
    }

    public boolean isAttempSomeClass(String className){
        for(int i = 0; i < subjects.length; i++){
            if(subjects[i].getSubjectName().equals(className)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", lectureID=" + lectureID +
                ", subjects=" + getSubjectName() +
                '}';
    }
}
