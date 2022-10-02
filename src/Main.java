public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.SetterEdad(20);
        persona.SetterNombre("Alberto");
        persona.SetterTelefono(900649612);
        System.out.println("Edad: "+ persona.GetterEdad());
        System.out.println("Nombre: "+persona.GetterNombre());
        System.out.println("Telefono: "+persona.GetterTelefono());
    }
}
class Persona{
    private int Edad;
    private String Nombre;
    private int Telefono;

    public void SetterEdad(int edad){
        this.Edad=edad;
    }
    public int GetterEdad(){
        return this.Edad;
    }

    public void SetterNombre(String nombre){
        this.Nombre=nombre;
    }
    public String GetterNombre(){
        return this.Nombre;
    }

    public void SetterTelefono(int telefono){
        this.Telefono=telefono;
    }
    public int GetterTelefono(){
        return this.Telefono;
    }

}