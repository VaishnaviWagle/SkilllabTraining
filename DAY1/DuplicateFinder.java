// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class DuplicateFinder {
   public DuplicateFinder() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int[] var2 = new int[10];
      System.out.println("Enter exactly 10 numbers:");

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         var2[var3] = var1.nextInt();
      }

      var3 = -1;

      for(int var4 = 0; var4 < 10; ++var4) {
         for(int var5 = var4 + 1; var5 < 10; ++var5) {
            if (var2[var4] == var2[var5]) {
               var3 = var2[var4];
               break;
            }
         }

         if (var3 != -1) {
            break;
         }
      }

      if (var3 != -1) {
         System.out.println("First duplicate number is: " + var3);
      } else {
         System.out.println("No duplicate found.");
      }

      var1.close();
   }
}
