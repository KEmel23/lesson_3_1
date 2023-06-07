// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(there(22, 18));
        System.out.println(there(20, 35));
        System.out.println(there(22, 20));
        System.out.println(there(22, 31));
        System.out.println(there(25, 18));
        System.out.println(there(28, 27));
    }

    public static String there(int age, int tempreture) {
        String there1 = "Можно идти гулять";
        String there2 = "Остовайся дома";
        if (age >= 20 && age <= 45 && tempreture >= -20 && tempreture <= 35) {
            return there1;
        } else if (age < 20 && tempreture >= 0 && tempreture <= 28) {
            return there1;
        } else if (age >= 45 && tempreture >= -10 && tempreture <= 25) {
            return there1;
        } else {
            return there2;
        }

    }
}