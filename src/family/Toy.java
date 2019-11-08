package family;

public class Toy {
    private int width;
    private int hight;
    private String company;
    private String price;

    Toy(int width,int hight, String company){
        this.width=width;
        this.hight=hight;
        this.company=company;

    }
    public int getSize(){
        return width*hight;
}
     public String getPrice(){
       if (company.equals("Chicco")){
           this.price="Very hight price";
       }else if (company.equals("Privoz")){
           this.price="Very low price";
         }
       else {
       this.price="error";
       }
       return this.price;
     }



}
