package family;



import java.util.ArrayList;
import java.util.Scanner;

public class Father extends Person{
  private String name;
 private int number_of_chill;
 private ArrayList<String> football;

    Father(String gender, int year_of_birthday, String color_of_eye,String name) {
        super(gender, year_of_birthday, color_of_eye);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void match_counter(String football) {
        int n=2;
     Scanner name = new Scanner(System.in);
         this.football = new ArrayList<String>();
        for (int i = 0; i <=n; i++) {
            System.out.println("Введите название матча :");
            String value = name.nextLine();
            this.football.add(value);
        }
         System.out.println("У папы всего : " + this.football.size() + " просмотреных матчей");
        for(String match : this.football){

            System.out.println("Названия матча : "+match);
        }

 }

}
