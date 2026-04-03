package Patterns;

public class Patterns{
    public static void main(String[] args) {
    Patterns.hollowDiamondPattern();
    
    }
    private static void hollowDiamondPattern() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int space=5;space>i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j==1||j==i*2-1)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int space=5;space>i;space--){
                System.out.print(" ");
            }
            
            for(int j=1;j<=i*2-1;j++){
            if(j==1||j==i*2-1)
                System.out.print("*");
            
            else System.out.print(" ");
        }
            System.out.println();
        }
    }
    private static void hollowTrianglePattern() {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==n){
                    System.out.print("* ");
                }
                else{System.out.print("  ");}
            }
        System.out.println();
        }
    }
    public static void hollowBoxPattern(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0|| i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
    public static void snakePattern(){
        int n=3,a=1;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                for(int j=1;j<=n;j++){
            System.out.print(a);
            a++;
           }
            }
            else{
                int b=a-1+n;
                for(int k=1;k<=n;k++){
                    System.out.print(b);
                    b--;
                }
                a+=n;
            }
           
           System.out.println();
        }
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

    public static void pattern9(){
        System.out.println("");
System.out.println("PATTERN 9");
        System.out.println("");
       int count=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println("");
        }
    }
    // 10th Pattern
     public static void pattern10(){
        System.out.println("");
System.out.println("PATTERN 10");
        System.out.println("");

        for(int i=5;i>=1;i--){
            for(int space=5;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               System.out.print(j);
            }
        System.out.println("");
        }
        for(int i=2;i<=5;i++){
            for(int space=5;space>=i;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               System.out.print(j);
            }
        
            System.out.println("");
        }
    }
    // Z Pattern
    public static void zPattern(){
        System.out.println();
        int n=8;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                if(i==0 || i==n-1 ||j==n-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
            }
               
            }
            System.out.println();
        }
    }
    
    public static void butterFlyPattern(){
        System.out.println();
        int len=6;
        // Top Part inclued the center line too
        for(int i=len;i>=1;i--){
            for(int space1=len;space1>i;space1--){ //for space at starting
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int space2=1;space2<=i;space2++){ // for space at middle
                System.out.print("  ");
            }
             for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();}
        // Bottom part of Pattern
        for(int i=2;i<=len;i++){
            for(int space1=len;space1>i;space1--){ //for space at starting
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int space2=1;space2<=i;space2++){ // for space at middle
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        } }
    public static void checkBoardPattern(){
        int n=3;
        for(int i=0;i<n;i++){
            int value=i%2==0?0:1;
            for(int j=0;j<n;j++){
                System.out.print(value);
                value=1-value;
            }
            System.out.println();
        }
    }
    }
