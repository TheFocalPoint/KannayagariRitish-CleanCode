package com.ritish.cleancode;
import java.util.*;

public class ReadInput
{
    static Scanner sc;
    public static void readInputInterests()
    {
         sc =  new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double principleAmount=sc.nextDouble();

        System.out.println("Enter the Rate Of Interest");
        double rateOfInterest = sc.nextDouble();

        System.out.println("Enter the Time Period in Years");
        int timePeriod=sc.nextInt();

        InterestCalculator calculate =new InterestCalculator(principleAmount,rateOfInterest,timePeriod);
        calculate.calculateSimpleAndCompundInterest();
    }
    public static void readInputHouseValues()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter Material Standard");
        System.out.println("Any one among these , Standard Materials , Above Standard Materials , High Standard Materials ");
        String materialStandard = sc.nextLine();
        
        System.out.println("Enter total area of the house in sqft");
        int totalHouseArea = sc.nextInt();

        CalculateHouseValue calculate = new CalculateHouseValue(materialStandard, totalHouseArea);
        calculate.estimateHouseCost();
    }
}
