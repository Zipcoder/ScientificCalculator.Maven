package com.zipcodewilmington.scientificcalculator;

public class Error {

    //these methods checks an input value against a series of possible
    //values which could cause an error.

    public boolean IssBadValue(Double input, Double[] not_this){

        for (int i = 0 ;i < not_this.length;i++) {

            if (input == not_this[i]) {
                return true;
            }
        }
    return false;
    }

    public boolean IsBadValue(Double input, Double not_this){

        if (input == not_this) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkForBadTrigValues(Double input, Double not_this){ //not_this MUST be a positive value
        while(input < -not_this){
            input += (2 * not_this);
        }
        while(input > not_this){
            input -= (2 * not_this);
        }
        if(input == not_this || input == -not_this){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkForOutsideRange(Double input, Double lowerlimit, Double higherlimit){
        if(input < lowerlimit || input > higherlimit){
            return true;
        }
        return false;
    }
}
