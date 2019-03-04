/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresproyecto;

import java.util.Random;

/**
 *
 * @author javie
 */
class Cliente {
     private String nif;
    private String nombre;
    private String apellidos;

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

     public Cliente() {
         Random rdm = new Random();
         String[] a = new String[7];
         int b = rdm.nextInt(5);
         int c = rdm.nextInt(5);
         for(int i=0;i<a.length;i++){
             int d = rdm.nextInt(10);
             String num = Integer.toString(d);
             a[i]=num;
         }
         char letra = (char) (65 + rdm.nextInt(90 - 65));
         this.nif=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+letra;
        
        switch (b){
             case 0:
                 this.nombre="Javi";
                 break;
                 case 1:
                 this.nombre="Jose";
                 break;
                 case 2:
                 this.nombre="Maria";
                 break;
                 case 3:
                 this.nombre="Manuel";
                 break;
                 case 4:
                this.nombre="Diego";
                 break;
         }
       switch (c){
             case 0:
                 this.nombre="Perez";
                 break;
                 case 1:
                 this.nombre="Sanchez";
                 break;
                 case 2:
                 this.nombre="Lopez";
                 break;
                 case 3:
                 this.nombre="Fernández";
                 break;
                 case 4:
                this.nombre="Rodríguez";
                 break;
         }

    }
    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    @Override
    public String toString() {
        return "Cliente{" + "nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    
    

}
