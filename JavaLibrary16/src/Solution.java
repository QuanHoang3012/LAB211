
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Quan
 */
public class Solution {
    private int numerator;
    private int denominator;



    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = (denominator <= 0) ? 1 : denominator;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
        /* reduce(); */
    }

    public int getDenominator() {
        return denominator;
    }



    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
            //reduce();
        }
    }



    private int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return Math.abs(a);
    }

    private void reduce() {
        int ucln = gcd(numerator, denominator);
        numerator /= ucln;
        denominator /= ucln;
    }


    public Solution add(Solution other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator);
    }


    public Solution subtract(Solution other) {
        int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator);
    }



    public Solution multiply(Solution other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator);
    }


    public Solution divide(Solution other) {
        if (other.numerator == 0) {
            return this;
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Solution(newNumerator, newDenominator);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return this.numerator == other.numerator && this.denominator == other.denominator;
        }
        return true;
    }
     public void display(){
        System.out.println(this.numerator+"/"+this.denominator);
    }
}

