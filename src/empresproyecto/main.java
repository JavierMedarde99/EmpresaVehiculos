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
public class main {
    Cliente a = new Cliente();
    Vehiculo b = new Vehiculo();
    AlquilarVehiculo c = new AlquilarVehiculo(1,12,2,1,a,b);
     c.imprimirClientes();
        a.imprimirVehiculos();
        a.OrdenacionBurbujaCliente();
        a.OrdenacionBurbujaVehiculos();
            
    
}
