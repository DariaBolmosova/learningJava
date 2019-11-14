package figures;



import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       Set figures =new TreeSet<Rectangle>();
        figures.add(new Rectangle(10,7));
        figures.add(new Rectangle(2,3));
        figures.add(new Rectangle(6,2));
        figures.add(new Rectangle(9,11));


        for (Object element:figures) {
            System.out.println(element);
        }

            }


        }


