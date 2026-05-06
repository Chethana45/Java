import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Collections1{
    HashMap<Integer, String> emp;

    Collections1(){
        emp = new HashMap<>();
    }

    void disp(){
        System.out.println("\nDisplaying all the employee details\n");
        for(Map.Entry<Integer, String> e: emp.entrySet()){
            System.out.println("Employee Id: "+e.getKey()+" Employee name: "+e.getValue()+"\n");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Collections1 c = new Collections1();

        System.out.println("Enter 1 to insert an employee detail");
        System.out.println("Enter 2 to display all the employee details");
        System.out.println("Enter 3 to search for an employee by Id");
        System.out.println("Enter 4 to remove an employee by Id");

        char ch;

        do{
            System.out.print("Enter the choice: ");
            int choice = scan.nextInt(); 
            switch(choice){
                case 1:
                    System.out.print("Enter employee id and name: ");
                    int id = scan.nextInt(); 
                    String name = scan.nextLine();
                    c.emp.put(id, name);
                    break;
                case 2:
                    c.disp();
                    break;
                case 3:
                    System.out.print("Enter the employee id: ");
                    id = scan.nextInt();
                    if(c.emp.containsKey(id)){
                        System.out.println("Employee is found");
                    }else{
                        System.out.println("Employee is not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter the employee id to remove: ");
                    id = scan.nextInt();
                    c.emp.remove(id);
                    c.disp();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            scan.nextLine();
            System.out.println("Do you want to continue(y/n): ");
            ch = scan.nextLine().charAt(0);
        }while(ch=='Y' || ch=='y');
    }
}