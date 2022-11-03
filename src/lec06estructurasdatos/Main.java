/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec06estructurasdatos;

/**
 *
 * @author joseriveratencio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona personaExtraida =  new Persona();
        Lista laLista = new Lista();
        laLista.inserta(new Persona(10, "Juan"));
        laLista.inserta(new Persona(5, "Pedro"));
        laLista.inserta(new Persona(30, "Alberto"));
        laLista.inserta(new Persona(20, "Daniela"));
        laLista.inserta(new Persona(15, "Sebastian"));
        
        //System.out.println(laLista.extrae(30).getNombre());
        //laLista.elimina(5);
        //System.out.println("Existe? "+laLista.existe(20));
        System.out.println(laLista);
        
        System.out.println("-------Modificada------");
        // el de metodo modifica
        laLista.modifica(new Persona(15, "Didier"));
        System.out.println(laLista);
        
        //elimina el objeto de la lista
        System.out.println("-------Antes de eliminar------");
        System.out.println(laLista);
        laLista.elimina(20);// aca se borra a el objeto de la lista Daniela
        System.out.println("-------Despues de eliminar------");
        System.out.println(laLista);
        
        //verificar si existe
        System.out.println("-------Verificar si existe 29------");
        System.out.println(laLista.existe(29));//este dato no existe
        System.out.println("-------Verificar si existe 30------");
        System.out.println(laLista.existe(30));// este dato si existe y esta registrado
        
        //extraer 
        System.out.println("-------Mostrar Lista Antes de extraer 5------");
        System.out.println(laLista);
        System.out.println("-------Mostrar lista Despues de extraer 5------");
        System.out.println("dato Extraido "+laLista.extrae(5));
        System.out.println(laLista);
        System.out.println("dato Extraido "+laLista.extrae(10));
        System.out.println(laLista);
        
        
        
        
        
        
        
        
    }
    
}
