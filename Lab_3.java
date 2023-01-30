import java.util.Scanner; 

class Lab_3{ 
    public static void main(){ 
        Scanner sc = new Scanner(System.in); 
        int a[] = new int[10]; 

        for(int i = 0; i<10; i++){ 
            System.out.println("Enter a Number"); 
            a[i] = sc.nextInt(); 
        } 

        for(int i = 1; i<10; i+=2){ 
            System.out.println(i+”Element is”+a[i]); 
        } 
    }
} 
