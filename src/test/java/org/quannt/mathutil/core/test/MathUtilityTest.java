/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quannt.mathutil.core.test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.quannt.mathutil.core.MathUtility.*;

/**
 *
 * @author quans
 */
public class MathUtilityTest {
    @Test
    public void testFactorialGivenRightAgrumentReturnWell(){
        //assertEquals(69, 69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        
    }
}

    //DDT la 1 phan mo rong cua cac UNIT TEST FRAMEWORK
//DATA DRIVEN TESTING
//  KO NHAM VOI TDD: TEST DRIVEN DEVELOPMENT    
//                      VIET CODE VA VIET TEST CAS SONG HANH VOI NHAU, DA HOC XONG

//NHUNG CODE TEST BOC MUIF(BAD SMELLS) TRUNG CODE NHIEU
//NEN NGUOI TA CHE RA CACH VIET CODE TEST DEP HON, GON HON, DE BAO, TRI HON
 