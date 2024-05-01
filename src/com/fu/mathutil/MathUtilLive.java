
package com.fu.mathutil;

/**
 *
 * @author xu4nvi3t
 */
public class MathUtilLive {

    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);
        
        System.out.println("expected: 5! = 120; actual: " + result);
        //Ky thua kiem thu phan mem : uoc luong gia tri tra ve cua ham la gi
        MathUtil.getFactorial(-5);
    }
    
}
