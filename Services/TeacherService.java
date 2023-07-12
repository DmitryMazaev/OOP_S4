package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private String acadDegree;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName, age, acadDegree);
        count++;
        teachers.add(per);
    }    

    /* public void sortByFIOStdLst()
    {
       // List<Student> newStudentList = new ArrayList<Student>(students);
        teachers.sort(new PersonComparator<Teacher>());
        //return newStudentList;
    } */


}
