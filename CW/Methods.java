package CW;



import java.util.Scanner;

public class Methods {


    public void toy_switch_Chance()
    {
        Toys_List lst = new Toys_List();
        lst.toys_chance_switchMT();
    }

    public void exit_classic()
    {
        System.out.println("ВСЕГО ХО-РО-ШЕ-ГО!!! ");
    }
    public void start_Method() //ГЛАВНЫЙ МЕТОД ЗАПУСКА

    {
        System.out.println("Привет! Игрушку добавлять будем или менять значение шанса выпадения игрушки?" +
                "\n" + "1. - Добавить игрушку. "
                + "\n2. - Меняем шансы выпадения. "
                + "\n3. - Посмотреть текущий список игрушек. "
                + "\n4. - Розыгрыш игрушки. (Троллирующая лотерейка) "
                + "\n5. - Выход. ");
        Scanner scanner = new Scanner(System.in);
        int start_Qestion = scanner.nextInt();
        if (start_Qestion == 1)
        {
            add_Toy();
        }
        if (start_Qestion == 2)
        {
            toy_switch_Chance();
        }
        if (start_Qestion == 3)
        {
            Toys_List tl = new Toys_List();
            tl.add_toys_List();
        }
        if (start_Qestion == 4)
        {
            Toys_List lot = new Toys_List();
            lot.lotteryList();
        }
        if (start_Qestion == 5)
        {
            exit_classic();
        }

    }



    public void add_Toy()

    {

        System.out.println("Какого типа игрушку будем добавлять? \n1. - Мягкая\n2. - Твердая\n3. - Выход. ");
        Scanner scanner = new Scanner(System.in);
        int first_Question = scanner.nextInt();
        if (first_Question == 1) {

            System.out.println("Добавляем игрушку. Введите данные игрушки.");
            System.out.println("Введите ID игрушки. ");
            int new_ID = scanner.nextInt();
            System.out.println("Введите название игрушки. ");
            String new_Toy_Name = scanner.next();
            System.out.println("Введите количество игрушек. ");
            int new_Toy_Count = scanner.nextInt();
            if (new_Toy_Count <= 0)
            {
                System.out.println("введено неверное число игрушек. ");
                System.exit(0);
            }
            System.out.println("Введите шанс выпадения. ");
            double new_Toy_Chance = scanner.nextDouble();
            if (new_Toy_Chance >100 || new_Toy_Chance <=0)
            {
                System.out.println("Введено неверное значение шанса выпадения. ");
                System.exit(0);
            }
            System.out.println("Введите тип материала игрушки. ");
            String new_Toy_Fiber = scanner.next();

            Soft_Toys toy = new Soft_Toys(new_ID, new_Toy_Name, new_Toy_Count, new_Toy_Chance, new_Toy_Fiber);
            System.out.println("Игрушка добавлена: " + "\n" + toy);
        }


        if (first_Question == 2) {
            System.out.println("Добавляем игрушку. Введите данные игрушки.");
            System.out.println("Введите ID игрушки. ");
            int new_ID = scanner.nextInt();
            System.out.println("Введите название игрушки. ");
            String new_Toy_Name = scanner.next();
            System.out.println("Введите количество игрушек. ");
            int new_Toy_Count = scanner.nextInt();
            if (new_Toy_Count <= 0)
            {
                System.out.println("введено неверное число игрушек. ");
                System.exit(0);
            }
            System.out.println("Введите шанс выпадения. ");
            double new_Toy_Chance = scanner.nextDouble();
            if (new_Toy_Chance >100 || new_Toy_Chance <=0)
            {
                System.out.println("Введено неверное значение шанса выпадения. ");
                System.exit(0);
            }
            System.out.println("Введите ограничение по возрасту. (ПРИМЕР: 2+) ");
            String new_Toy_AgeLimit = scanner.next();
            Solid_Toys toy = new Solid_Toys(new_ID, new_Toy_Name, new_Toy_Count, new_Toy_Chance, new_Toy_AgeLimit);
            System.out.println("Игрушка добавлена: " + "\n" + toy);
        }

        if (first_Question == 3)
        {
            exit_classic();
        }
    }

    public void lottery()
    {

    }

}




