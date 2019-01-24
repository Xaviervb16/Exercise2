package com.company;

public class Main {
/*Xavier Bradley 1/24/2019 Provides a list of temps and precipitation given certain conditions

  */
    public static void main(String[] args) {
	    int[] highTemps = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
	    String[] dayWeek = {"Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"};
	    for(int i = 0; i < 7; i++){
            if (precipitation[i] > 49 && highTemps[i] <33){
                System.out.println(dayWeek[i] + " will most likely snow with a high of " + highTemps[i]);
            }
        }
    }
}
