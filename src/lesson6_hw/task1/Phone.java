package lesson6_hw.task1;

public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone() {
    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " номер тел." + number);
    }

    public void sendMessage (String ... numbers){
        System.out.println("Сообщение будет отправлено на следующие номера:");
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

}
