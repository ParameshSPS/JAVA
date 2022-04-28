package Java_Training.Trainer_Aaryan.Java_27th.Interface_1;

public class Implement implements Interface{

    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void talk() {
        System.out.println("Talking");
    }

    @Override
    public void dance() {
        System.out.println("Dancing");
    }
    
    public static void main(String[] args) {
        new Implement().hello();
        new Implement().talk();
        new Implement().dance();
    }
}