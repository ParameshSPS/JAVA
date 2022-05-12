package Java_Training.Trainer_Aaryan.Java_Apr_22nd;

public class If_Statements {
    public static void main(String[] args) {
        int value = 400;

        // value > 200 = expensive
        // value < 200 = cheap
        // if -> true = execute the if block
        // if -> false = don't execute the if block -> else block

        if (value < 200) {
            System.out.println("Item is Expensive");
        } else {
            System.out.println("Item is Cheap");
        }

        // && = and -> all the condition should be true
        // value > 200 value <= 500
        // Range = (200, 500)

        if (value > 200 && value <= 400) {
            System.out.println("Item is Expensive");
        } else {
            System.out.println("Item is Cheap");
        }

        // || = or -> atleast 1 condition should be true

        if (value < 200 || value >= 500) {
            System.out.println("Item is Expensive");
        } else {
            System.out.println("Item is Cheap");
        }
    }
}