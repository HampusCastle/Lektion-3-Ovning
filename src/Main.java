import com.Hampus.demo.Models.Student;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {


for(int i = 0; i < 5; i++) {
Student henke = new Student("Benny", 25 + i);
    System.out.println(henke.age);
}


//Student benny = new Student("Benny", 25);
//Student frida = new Student("Frida", 22);

//System.out.println(benny.name);
//System.out.println(frida.name);

//benny.name = "Ulf";
        //frida.name = "Anna";

        //System.out.println(benny.name);
       // System.out.println(frida.name);
    }
}