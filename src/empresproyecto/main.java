/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresproyecto;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class main {
    public static void main(String[] args) {
        Cliente a = new Cliente();
    Vehiculo b = new Vehiculo();
    ArrayList<Vehiculo> e =  new ArrayList<Vehiculo>(50);
   ArrayList<Cliente> d =  new ArrayList<Cliente>(50);
    AlquilarVehiculo c = new AlquilarVehiculo(1,12,2,1,d,e); 
    c.registrarCliente(a);
    c.registrarVehiculo(b);
    c.OrdenacionBurbujaCliente();
     c.OrdenacionBurbujaVehiculos();
     c.BusquedaBinariaClientes(a);
     c.BusquedaBinariaVehiculos(b);
    c.imprimirClientes();
    c.imprimirVehiculos();
   
     
            
    }
    
    
}
