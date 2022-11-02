/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec06estructurasdatos;

/**
 *
 * @author joseriveratencio
 */
public class Lista {
    private Nodo cabeza;
    
    public void inserta(Persona p){
        if(cabeza==null){
            cabeza = new Nodo(p);
        }else if(p.getId()<cabeza.getDato().getId()){
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza=aux;
        }else if(cabeza.getNext()==null){
            cabeza.setNext(new Nodo(p));
        }else{
           Nodo aux = cabeza;
           while (aux.getNext() != null &&
                   aux.getNext().getDato().getId()
                   <p.getId()){
               aux=aux.getNext();
           }
           Nodo temp = new Nodo(p);
           temp.setNext(aux.getNext());
           aux.setNext(temp);
        } 
    }
    
    public boolean existe (int id){//mariana
        boolean esta = false;
        //Busca en lista, y retorna true si una persona tiene el id
        //en la lista
        if (cabeza != null){
            //Si hay algo en la lista buscaré
            Nodo aux = cabeza;
            //utilizo aux como indice

            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getId() < id){
                aux = aux.getNext () ;//avanzo en la lista
            }

            //verdadero si lo encontró
            esta = (aux != null && aux.getDato().getId()== id);
        }

        return esta;
    }
    
    public void modifica (Persona p) {//
        //busca a si existe alguien con el id, y le actualiza el nombre
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            Nodo aux = cabeza; //utilizo aux como indice
            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getDato().getId() < p.getId()) {
                aux = aux. getNext (); //avanzo en la lista
            }
            // Si lo encuentra hago el cambio
            if (aux != null && aux. getDato () .getId () == p.getId ()){
                //Solo básta cambiar nombre
                aux.getDato().setNombre(p.getNombre()) ;
            }
        }
    } 
    public void elimina (int id) {
        //Si una persona tiene el id, lo elimina
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDato().getId() == id) 
            {
                cabeza = cabeza.getNext();
            } 
            else {
                Nodo aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux. getNext () != null &&
                    aux.getNext () .getDato () .getId() < id) {
                    aux = aux.getNext () ;
                }
                //avanzo en la lista
            
                // si es el de adelante lo borro
                if (aux.getNext () != null &&
                aux.getNext () .getDato () .getId () == id) {
                    aux. setNext (aux.getNext () .getNext ()); //cambio las referencias
                }
            }
        }
    }
    
    public Persona extrae (int id) {
        Persona p = null;
        //si una persona tiene el id, lo extrae (eliminando y retornando)
        if (cabeza != null) { //Si hay algo en la lista buscaré
            if (cabeza.getDato () .getId () == id) {//en caso que el id buscado sea el primero 
                p = cabeza.getDato();// en caso de ser cabeza el valor del ID a extraer devolver la cabeza
                cabeza = cabeza. getNext () ;// convertir el siguiente dato a la cabeza para que la cabeza sea eliminada
            } else {// si no es el primero la cabeza pasa a ser el aux
                Nodo aux = cabeza; //utilizo aux como indice
                //Mientras no se acabe la lista y el elemento
                //de la lista sea menor que el buscado
                while (aux. getNext () != null && aux.getNext() .getDato(). getId()//si el ID del nodo aux siguiente es menor que el ID que andamos buscando continue buscando
                < id){
                    aux = aux. getNext () ;
                    //avanzo en la lista
                }
                // Si es el de adelante... quardo la persona y lo borro
                if (aux. getNext () != null && aux. getNext () .getDato () .getId() == id) {
                    p = aux. getNext () .getDato () ;
                    aux. setNext (aux.getNext () .getNext () ) ;//cambio las referencias
                }
            }
        }
        return p;
    }
    
    public boolean estaVacio(){
        boolean tieneAlgo= false;
        if(cabeza==null){
            tieneAlgo = true;
        }
        return tieneAlgo;
    }
    
    public Persona extraeModificado(int id){
        Persona p  = null;
        if (!estaVacio()){
            if(existe(id)){
                Nodo aux = cabeza;
                while (aux.getNext() != null ){
                    aux = aux.getNext () ;//avanzo en la lista
                    if(aux.getDato().getId()== id){
                        p = aux.getDato();
                    }
                }
                elimina(id);
            }  
            
        }       
    return p;
    }
    
    @Override
    public String toString(){
        Nodo aux = cabeza;
        String s="\nLista:\n";
        while(aux!=null){
            s+=aux+",\n";
            aux=aux.getNext();
        }
        return s;
    }
}
