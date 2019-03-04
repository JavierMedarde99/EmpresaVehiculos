/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresproyecto;

/**
 *
 * @author javie
 */


  

import java.util.ArrayList;


/**
 *
 * @author javi
 */
public class AlquilarVehiculo {

    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;
    private int totalClientes;
    private int totalVehiculos;
    private ArrayList<Cliente> clientes;
    private  ArrayList<Vehiculo> vehiculos;
    private AlquilarVehiculo[] alquileres;

    public AlquilarVehiculo(int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler, Cliente a, Vehiculo b) {
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
        this.totalClientes = 0;
        this.totalVehiculos = 0;
        this.vehiculos = new ArrayList<Vehiculo>();
        this.clientes = new ArrayList<Cliente>();

    }

    public static Cliente[] RegistarClienteAleatorio() {
        Cliente[] b = new Cliente[50];
        for (int i = 0; i < b.length; i++) {
            Cliente a = new Cliente();
            b[i] = a;
        }
        return b;
    }

    public static Vehiculo[] RegistarVehiculoAleatorio() {
        Vehiculo[] b = new Vehiculo[50];
        for (int i = 0; i < 50; i++) {
            Vehiculo a = new Vehiculo();
            b[i] = a;
        }
        return b;

    }

   

    @Override
    public String toString() {
        return "AlquilarVehiculo{" + "diaAlquiler=" + diaAlquiler + ", mesAlquiler=" + mesAlquiler + ", a\u00f1oAlquiler=" + añoAlquiler + ", totalDiasAlquiler=" + totalDiasAlquiler + ", totalClientes=" + totalClientes + ", totalVehiculos=" + totalVehiculos + ", clientes=" + clientes + ", vehiculos=" + vehiculos + ", alquileres=" + alquileres + '}';
    }

    

    public void registrarCliente(Cliente nuevo) {
        this.clientes.set(this.totalClientes, nuevo);
        this.totalClientes++;
    }

    public void registrarVehiculo(Vehiculo nuevo) {
        this.vehiculos.set(this.totalVehiculos, nuevo);
        this.totalVehiculos++;
    }

    public void imprimirClientes() {
        System.out.println("NIF cliente\tNombre\n");
        for (int i = 0; i < this.totalClientes; i++) {
            System.out.println(clientes.get(i).toString());
        }
    }

    public void imprimirVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");
        for (int i = 0; i < this.totalVehiculos; i++) {
            System.out.println(vehiculos.get(i).toString());
        }
    }

    private Cliente getCliente(String nif) {
        for (Cliente c : this.clientes) {
            if (c.getNif().equals(nif)) {
                return c;
            }
        }
        return null;
    }

    private Vehiculo getVehiculo(String matricula) {
        for (Vehiculo c : this.vehiculos) {
            if (c.getMatricula().equals(matricula)) {

                return c;
            }
        }
        return null;
    }

    public void alquilarVehiculo(String matricula, String nif, int dias) {

        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);
        }
    }

    public void OrdenacionBurbujaCliente() {
        Cliente tmp = null ;
        int compareTo;
        for (int i = 0; i < 50 - 1; i++) {
            for (int j = i + 1; j < 50; j++) {
                compareTo = clientes.get(i).getNif().compareTo(clientes.get(j).getNif());
                if (compareTo > 0) {
                    clientes.set(i, clientes.get(i));
                    clientes.set(j, clientes.get(j));
                    clientes.set(j, tmp);
                }
            }
        }
    }

    public void OrdenacionBurbujaVehiculos() {
        Vehiculo tmp = null;
        int compareTo;
        for (int i = 0; i < 50 - 1; i++) {
            for (int j = i + 1; j < 50; j++) {
                compareTo = vehiculos.get(i).getMatricula().compareTo(vehiculos.get(j).getMatricula());
                if (compareTo > 0) {
                    vehiculos.set(i, vehiculos.get(i));
                    vehiculos.set(i, vehiculos.get(j));
                    vehiculos.set(j, tmp);
                }
            }
        }
    }

    public int BusquedaBinariaClientes(Cliente clientes1) {
        int compareTo;
        int mitad = 0;
        int izquierda = 0;
        int derecha = 50 - 1;
        boolean encontrado = false;
        while ((izquierda <= derecha) && (!encontrado)) {
            mitad = (izquierda + derecha) / 2;
            compareTo = clientes.get(mitad).getNif().compareTo(clientes.get(mitad).getNif());
            if (clientes.get(mitad) == clientes1) {
                encontrado = true;
            } else if (compareTo > 0) {
                derecha = mitad - 1; //buscar en el trozo izquierdo
            } else {
                izquierda = mitad + 1; // buscar en el trozo derecho
            }
        }
        if (encontrado) {
            return mitad;
        } else {
            return -1;
        }
    }
         public int BusquedaBinariaVehiculos(Vehiculo vehiculo2) {
        int compareTo;
        int mitad = 0;
        int izquierda = 0;
        int derecha = 50 - 1;
        boolean encontrado = false;
        while ((izquierda <= derecha) && (!encontrado)) {
            mitad = (izquierda + derecha) / 2;
            compareTo = vehiculos.get(mitad).getMatricula().compareTo(vehiculos.get(mitad).getMatricula());
            if (vehiculos.get(mitad) == vehiculo2) {
                encontrado = true;
            } else if (compareTo > 0) {
                derecha = mitad - 1; //buscar en el trozo izquierdo
            } else {
                izquierda = mitad + 1; // buscar en el trozo derecho
            }
        }
        if (encontrado) {
            return mitad;
        } else {
            return -1;
        }

    }

}
    

