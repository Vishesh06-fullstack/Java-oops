/**
 * student
 */
public class student {
    int marks[];

    student(int m){
        marks = new int[1];
        marks[0] = m;
    }

    student(student s){
        this.marks = s.marks;
    }

    void show(){
        System.out.println("Marks: " +marks[0]);
    }
    public static void main(String[] args){
       student s1 = new student(90);
       student s2 = new student(s1);

       s2.marks[0] = 50;
       s1.show();
       s2.show();


    }
}