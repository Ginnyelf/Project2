public class Main {
    public static void main(String[] args) {
        int amount_first = 100;
        int amount_add = 1100;
        int bonus;
        if (amount_add >= 1000) {
            bonus = 100;
        }
        else {
            bonus = 10000;
        }

        System.out.println(" Итоговый счет " + (amount_first + amount_add+amount_add/bonus));
        System.out.println(" Из них Бонусные рубли " + (amount_add/bonus));
    }
}
