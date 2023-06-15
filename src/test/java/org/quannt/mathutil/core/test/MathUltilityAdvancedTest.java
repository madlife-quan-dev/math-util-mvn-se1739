/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quannt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.quannt.mathutil.core.MathUtility.getFactorial;

/**
 *
 * @author quans
 */
public class MathUltilityAdvancedTest {

    //tao mang 2 chieu chia data se dung cho viec assertE()
    //gom n dua vao va expected tra ve
    //init  long -> object(wrapper class)
    //                      Integer Long
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
        {1, 1},
        {2, 2},
        {4, 24},
        {6, 720}};

        return testData;
    }
    
    //nhoi data nay vao ham assertE()
    @ParameterizedTest
    @MethodSource("initTestData")
                                                         //cot 0
    public void testFactorialGivenRightAgrumentReturnWell(int n, long expected){
        //assertEquals(69, 69);
        assertEquals(expected, getFactorial(n));
        
        
    }

}


//TDD: Test driven development laf ki thuat lap trinh mak dc gan voi viec viet cac test case de kiem thu ngay nhung ham dev mik vua viet
// Viet code chinh la viet code test (JUnit, Unit Test) xen ke voi nhau. 2 mau xanh do lien tuc dien ra


//DDT: Su mo rong them cho qua trinh viet code test (jUnit)
// Data driven testing
// Ki thuat tach bo test data ra 1 cho rieng, tach vao mang, tach vao file excel, hay table; sau do nhoi/fill/map
// cai data tu mang nay vao trong hamf so sanh assertEquals ()
// Giup code de doc hon, de kiem tra xem con thieu test case
// nao hay ko