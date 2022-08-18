public class Main {
    public static void main(String[] args) {
    Cliente elCliente = new Cliente();

        elCliente.setNombre("Carlos");
        elCliente.setTelefono(1221345678);
        elCliente.setEdad(30);
        elCliente.setCredito(10000);

        System.out.println("El nombre del objeto es: " + elCliente.getNombre());
        System.out.println("La edad del objeto es: " + elCliente.getEdad());
        System.out.println("El telefono del objeto es: " + elCliente.getTelefono());
        System.out.println("El crédito del objeto es: " + elCliente.getCredito());
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

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    private int salario;
}