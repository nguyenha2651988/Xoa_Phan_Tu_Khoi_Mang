

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 4, 5, 6, 7, 8, 6, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so muon tim trong mang");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number) {
                System.out.print("vi tri phan tu : ");
                System.out.println(i + 1);
                count++;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        for (int i = 0; i < array.length - count; i++) {
            System.out.print(array[i]);
        }
    }
}
