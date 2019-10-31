package helloJAVA;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Hello {
	public static boolean SNT(int so){
        if (so < 2) {
            return false;
        }

        int count = 0 ;
        for(int i = 1; i <= so; i++){
            if(so % i == 0){
                count++;
            }
        }
        return count == 2 ? true : false;
    }

    public static void main(String[] args) {
        String dayso = "";
        String[] arr = null;
        int so = 0;

        if(args.length > 0){
            arr = args;
        }

        try {
            System.out.println("Cac so nguyen to trong day vua nhap: ");
            for (String element : arr) {
                if(!element.equals("") && SNT(Integer.parseInt(element))){
                    System.out.print(element + ", ");
                }
            }

            System.out.println("\nTong cac so da duoc lap phuong la: ");
            for (String element : arr) {
                if(!element.equals("") && SNT(Integer.parseInt(element))){
                    so += Math.pow(Double.parseDouble(element), 3);
                }
            }
            System.out.println(so);
        }catch (Exception e){
            System.out.println("Ban Da Nhap Sai Day So");
        }
    }
}
