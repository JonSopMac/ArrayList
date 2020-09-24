package com.mycompany.estructuras191020;

import java.util.List;
import java.util.ArrayList;

public class List_ArrayList {
    
    public static void main(String[] args) {
    int a=0;   
    List<Integer> Numeros;    
    Numeros = new ArrayList<>();
    Numeros.add(10);
    Numeros.add(20);
    Numeros.add(30);  
    
        System.out.println(""+a);//primitivo 
        metodo_primitivo(a);
        System.out.println(""+a);//despues del metodo
        
        Size(Numeros);//Cuantos elementos tiene el ArrayList
        System.out.println("2. "+Numeros);//Array inicial
        Set(Numeros);
        System.out.println("3. "+Numeros);//Cambiar un elemento 
        isEmpty(Numeros);// Devuelve True si el ArrayList esta vacio. Sino Devuelve False
        Add(Numeros);
        System.out.println("5. "+Numeros);//Agregar elementos
        Get(Numeros);//Mostrar elemento especifico del ArrayList
        Remove(Numeros);
        System.out.println("7. "+Numeros);//Remover 1 elemento
        Contains(Numeros);//Devuelve verdadero si esta lista contiene el elemento especificado.
        Clear(Numeros);
        System.out.println("9. "+Numeros);//Limpiar todos los elementos
    }
    
    public static void metodo_primitivo(int a){
    a=20;
    }
    
    public static void Set(List<Integer> Numeros){
    Numeros.set(1,50);    
    }
    
    public static void Add(List<Integer> Numeros){
        Numeros.add(2,40);
    }
    
    public static void Get(List<Integer> Numeros){
        System.out.println("6. "+Numeros.get(2));
    }
    
    public static void Remove(List<Integer> Numeros){
        Numeros.remove(1);
    }
    
    public static void Contains(List<Integer> Numeros){
        System.out.println("8. "+Numeros.contains(40));
    }
    
    public static void Size(List<Integer> Numeros){
        System.out.println("1. "+Numeros.size());
    }
    
    public static void Clear(List<Integer> Numeros){
        Numeros.clear();
    }
    
    public static void isEmpty(List<Integer> Numeros){
        System.out.println("4. "+Numeros.isEmpty());
    }
}
    