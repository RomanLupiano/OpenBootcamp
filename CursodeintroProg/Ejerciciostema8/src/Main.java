public class Main {
    public static void main(String[] args) {
        Persona unaPersona = new Persona();
        unaPersona.setNombre("Carlos");
        unaPersona.setTelefono(1221345678);
        unaPersona.setEdad(30);

        System.out.println("El nombre del objeto persona es: " + unaPersona.getNombre());
        System.out.println("La edad del objeto persona es: " + unaPersona.getEdad());
        System.out.println("El telefono del objeto persona es: " + unaPersona.getTelefono());
    }
}

class Persona{
    private int edad, telefono;
    private String nombre;

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getTelefono(){
        return telefono;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

}