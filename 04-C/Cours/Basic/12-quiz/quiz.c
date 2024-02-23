// Question : 
// Write a program that converts 27o from degrees Fahrenheit F to degrees Celsius C using the following formula, and write the result to the screen: C= (F-32)/1.8

#include <stdio.h>

double F_C(double degF){
    double degC = (degF -32) / 1.8; 
    return degC;

}