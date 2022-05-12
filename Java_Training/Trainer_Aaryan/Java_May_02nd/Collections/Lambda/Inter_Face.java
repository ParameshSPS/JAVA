package Java_Training.Trainer_Aaryan.Java_May_02nd.Collections.Lambda;

@FunctionalInterface

public interface Inter_Face {
    public void start();
}

class implementation implements Inter_Face {

    @Override
    public void start() {
        System.out.println("Hello Friends");
        
    }

}