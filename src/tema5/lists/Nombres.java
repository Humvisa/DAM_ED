package tema5.lists;

import java.util.ArrayList;
import java.util.List;

public class Nombres {
    public static void main(String[] args) {
        List<String> nombresAlumnos = new ArrayList<>();
        nombresAlumnos.add("OmarMoro");
        System.out.println(nombresAlumnos.get(0));
        nombresAlumnos.set(0,"MeduGitano");
        System.out.println(nombresAlumnos.get(0));


        nombresAlumnos.add("AngelDemonio");


        for (int i = 0; i < nombresAlumnos.size(); i++){
            System.out.println(nombresAlumnos.get(i));
        }
    }
}
