package randomNums;


// Отсортировать второй список методом sort списка и 
//компаратором по уменьшению.

import java.util.*;
 

class Number {
    int ModalNo;
    String name;
    int ram;
    Number(int ModalNo, Object object, int ram)
    {
        this.ModalNo = ModalNo;
        extracted();
        this.ram = ram;
    }
    private String extracted() {
        return name;
        
    
    }
}
 

class RamComparator implements Comparator<Number> {
    
    public int compare(Number l1, Number l2)
    {
        if (l1.ram == l2.ram) {
            return 0;
        }
        else if (l1.ram < l2.ram) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
 
class GFG {
    public static void main(String[] args)
    {
        
        ArrayList<Number> l = new ArrayList<Number>();
        l.add(new Number(322,  null, 2));
        l.add(new Number(342,  null, 8));
        l.add(new Number(821,  16, 0));
        l.add(new Number(251,  6, 0));
        l.add(new Number(572, 4, 0));
 
        System.out.println("before sorting");
        System.out.println("Ram"
                           + " "
                           + "Name"
                           + " "
                           + "ModalNo");
        for (Number number : l) {
            System.out.println(number.ram + " "
                               + number.name + " "
                               + number.ModalNo);
        }
        System.out.println();
 
        System.out.println("After sorting(sorted by Ram)");
        System.out.println("Ram"
                           + " "
                           + "Name"
                           + " "
                           + "ModalNo");
 
        
        Collections.sort(l, new RamComparator());
        for (Number number : l) {
            System.out.println(number.ram + " "
                               + number.name + " "
                               + number.ModalNo);
        }
    }
}


//Отсортировать первый список пузырьковой сортировкой самостоятельно, 
//без использования доп методов и классов.
class ArrayBubble{
    private long[] a;   
    private int elems;  

    public ArrayBubble(int max){    
        a = new long[max];          
        elems = 0;                  
    }

    public void into(long value){   
        a[elems] = value;           
        elems++;                   
    }

    public void printer(){          
        for (int i = 0; i < elems; i++){    
            System.out.print(a[i] + " ");   
            System.out.println("");         
        }
        System.out.println("----Окончание вывода массива----");
    }

    public void bubbleSorter(){     
        for (int out = elems - 1; out >= 1; out--){  
            for (int in = 0; in < out; in++){       
                if(a[in] > a[in + 1])              
                    toSwap(in, in + 1);             
            }
        }
    }

    private void toSwap(int first, int second){ 
        long dummy = a[first];     
        a[first] = a[second];       
        a[second] = dummy;          
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(5); 

        array.into(163);       
        array.into(300);
        array.into(184);
        array.into(191);
        array.into(174);

        array.printer();            
        array.bubbleSorter();       
        array.printer();            
    }
}