import java.util.Scanner;

public class Perro {
    private String nombre;
    private int edad;
    private String raza = "raza";

    public String cambiarNombre()
    {
        String nuevoNombre = "";
        Scanner in = new Scanner(System.in);
        System.out.println("¿como se llama el perro?");
        nuevoNombre = in.nextLine();
        //System.out.println(nuevoNombre);
        return nuevoNombre;
    }
    public int cumple(int años){
        edad = años;
        return edad;
        //System.out.println(años);
    }
    public void mostrar(int edad, String nombre){
        System.out.println("El perro que se llama " + nombre + " tiene " + edad + " años.");
    }
    
}

