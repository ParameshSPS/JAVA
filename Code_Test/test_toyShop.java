// EmpId: 67620
// Name: Paramesh Sidhanatham

package Code_Test;

import java.util.Scanner;

public class test_toyShop {
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
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("----> Enter the List: ");
            int num = scanner.nextInt();

            int price[] = new int[num];

            for (int i = 0; i < num; i++)
                price[i] = scanner.nextInt();
            int money = scanner.nextInt();

            int output = getMaxToys(price, money);

            System.out.println("The Maximum No.Of toys you can purchase is --> " + output);
        }
    }
}