package family;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {




Father father =new Father("мужской",1975,"голубые","Анфасий");
 System.out.println("Меня зовут : "+father.getName());


 Mother mother=new Mother("женский",1980,"зеленіе","Анфиса");
        mother.setBooks("jgsldkgf");
        mother.printAllbooks();
        System.out.println(mother.getColor_of_eye());
        System.out.println(mother.getGender());
Daughter daughter=new Daughter(mother);
        System.out.println(daughter.mother.getColor_of_eye());



    }
}
