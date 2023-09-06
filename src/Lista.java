public class Lista {
    Nodo head;
   // TAREA 1 agregar una referencia al último para que la inserción al final sea O(1)

    public Lista() {
    }

    public void insertarInicio(int num){
        Nodo nuevo=new Nodo(num, head);
        head=nuevo;
    }
    // comparaciones peor caso, n=Número de elementos de la lista
    // t(n)=n+1 O(n)
    private Nodo ultimo(){
        if(head==null){
            return null;
        }
        Nodo p=head;
        while(p.next!=null){
            p=p.next;
        }
        return p;
    }
    //comparaciones
    //f(n)=n+1 comparaciones para obtener el último
    //t(n)=f(n)+1
    //t(n)=n+2
    //O(n)
    public void insertarFinal(int num){
        Nodo nuevo=new Nodo(num);
        Nodo back=ultimo();
        if(back==null){
            head=nuevo;
            return;
        }
        back.next=nuevo;
    }


    public void imprimir(){
        Nodo p=head;
        System.out.print("[ ");
        while(p!=null){
            System.out.print(p.data+", ");
            p=p.next;
        }
        System.out.println("]");
    }

    public int size(){
        //TAREA 2:
        // a) calcular el size
        // b) t(n)=?, O(?) justifique.

        return 0;
    }

}
