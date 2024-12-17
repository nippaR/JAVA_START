package Array;

class Student {
    int ItNo;
    String Name;
    int marks;
}

public class ObjArrays {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.ItNo = 1;
    s1.Name = "Tahnuja";
    s1.marks = 97;

    Student s2 = new Student();
    s2.ItNo = 2;
    s2.Name = "Nipun";
    s2.marks = 99;

    Student students[] = new Student[2];
    students [0] = s1;
    students [1] = s2;

        // for(int i = 0; i<students.length; i++){
        //     System.out.println(students[i].Name + ":" + students[i].marks);
        // }

        for(Student s: students){
            System.out.println(s.Name + ":" + s.marks);
        }
    }
}
