public class Main {

    public static void main(String[] args) {


        int ticket = 15000;// стоимость билета
        int perOne = 20;// количество рублей для одной бонусной милли

        int amountOfMiles = (ticket / perOne);

        System.out.println("Количество начисленных миль: " + amountOfMiles);




    }
}
