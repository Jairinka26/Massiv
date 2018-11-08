import java.util.ArrayList;
import java.util.HashMap;

public class Lists {

    void Part1(int number) {
        HashMap<Integer, String> week = new HashMap<Integer, String>();

        week.put(1, "Monday");
        week.put(2, "Tuesday");
        week.put(3, "Wednesday");
        week.put(4, "Thursday");
        week.put(5, "Friday");
        week.put(6, "Saturday");
        week.put(7, "Sunday");

        if (number < 1 || number > 7)
            System.out.println("Индекс должен быть от 1 до 7");
        else
            System.out.println(week.get(number));
    }

    void Part2(int number) {
        HashMap<Integer, String> setNumber = new HashMap<Integer, String>();

        setNumber.put(0, "ноль");
        setNumber.put(1, "один");
        setNumber.put(2, "два");
        setNumber.put(3, "три");
        setNumber.put(4, "четыре");
        setNumber.put(5, "пять");
        setNumber.put(6, "шесть");
        setNumber.put(7, "семь");
        setNumber.put(8, "восемь");
        setNumber.put(9, "девять");
        setNumber.put(10, "десять");
        setNumber.put(11, "одинадцать");
        setNumber.put(12, "двенадцать");
        setNumber.put(13, "тринадцать");
        setNumber.put(14, "четырнадцать");
        setNumber.put(15, "пятнадцать");
        setNumber.put(16, "шестнадцать");
        setNumber.put(17, "семнадцать");
        setNumber.put(18, "восемнадцать");
        setNumber.put(19, "девятнадцать");
        setNumber.put(20, "двадцать");
        setNumber.put(30, "тридцать");
        setNumber.put(40, "сорок");
        setNumber.put(50, "пятьдесят");
        setNumber.put(60, "шестьдесят");
        setNumber.put(70, "семьдесят");
        setNumber.put(80, "восемдесят");
        setNumber.put(90, "девяносто");
        setNumber.put(100, "сто");
        setNumber.put(200, "двести");
        setNumber.put(300, "триста");
        setNumber.put(400, "четыреста");
        setNumber.put(500, "пятьсот");
        setNumber.put(600, "шестьсот");
        setNumber.put(700, "семьсот");
        setNumber.put(800, "восемьсот");
        setNumber.put(900, "девятьсот");

        String print_hundred = "", print_ten = "", print_one = "";

        if (number > 99) {
            print_hundred = setNumber.get((number / 100) * 100);
            if ((number - (number / 100) * 100) != 0) {
                if ((number - (number / 100) * 100) < 20) {
                    print_ten = setNumber.get((number - (number / 100) * 100));
                    print_one = "";
                } else {
                    print_ten = setNumber.get(((number - (number / 100) * 100) / 10) * 10);
                    print_one = setNumber.get((number - (number / 100) * 100) % 10);
                }
            }
        } else print_hundred = "";

        if (number < 20) {
            print_ten = setNumber.get(number);
            print_one = "";
        } else {
            print_ten = setNumber.get(((number) / 10) * 10);
            print_one = setNumber.get(number % 10);
        }

        System.out.println(print_hundred + " " + print_ten + " " + print_one);

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////                                             Part 3
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
HashMap<String, Integer> setNumber = new HashMap<String, Integer>();
    int number;

    public void Part3(String wordNumber) {



        setNumber.put("ноль", 0);
        setNumber.put("один", 1);
        setNumber.put("два", 2);
        setNumber.put("три", 3);
        setNumber.put("четыре", 4);
        setNumber.put("пять", 5);
        setNumber.put("шесть", 6);
        setNumber.put("семь", 7);
        setNumber.put("восемь", 8);
        setNumber.put("девять", 9);
        setNumber.put("десять", 10);
        setNumber.put("одинадцать", 11);
        setNumber.put("двенадцать", 12);
        setNumber.put("тринадцать", 13);
        setNumber.put("четырнадцать", 14);
        setNumber.put("пятнадцать", 15);
        setNumber.put("шестнадцать", 16);
        setNumber.put("семнадцать", 17);
        setNumber.put("восемнадцать", 18);
        setNumber.put("девятнадцать", 19);
        setNumber.put("двадцать", 20);
        setNumber.put("тридцать", 30);
        setNumber.put("сорок", 40);
        setNumber.put("пятьдесят", 50);
        setNumber.put("шестьдесят", 60);
        setNumber.put("семьдесят", 70);
        setNumber.put("восемдесят", 80);
        setNumber.put("девяносто", 90);
        setNumber.put("сто", 100);
        setNumber.put("двести", 200);
        setNumber.put("триста", 300);
        setNumber.put("четыреста", 400);
        setNumber.put("пятьсот", 500);
        setNumber.put("шестьсот", 600);
        setNumber.put("семьсот", 700);
        setNumber.put("восемьсот", 800);
        setNumber.put("девятьсот", 900);

        ArrayList<String> words = new ArrayList<String>();
        int i = 0;
        String str1[] = new String[3];

        for (String word : wordNumber.split(" ")) {
            words.add(i, word);
            i++;
        }

        findNumber(words);

    }

    void findNumber(ArrayList words) {
        int sum = 0;
        for (int i = 0; i < words.size(); i++) {
            sum += setNumber.get(words.get(i));
        }
        System.out.println(sum);
    }
}


