package family;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String gender;
  private int year_of_birthday;
  private String color_of_eye;

    Person(String gender, int year_of_birthday, String color_of_eye) {
        this.gender = gender;
        this.year_of_birthday = year_of_birthday;
        this.color_of_eye = color_of_eye;
    }
    public Person(String gender, int year_of_birthday) {
        this.gender = gender;
        this.year_of_birthday = year_of_birthday;
    }

    public String getColor_of_eye() {
        return this.color_of_eye;
    }

    public void setColor_of_eye(String color_of_eye) {
        this.color_of_eye = color_of_eye;
    }

    public void setGender(String gender) {
        List<String> list = Arrays.asList("мужской ","женский");
        if (list.contains(gender)){
            this.gender=gender;
        }else {
            this.gender="error";
        }

    }

    public String getGender() {
        return this.gender;
    }

    public int getYear_of_birthday() {
        return this.year_of_birthday;
    }

    public int age () {
      int value = 2019 - year_of_birthday;
        return value;
  }

}
