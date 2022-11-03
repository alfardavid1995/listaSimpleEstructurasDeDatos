package listassimplesnoordenadas;

public class ListasSimplesNoOrdenadas {


    public static void main(String[] args) {
        Lista laLista = new Lista();
        laLista.inserta(new Casa(2033, 8));
        laLista.inserta(new Casa(2010, 3));
        laLista.inserta(new Casa(2022, 1));
        laLista.inserta(new Casa(2005, 3));
        
        System.out.println(laLista);
        
        System.out.println("*****Lista con reemplazo menor*****");
        laLista.reemplazar(new Casa(1998,3));
        System.out.println(laLista);
        
         System.out.println("*****Lista con reemplazo mayor*****");
        laLista.reemplazar(new Casa(2040,3));
        System.out.println(laLista);
        
         System.out.println("*****Lista con reemplazo mayor*****");
        laLista.reemplazar(new Casa(2001,3));
        System.out.println(laLista);
        
         System.out.println("*****Lista con reemplazo menor*****");
        laLista.reemplazar(new Casa(1997,3));
        System.out.println(laLista);
        
    }
    
}
