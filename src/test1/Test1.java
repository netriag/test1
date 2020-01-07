package test1;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        
        
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the number of the day: ");
        
        int day=scanner.nextInt();    
        
        find(day);
    }
    
    static void find(int d){
        
        switch(d){
            case 1:
                System.out.println("It's Sunday");
                break;
            case 2:
                System.out.println("It's Monday");
                break;
            case 3:
                System.out.println("It's Tuesday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 5:
                System.out.println("It's Thursday");
                break;
            case 6:
                System.out.println("It's Friday");
                break;
            case 7:
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("Invalid number!");
        }          
        System.out.println("OJ");
        System.out.println("");
    }    
}
