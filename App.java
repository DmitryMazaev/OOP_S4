import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;

public class App {
    public static <T> void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        Teacher t1 = new Teacher("Иван", 25, "Доцент");
        Teacher t2 = new Teacher("Игорь", 23, "Профессор");
        Teacher t3 = new Teacher("Алексей", 58, "Старший преподаватель");

        List<Teacher> teacherList = new ArrayList<Teacher>();

        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        for (Teacher teacher : teacherList) 
        {
            System.out.println(teacher);
        }

        PersonComparator<Teacher> comT2 = new PersonComparator<Teacher>();

        for (int i = 0; i < teacherList.size(); i++) 
        {
            for (int j = 0; j < teacherList.size(); j++) 
            {
                if (i != j)
                {
                    comT2.compare(teacherList.get(i), teacherList.get(j));
                    System.out.println(comT2.compare(teacherList.get(i), teacherList.get(j))); //Почему выводит 8 и -8?
                }
                
            }
        }
        //Collections.sort(teacherList); ////Вопрос!


        System.out.println("=====================");
        for (Teacher teacher : teacherList) 
        {
            System.out.println(teacher);
        }

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        


        //comS.compare(s1, t2);
        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        //EmploeeController empControll = new EmploeeController();
        //EmploeeController.paySalary(e1);
       // EmploeeController.paySalary(s1);
        //empControll.paySalary(e1);
        //empControll.paySalary(s1);

        

    }
}
