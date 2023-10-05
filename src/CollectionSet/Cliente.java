package CollectionSet;

import java.util.Objects;

public class Cliente {
    private String numCuenta;
    private String nombre;
    private String apellidos;
    private String saldo;

    public Cliente(){

    }

    public Cliente(String numCuenta, String nombre, String apellidos, String saldo) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getSaldo() {
        return saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    //valuando para que al analizar el numCuenta sea repetitivo no lo muestre
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(numCuenta, cliente.numCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numCuenta);
    }
}
