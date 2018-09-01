
package exceptioninjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ExceptionInJava {

    public static void main(String[] args) {
        int phoneNo = 0;
        String password;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phone no :");
        try{
            phoneNo=sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Exception occured : "+e);
        }
       
        sc.nextLine();
        System.out.println("Enter password : ");
        password=sc.nextLine();
        if(phoneNo==0000 && password=="user"){
            System.out.println("Login Successful");
            JOptionPane.showMessageDialog(null,"Login Successful");
        }
        else{
            System.out.println("Login failed.");
        }
    }
    
}
