/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3jesussanchez;

import java.util.Scanner;

/**
 *
 * @author JesusSanchez
 */
public class HW3JesusSanchez {

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        
        Scanner input = new Scanner(System.in);
    double baseSalary = 5000.0;    int salesAmount = 10000;
       
        System.out.print("Please enter your desired salary. ");
        
        System.out.print("\n"+"Do not respond with ANY special charaters: ");
        double desSalary = input.nextDouble();
        
        printCommission(10000,5000,100000);
        
        double tarSales = targetSales(desSalary);

System.out.println("You will need to sell $"+tarSales+" in order to acheive your desired salary of $"+desSalary+".");
        
    }
    
     public static double computeCommission(double salesAmount) {
        
        
        double commission = 0.0;
        //use if-else to figure out the commission for the sales amount
        if (salesAmount <= 5000) {
            commission = (salesAmount * 0.08);
        }
        else if (salesAmount <= 10000)
            commission = (5000 * 0.08) + ((salesAmount -5000) * 0.10);
        else
            commission = (5000 * 0.08) + (10000 - 5000) * 0.10 + (salesAmount -10000) * 0.12;
 
        return commission;
    }// end of computeCommission method
      
    public static void printCommission(double begSales, int salesInc, double endSales){
 
        System.out.println("Sales Amount\tCommission Rate");
        
        for (int count=(int)begSales; count <= endSales;count+= salesInc) 
        {
            System.out.println(count+"\t\t\t"+computeCommission((double)count));
        
            
    }
        
    }// end of printCommission method
    
    public static double targetSales(double desSalary){
        //double desiredSalary = double baseSalary + computeCommission;
        
        double baseSalary = 5000.0;
        double salesCounter = 0.00;
        double commissionRate = 0.00;
        
         
     while(desSalary != (int)((baseSalary+commissionRate)*100)/100.0){
            salesCounter += 0.01;  
            commissionRate = computeCommission(salesCounter);
            if (desSalary < baseSalary + commissionRate)
                break;
            
     }
     return (int)(salesCounter * 100)/100.0;
            
    }// end of target sales method
}
