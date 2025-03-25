package tudelft.romans;

public class NumerosRomanos {


    private static int numCuenta = 0;
    private String nombre;
    private int saldo;


    public NumerosRomanos(){ // con los getters y setter no es necesario introducir datos en el constructor
        numCuenta++;
        nombre = "Desconocido";
        saldo =0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void mostrarInfo(){
        System.out.println("El cliente: " + this.nombre + " | Saldo: " +this.saldo);
    }

}

