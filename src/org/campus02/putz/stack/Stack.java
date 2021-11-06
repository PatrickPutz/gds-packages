package org.campus02.putz.stack;

public class Stack<T> {

    private T[] array;
    private int counter;
    /*
    private -> nur innerhalb der Klasse
    public  -> von überall verwendbar
    nichts  -> package protected -> innerhalb des packages public, außerhalb des packages private
     */

    public Stack(T[] array){
        this.array = array;
        counter = 0;
    }

    public void push(T value){
        if(counter >= array.length){
            System.out.println("Stack is full.");
            return;
        }
        else{
            array[counter] = value;
            counter++;
        }
    }

    public T pop(){
        if(counter == 0){
            return null;
        }
        else{
            counter--;
            return array[counter];
        }
    }

}
