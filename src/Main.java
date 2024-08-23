public class Main {
    public static void main(String[] args) {


        int price = 13676; // стоимость билета
        int mile = 20; // количество рублей для одной бонусной мили
        int total; //всего бонусов

        total = price / mile;
        System.out.println("За билет стоимостью " + price + " начисляется " + total + " бонусных милей");

    }
}
