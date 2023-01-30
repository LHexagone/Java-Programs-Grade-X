//Program2 

import java.util.Scanner; 

class Lab_2{ 
    public static void main(){ 
        Scanner sc = new Scanner(System.in); 
        int a[] = new int[10]; 

        for(int i = 0; i<10; i++){ 
            System.out.println("Enter a Number"); 
            a[i] = sc.nextInt(); 
        } 

        for(int i = 9; I>=0; I--){ 
            System.out.println(i+”Element is”+ a[i]); 
        } 
    } 
} 
