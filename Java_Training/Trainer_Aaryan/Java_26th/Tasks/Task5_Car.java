package Java_Training.Trainer_Aaryan.Java_26th.Tasks;

public class Task5_Car {
    String Car_Name;
    String Car_Color;
    String Price;
    String ShowRoom_Location;
    String Managers_Name;
    int Contact;

    public Task5_Car() {
        Car_Name = "BMW";
        Car_Color = "Black";
        Price = "40 lakhs";
        ShowRoom_Location = "Hyderabad";
        Managers_Name = "Paramesh, Aaryan";
        Contact = 00000000000;
    }

    @Override
    public String toString() {
        return "Car_Color=" + Car_Color + ", Car_Name=" + Car_Name + ", Contact=" + Contact
                + ", Managers_Name=" + Managers_Name + ", Price=" + Price + ", ShowRoom_Location=" + ShowRoom_Location;
    }

    public Task5_Car(String car_Name, String car_Color, String price, String showRoom_Location, String managers_Name,
            int contact) {
        Car_Name = car_Name;
        Car_Color = car_Color;
        Price = price;
        ShowRoom_Location = showRoom_Location;
        Managers_Name = managers_Name;
        Contact = contact;
    }

    public String getCar_Name() {
        return Car_Name;
    }

    public void setCar_Name(String car_Name) {
        Car_Name = car_Name;
    }

    public String getCar_Color() {
        return Car_Color;
    }

    public void setCar_Color(String car_Color) {
        Car_Color = car_Color;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getShowRoom_Location() {
        return ShowRoom_Location;
    }

    public void setShowRoom_Location(String showRoom_Location) {
        ShowRoom_Location = showRoom_Location;
    }

    public String getManagers_Name() {
        return Managers_Name;
    }

    public void setManagers_Name(String managers_Name) {
        Managers_Name = managers_Name;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int contact) {
        Contact = contact;
    }

    public static void main(String[] args) {
        Task5_Car car1, car2;

        car1 = new Task5_Car();
        car2 = new Task5_Car("KIA", "White", "55 Lakhs", "Penukonda", "Azeez", 00000000000);

        System.out.println(car1);
        System.out.println(car2);
    }

}