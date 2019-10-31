import java.util.ArrayList;
import java.util.List;

public class TongKet{
    public static void main(String[] args) {

        // CHAY TONG TOAN FILE DA LAM // 
        System.out.println("-------- Thong Tin -------");
        List<Person> listStudents = new ArrayList<>();

        Subject[] subjectsStudent1 = {
                new Subject("Lap Trinh Mang", 9),
                new Subject("Lap Trinh C", 8),
                new Subject("Cau Truc Du Lieu", 7)
        };
        Subject[] subjectsStudent2 = {
                new Subject("Toan Roi Rac", 10),
                new Subject("Ki Nang Mem", 7),
                new Subject("Lap Trinh Web", 9)
        };
        Subject[] subjectsStudent3 = {
                new Subject("Dai So", 8),
                new Subject("Phuong Phap Tinh", 9),
                new Subject("NLCB1", 9)
        };
        Person student1 = new Student("Hoang Ngoc Long", 23, 64121, subjectsStudent1);
        Person student2 = new Student("Vu Tat Thanh", 23, 64154, subjectsStudent2);
        Person student3 = new Student("Tran Van A", 23, 64112, subjectsStudent2);
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        for (Person el : listStudents) {
            System.out.println(el);
            System.out.println("Diem Trung Binh: " + ((Student)el).DTB());
            System.out.println("-.-.-.-.-.-");
        }


     /* CHAY TONG TOAN FILE DA LAM */ 
        System.out.println("------------------------------------------------------");
        List<Person> listLecturers = new ArrayList<>();

        Subject[] subjectsLecturer1 = {
                new Subject("Dien Toan Dam May"),
                new Subject("Ky Nang Thuyet Trinh"),
                new Subject("CT")
        };

        Subject[] subjectsLecturer2 = {
                new Subject("Truyen Du Lieu"),
                new Subject("JAVA")
        };


        Person lecture1 = new Lecturer("Luong Cong Nho", 32, 22514, subjectsLecturer1);
        Person lecture2 = new Lecturer("Dang Nam Hai Trieu", 33, 66584, subjectsLecturer2);
        listLecturers.add((lecture1));
        listLecturers.add((lecture2));

        System.out.println("--------Thong Tin Giang Vien--------");
        for (Person el : listLecturers) {
            if(((Lecturer)el).isAttempSomeClass("CT")){
                System.out.println(el);
            }
        }
    }
}
