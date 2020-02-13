package com.ritish.cleancode;
import java.lang.Math;
import com.ritish.cleancode.Interest;
public class InterestCalculator implements Interest
{
    double principleAmount,rateOfInterest;
    int timePeriod;
    InterestCalculator(double principleAmount, double rateOfInterest, int timePeriod)
    {
        this.principleAmount=principleAmount;
        this.rateOfInterest=rateOfInterest;
        this.timePeriod=timePeriod;
    }

    @Override
    public void calculateSimpleAndCompundInterest() {
        double simpleInterest,compoundInterest;
         
        simpleInterest=(principleAmount*timePeriod*rateOfInterest)/100;

        compoundInterest=(principleAmount * (Math.pow(1+(rateOfInterest/100),timePeriod)))-principleAmount;

        System.out.println("Simple Interest "+simpleInterest);
        System.out.println("Compound Interest "+compoundInterest);
    }

}