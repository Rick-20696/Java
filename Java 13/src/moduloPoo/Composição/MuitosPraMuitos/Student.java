package M6OO.Composição.MuitosPraMuitos;

import java.util.ArrayList;

public class Student {
    final String name;
    //The var "alunos" list is constant, but the elements are not constant
    //Now the address of memory is fix
    final ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    //method for add course to student
    
    void addCourse(Course course){
        //"courses" going add a object passed with parameter, "course"
        this.courses.add(course);
        //the parameter going add to "courses" ArrayList
        course.students.add(this);
        //that happens because the relation is 'n' for 'n'
    }

    //in method "toString", i'm forced put on "public"
    public String toString(){
        return name;
    }
}
