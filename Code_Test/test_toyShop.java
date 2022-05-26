// EmpId: 67620
// Name: Paramesh Sidhanatham

package Code_Test;

import java.util.Scanner;

public class test_toyShop {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);

    public static int getMaxToys(int price[], int money) {

        int count = 0;
        int add = 0;
        int maximum = 0;

        for (int i = 0; i < price.length; i++) {

            add = count = 0;

            for (int j = i; j < price.length; j++) {

                if ((add + price[j]) <= money) {
                    add = add + price[j];
                    count = count + 1;
                    maximum = Math.max(count, maximum);
                } else {
                    count = 0;
                    add = 0;
                    break;
                }
            }
        }
        return maximum;
    }

    public static void main(String[] args) {

        System.out.println("----> Please Enter the Number of Toys <----");
        // input Length = 9
        int num = scanner.nextInt();

        System.out.println("----> Please Enter the Prices of Toys <----");
        // Input Prices = [7,1,4,5,3,2,1,6,6]
        int price[] = new int[num];
        for (int i = 0; i < num; i++)
            price[i] = scanner1.nextInt();

        System.out.println("----> Please Enter the Amount <----");
        // Input Amount = RS.10
        int money = scanner2.nextInt();

        int output = getMaxToys(price, money);
        System.out.println("The Maximum No.Of toys you can purchase:---> " + output);
        // Output = 3
    }
}

// OutPut

/*
 ----> Please Enter the Number of Toys <----
9
----> Please Enter the Prices of Toys <----
7
1
4
5
3
2
1
6
6
----> Please Enter the Amount <----
10
The Maximum No.Of toys you can purchase:---> 3
*/