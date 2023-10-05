import CollectionSet.Cliente;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("2498942","Luis Kinn","Flores","2900");
        Cliente cliente2 = new Cliente("2429046","Luisa","Quispe","2800");
        Cliente cliente3 = new Cliente("2498892","Luz","Ccarahuancco","4200");
        Cliente cliente4 = new Cliente("2424524","Luciana","Rojas","2200");
        Cliente cliente5 = new Cliente("2424524","Luciana","Rojas","2200");

        Set<Cliente> clienteBanco = new HashSet<Cliente>();

        clienteBanco.add(cliente1);
        clienteBanco.add(cliente2);
        clienteBanco.add(cliente3);
        clienteBanco.add(cliente4);
        clienteBanco.add(cliente5);

        //iteramos para eliminar datos duplicados
        Iterator<Cliente> clienteIterator = clienteBanco.iterator();
        while (clienteIterator.hasNext()){
            String nomCliente = clienteIterator.next().getNombre();
            if (nomCliente.equals("Luiciana")){
                clienteIterator.remove();
            }
        }
        //para recorer la coleccion
        for (Cliente clienteX: clienteBanco) {

            System.out.println(
                    "NOMBRE Y APELLIDO: " + clienteX.getNombre() + " " + clienteX.getApellidos() + "\n" +
                    "NUMERO DE CUENTA: " + clienteX.getNumCuenta() + "\n" +
                    "SALDO DE CUENTA: S/ " + clienteX.getSaldo()
            );

            System.out.println("____________________________________________");
        }



        //usando iterator
        /*Iterator<Cliente> clienteIterator = clienteBanco.iterator();
        while (clienteIterator.hasNext()){
            String nombreCliente = clienteIterator.next().getNombre();
            System.out.println(nombreCliente);
        }*/
    }
}