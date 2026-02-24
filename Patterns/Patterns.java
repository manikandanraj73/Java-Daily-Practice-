package Patterns;

public class Patterns{
    public static void main(String[] args) {
    Patterns.pattern1();
    Patterns.pattern2();
    Patterns.pattern3();
    Patterns.pattern4();
    Patterns.pattern5();
    Patterns.pattern6();
    Patterns.pattern7();
    Patterns.pattern8();
    }
    // first Pattern
public static void pattern1(){
            System.out.println("");

    System.out.println("PATTERN 1");
            System.out.println("");

    for(int i=1; i<=5; i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
}
// second Pattern

public static void pattern2(){
            System.out.println("");

    System.out.println("PATTERN 2");
        System.out.println("");

    for(int i=1; i<=5; i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println("");
    }
}
// third Pattern
public static void pattern3(){
            System.out.println("");

    System.out.println("PATTERN 3");
            System.out.println("");

    for(int i=1; i<=5; i++){
        for(int j=5;j>=i;j--){
            System.out.print(j);
        }
        System.out.println("");
    }
}
// fourth Pattern
public static void pattern4(){
            System.out.println("");

    System.out.println("PATTERN 4");
            System.out.println("");

    for(int i=5; i>=1; i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
    for(int i=2; i<=5; i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
}
public static void pattern5(){
     System.out.println("");

    System.out.println("PATTERN 5");
            System.out.println("");

    for(int i=5;i>=1;i--){
        for(int space=1;space<i;space++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
    
    for(int i=1;i<=5;i++){
        for(int space=1;space<i;space++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
    }
}
// six th Pattern  (PERFECT TRIANGLE)

public static void pattern6(){
            System.out.println("");

    System.out.println("PATTERN 6");
            System.out.println("");

    for(int i=1; i<=5; i++){
        for(int space=5;space>i;space--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}
// seven th Pattern  DIAMOND PATTERN

public static void pattern7(){
            System.out.println("");

    System.out.println("PATTERN 7 ");
        System.out.println("");

    for(int i=1; i<=5; i++){
        for(int space=5;space>i;space--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }

    for(int i=4; i>=1; i--){
        for(int space=5;space>i;space--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}
// EIGHTH PATTERN

public static void pattern8(){    
        System.out.println("");

    System.out.println("PATTERN 8");
       
    
    System.out.println("");

    for(int i=5; i>=1; i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int space=5;space>i;space--){
            System.out.print(" ");
        }
        for(int space=5;space>i;space--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print(k);
        }
        System.out.println("");
        
    }

    for(int i=2; i<=5; i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int space=5;space>i;space--){
            System.out.print(" ");
        }
        
        for(int space=5;space>i;space--){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");
        
    }
}

}
