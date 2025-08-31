package Exercise1;

import java.util.ArrayList;
import java.util.List;

class Class {
    // 年级
    public String classgrade;
    // 班级
    public int classnumber = 0;
    // 班级人数
    private List<Person> students = new ArrayList<Person>();
    // 添加学生
    public void addStudent(Person student) {
        students.add(student);
    }
    // 删除学生
    public void removeStudent(Person student) {
        students.remove(student);
    }
    // 输出学生列表
    public void getAllStudents() {
        for (Person student : students) {
            System.out.println(student.name);
        }
    }

}

class Person{

    // 姓名
    public String name;
    // 性别
    public String gender;

}
public class homework_1 {
    public static void main(String[] args) {
        Person A = new Person();
        Class _101 = new Class();
        A.name = "AA";
        A.gender = "female";
        _101.addStudent(A);

        System.out.println(A.name + "  " + A.gender);
        _101.getAllStudents();

    }
}
