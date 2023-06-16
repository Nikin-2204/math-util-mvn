/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.truonglnh.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.truonglnh.mathutil.core.MathUtility;

/**
 *
 * @author lnhtr
 */
public class MathuUtilityTest {
    
    

    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
//        assertEquals(70, 70);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
}

// hoc ki thuat kiem thu cho dân dev - ki thuat DDT
// DATA Driven Testing

//TTD: test Driven Development
//Ki thuat lap trinh ma dân dev viet cide den dâu thì viet bô test 
// case den do(JUnit, NUnit, Mocha) và dùng 2 màu xanh do de dam
// bao chat luong code/chat luong ham!!! da hc

//Hoc ki thuat kiem thu cho dân dev - ki thuat DDT
//DDT: Data Driven Testing - bo tro cho vc xai UNIT TEST
//Giúp cac TEst case de doc hon, de bao tri hon
//Phan mo rong them cua TDD

//La ki thu?t viet code kiem thu ma tách bô DATA kiem thu
//Ra khoi cau lenh AsserteQuals() cho de kiem soat test case

//DDT là phân mo rông them cho TDD tuc là giúp cho code test(Unit test)
// tro nên dê dàng doc, bao trì, de dàng phát hiên thiêu test case

//DDT tách DATA kiêm thu ra 1 chô riêng, thuong là mang 2 chiêu
//(có nhiêu côt, các côt chính là DATA dua vào và EXPECTED)
//và ta cân có nhiêu dòng nhu thê, úng voi các test case

//và mang 2 chiêu này fill/do ra tu vào trong hàm ASSERTEQUALS()
//ki thuat tách DATA Test rieng ra 1 chô goi là DDT
//DATA DRIVEN Testing - viet code test huong vê vc tách DATA

//DATA Ðc dua vào tro lai qua cac tham so/ bien dai diên
//Nên DDT con goi là
