package BTVN2;

import java.security.PublicKey;

public class Calculator {
    //Ham tinh tong
    public static int Tong(int a1, int b1)
    {
        return a1 + b1;
    }

    //Ham tinh tich
    public static float Tich(int a2, int b2)
    {
        return a2 * b2;
    }

    //Goi lai 2 ham tren
    public static void main(String[] args)
    {
        int a = Tong(100,200);
        System.out.println("Tong 2 so nguyen = " + a);
        float b = Tich(30,50);
        System.out.println("Tich 2 so nguyen = " + b);
    }
}
