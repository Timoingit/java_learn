package Exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1.请使用java对象描述一个动物园
//定义动物基类（Animal）
//        - 属性：名称（name，String类型）。
//        - 方法：
//        - 构造方法：初始化动物名称。
//        - 发出声音方法（makeSound）：在基类中，该方法仅打印“这是一个动物的声音”。
//定义动物园类（Zoo）
//        - 属性：动物列表（animals，ArrayList<Animal>类型），用于存储多种动物对象。
//        - 方法：
//        - 添加动物方法（addAnimal）：接受一个Animal对象作为参数，将其添加到动物列表中。
//        - 展示动物声音方法（showAnimalSounds）：遍历动物列表，调用每个动物的makeSound方法发出声音。
//2.请使用java对象描述当前上课的场景
//定义类如下：
//          - 教室类
//          - 课程类
//          - 人类
//          - 教师类
//          - 学生类
//3.不借助第三方工具类使用Java实现单链表，提供头插、尾插和遍历打印功能


// 动物基类
class Animal {
    // 姓名属性
    private String name;

    // 构造方法
    public Animal(String name) {
        this.name = name;
    }

    // 初始化名称
    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 发出声音方法
    public void sound() {
        System.out.println("这是一个" + this.name + "的声音");
    }
}

// 动物园类
class Zoo{
    // 动物列表
    private List<Animal> animals = new ArrayList<Animal>();

    // 添加动物
    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    // 输出方法
    public void getSounds(){
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}

// 课程类
class Course {
    private String courseid;
    private String coursename;
    private static Map<String,String> coursemap = new HashMap<>();

    static{
        coursemap.put("001","政治");
        coursemap.put("002","英语");
        coursemap.put("003","数学");
        coursemap.put("004","计算机综合基础");
    }

    // getname
    public String getCoursename(String courseid) {
        return coursemap.get(courseid);
    }

    // getid
    public String getCourseid(String  coursename) {
        return coursemap.get(coursename);
    }

}

// 教室类
class Classrooms {
    private String roomid;
    private Map<String, String> courseMap = new HashMap<>();  // 存储<课程ID, 课程名称>

    public Classrooms(String roomId) {
        this.roomid = roomid;
    }
    // 添加课程到教室
    public void addCourse(String courseId, String courseName) {
        courseMap.put(courseId, courseName);
    }
    // 获取教室所有课程
    public Map<String, String> getAllCourses() {
        return new HashMap<>(courseMap);
    }

}

// 人类
class Human {
    protected String name;
    protected int humanid;

    public Human(String name, int humanid) {
        this.name = name;
        this.humanid = humanid;
    }
    public void getname(){
        System.out.println("我是"+ name);
    }

}

// 教师接口
interface teacherInterface {
    void tech();
}

// 教师类
class Teacher extends Human implements teacherInterface {
    // 属性
    private int teacherid;
    public Teacher(String name, int humanid) {
        super(name, humanid);
        this.teacherid = humanid;
    }

    @Override
    public void tech() {
        System.out.println("在教课！");
    }
}

// 学生接口
interface studentInterface {
    void study();
}

// 学生
class Student extends Human implements studentInterface {
    // 属性
    private int studentid; // 学号
    public Student(String name, int humanid) {
        super(name, humanid);
        this.studentid = humanid;
    }
    @Override
    public void study() {
        System.out.println("在上课！");
    }

}

// 节点类
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class SList{
    ListNode head;
    // 头插法：新节点插入到链表头部
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
        // 为空插入
        if (head == null) {
            head = newNode;
            return;
        }
        // 新节点插入
        newNode.next = head;
        head = newNode;
    }

    // 尾插法
    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        // 为空插入
        if (head == null) {
            head = newNode;
            return;
        }
        // 新节点插入
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    // 遍历打印链表
    public void printList() {
        ListNode cur = head; // 从头节点开始遍历
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}

public class homework_3 {

    public static void main(String[] args) {
        // testAnimal();
        // testCourse();
        testList();
    }
    // 动物测试
    public static void testAnimal(){
        // 新建动物
        Animal tiger = new Animal("tiger");
        Animal duck = new Animal("duck");

        // 加入动物园
        Zoo zoo = new Zoo();
        zoo.addAnimal(tiger);
        zoo.addAnimal(duck);

        // 输出动物园列表中动物对象的叫声
        zoo.getSounds();

    }

    // 学生、老师、教师、课程、教室测试
    public static void testCourse(){

        Course CourseList = new Course();

        System.out.println("001号课程名称: " + CourseList.getCoursename("001"));
        System.out.println("002号课程名称: " + CourseList.getCoursename("002"));
        System.out.println("003号课程名称: " + CourseList.getCoursename("003"));
        System.out.println("004号课程名称: " + CourseList.getCoursename("004"));

        Classrooms room101 = new Classrooms("101");
        Classrooms room202 = new Classrooms("202");

        room101.addCourse("003", "高等数学");
        room202.addCourse("004", "计算机科学导论");

        System.out.println("101教室课程: " + room101.getAllCourses());
        System.out.println("202教室课程: " + room202.getAllCourses());

        Teacher professorWang = new Teacher("王教授", 1001);
        professorWang.getname();
        professorWang.tech();

        Student studentZhang = new Student("张三", 2001);
        studentZhang.getname();
        studentZhang.study();

    }

    // 链表测试
    public static void testList(){
        SList list = new SList();
        System.out.println("头插法");
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        SList list2 = new SList();
        System.out.println("尾插法");
        list2.addLast(3);
        list2.addLast(2);
        list2.addLast(1);
        list2.printList();

    }

}


