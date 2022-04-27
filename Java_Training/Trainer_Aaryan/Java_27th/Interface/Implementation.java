package Java_Training.Trainer_Aaryan.Java_27th.Interface;

public class Implementation implements Interface{

    @Override
    public void name() {
        System.out.println("Paramesh");
    }

    @Override
    public void college() {
        System.out.println("ST. Mary's Group of Institutions Guntur");
    }

    @Override
    public void location() {
        System.err.println("Guntur");
    }

    public static void main(String[] args) {
        new Implementation().name();
        new Implementation().college();
        new Implementation().location();
    }   
}