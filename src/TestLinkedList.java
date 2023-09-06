import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        String[] nombres={"Juan","Ana", "Isabel", "Ricardo"};
        int size=4;
        //operaciones:
        //agregar, eliminar, buscar, obtener
        List<String> misNombres=new LinkedList<String>();
        misNombres.add("Juan");
        misNombres.add("Ana");
        misNombres.add("Isabel");
        misNombres.add("Ricardo");

        print(nombres,size);
        System.out.println(Arrays.toString(misNombres.toArray(new String[0])));
        size=eliminar(nombres,0,size);
        misNombres.remove(0);

        print(nombres,size);
        System.out.println(Arrays.toString(misNombres.toArray(new String[0])));

        misNombres.add(0, "Miguel");
        System.out.println(Arrays.toString(misNombres.toArray(new String[0])));

        //----------------------
        //probar nuestra implementación de linkedList
        Lista miLista=new Lista();
        for(int i=0;i<10;i++){
            miLista.insertarFinal(i);
        }
        Lista miLista2=new Lista();
        for (int i = 0; i < 10; i++) {
             miLista2.insertarInicio(i);
        }
        miLista.imprimir();
        miLista2.imprimir();

    }

    public static int eliminar(String[] arr, int pos,int size){
        for (int i = pos; i < size-1; i++) {
            arr[i]=arr[i+1];
        }
        return --size;
    }

    public static void print(String[] arr, int size){
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+", ");

        }
        System.out.println("]");
    }


}
