package M6OO.Composição.MuitosPraMuitos;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student("Aline");
        Student student2 = new Student("Teixeira");
        Student student3 = new Student("Ramos");
        Student student4 = new Student("Ricardo");

        Course course1 = new Course("Java");
        Course course2 = new Course("HTML5 e CSS3");
        Course course3 = new Course("Python");

        //i can add by two objects
        course1.addStudent(student1);
        course1.addStudent(student2);
        //adding by course
        course2.addStudent(student3);
        course2.addStudent(student1);
        //adding by student
        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        //give me all students of courseX
        for (Student student: course1.students){
            //if i put only the variable in SOUT, i need of method "toString"
            //else, the return in execution will the weird name
            System.out.println(student);
            System.out.println(student.name + " does the course " + course1.name);
        }

        System.out.println();
        for(Course course: student1.courses){
            System.out.println("Courses of student " + student1.name + "is" + course.name);
        }

        System.out.println();

        //how a student has many courses, i can access,
        // through index of courses, the students
        System.out.println(student1.courses.get(0).students);
    }

}
