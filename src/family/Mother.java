package family;

import java.util.ArrayList;

public class Mother extends Person{
  private String name;
  public ArrayList<String> books;

Mother(String gender, int year_of_birthday, String color_of_eye,String name){
  super(gender,year_of_birthday,color_of_eye);
  this.books = new ArrayList<String>();
  this.name=name;
}


  public String getName() {
    return this.name;
  }

  public void setBooks(String book){
    this.books.add(book);
  }

  public void printAllbooks(){
    for (String show: this.books) {
      System.out.println(show);
    }
  }


}
