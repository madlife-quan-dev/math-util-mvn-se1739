/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.quannt.mathutil.core;

//class này clone lại class huyền thoại java.util.Math
//với các hàm nổi tiếng Math.sqrt() Math.sin() Math.random()
//và con số PI
public class MathUtility {

    public static final double PI = 3.1415;

    //Class này chuaws hàm static, chấm xài luôn
    //tính n giai thừa n! = 1.2.3...n
    //quy ước thiết kế hàm này như sau
    //0! = 1! = 1
    //không có giai thừa số âm. Nếu đưa số âm, CHỨI
    //giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    //do đó 21! ko dùng kiểu long được. Nếu đưa > 21, CHỬI
    //CHỬI: ko trả về giá trị gì cả mà NÉM RA NGOẠI LỆ EXCEPTION
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
//        
//        if (n == 0 || n == 1) 
//            return 1;
//        
//        long product = 1; // tích nhân dồn khởi động từ 1
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
//    
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz");
        
        if (n == 0 || n == 1) 
            return 1;
        
        return n*getFactorial(n - 1);
        //Recursion
        
    }
    //5! = 1.2.3.4.5 = 4! * 5 = 5* 4!
    //4! = 4 * 3!
    //3! = 3 * 2!
    //2! = 2 * 1!
    //1! = 1 Dung lai
    
    //N! = N * (N - 1)!

    //TDD: Test Driven Development phát triển p/m theo phong cách
    //code đến đâu kiểm thử đến đó, viết code và viết test case/test run
    //diễn ra song song, đan xen
    //cứ có hàm là có test case
    //viết ra các test case đủ bao quát các tình huống xài hàm
    //test case: là bộ dữ liệu dùng để đưa vào app/hàm để mô phỏng lại 
    //1 tình huống xài app/hàm. No có input data, giải thích cách dùng hàm/app
    //và cso giá trị trả về expected
    //lát hồi run (test run/test execution) để luận đúng sai
    //dân DEV giống dân QC ở chỗ này:
    //đều phải viết/tạo ra test case, đều phải tiến hành test run/Chạy test 
    //Và đều phải đọc kết quả đúng sai
    //DEV khác tester là phải viết code làm APP!!!
    //Test case ko viết tự do mà viết theo template
    //Viết tự doL 0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 5! -> 120
    //Viết chuẩn lại test case (XUẤT HIỆN TRONG ĐỀ THI PE, KHÓA LUẬN T/N và đi làm
    //Test case #1: (mục tiêu test) check getF() with n = 0
    //Steps-Procedures (cách tiến hành test - input/output...)
    //              1. Given n = 0
    //              2. Call the getF(n) (getF(0))
    //Expected results: (kết quả kì vọng)
    //              getF(0) must return 1
    //Test case #2: (mục tiêu test) check getF() with n = 1
    //Steps-Procedures (cách tiến hành test - input/output...)
    //              1. Given n = 1
    //              2. Call the getF(n) (getF(1))
    //Expected results: (kết quả kì vọng)
    //              getF(0) must return 1
}
