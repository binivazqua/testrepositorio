public class PruebaPerro {
    public static void main(String[] args) {

        Perro perro1 = new Perro();
       // System.out.println(perro1.cambiarNombre());
       String nombre = perro1.cambiarNombre();
       int edad = perro1.cumple(11);
       perro1.mostrar(edad, nombre);
                
    }
}
