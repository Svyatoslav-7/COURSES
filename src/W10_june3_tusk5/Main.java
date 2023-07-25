package W10_june3_tusk5;

import java.util.ArrayList;
import java.util.List;

/*
Використовуючи Intelij IDEA, створити проект, пакет. Створити class Main, у ньому створити список, додати вчителів,
яких ви зможете згадати зі школи. І отримати індекс найкращого вчителя та самого не дуже. Вивести список у консоль.
*/

public class Main{
    public static int getTeacherIndex(List<String> teachers,String name){
        return teachers.indexOf(name);
    }
    public static void enterTeachers(List<String> teachers){
        for(int i =0; i<teachers.size(); i++){
            System.out.println(i+" "+teachers.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> teachers=new ArrayList<>();
        teachers.add("Валентина Іванівна");             //0
        teachers.add("Мар'яна Йосифівна");              //1
        teachers.add("Віктор Іванович");                //2
        teachers.add("Арсен Ігорович");                 //3
        teachers.add("Артур Степанович");               //4
        teachers.add("Сергій Миколайович");             //5
        teachers.add("Максим Степанович");              //6


        enterTeachers(teachers);
        System.out.println(" ");

        int goodTeacher=getTeacherIndex(teachers, "Арсен Ігорович");
        int badTeacher=getTeacherIndex(teachers, "Максим Степанович");

        System.out.println("Хороший вчитель: "+goodTeacher+" "+teachers.get(goodTeacher));
        System.out.println("Поганий вчитель: "+badTeacher+" "+teachers.get(badTeacher));
    }
}
