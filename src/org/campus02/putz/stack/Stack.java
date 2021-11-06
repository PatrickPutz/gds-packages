package org.campus02.putz.stack;

public class Stack {

    private int[] array;
    private int counter;
    /*
    private -> nur innerhalb der Klasse
    public  -> von überall verwendbar
    nichts  -> package protected -> innerhalb des packages public, außerhalb des packages private
     */

    public Stack(int[] array){
        this.array = array;
        counter = 0;
    }

    public void push(int value){
        if(counter >= array.length){
            System.out.println("Stack is full.");
            return;
        }
        else{
            array[counter] = value;
            counter++;
        }
    }

    public int pop(){
        if(counter == 0){
            return -1;
        }
        else{
            counter--;
            return array[counter];
        }
    }

}
