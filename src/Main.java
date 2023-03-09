public class Main {
    public static void main(String[] args) {
        int amountFirst = 100;
        int amountAdd = 1100;
        int bonus;
        if (amountAdd >= 1000) {
            bonus = 100;
        } else {
            bonus = 10000;
        }

        System.out.println(" Итоговый счет " + (amountFirst + amountAdd + amountAdd / bonus));
        System.out.println(" Из них Бонусные рубли " + (amountAdd / bonus));
    }
}
