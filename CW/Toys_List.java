package CW;

import CW.Soft_Toys;
import CW.Solid_Toys;

import java.io.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Toys_List
{
    Soft_Toys toy1 = new Soft_Toys(1,"Шлёпа", 1, 0.01, "Замша богатая. ");
    Soft_Toys toy2 = new Soft_Toys(2, "Смешуярик", 61, 50, "Дешевка - Синтетика");
    Solid_Toys toy3 = new Solid_Toys(3, "Мафынка", 16, 15, "3+");
    Solid_Toys toy4 = new Solid_Toys(4, "РОБОТ-УБИВАТОР", 2, 6, "8+");




    public void add_toys_List()

    {
        ArrayList<Toys> toys_List = new ArrayList();
        toys_List.add(toy1);
        toys_List.add(toy2);
        toys_List.add(toy3);
        toys_List.add(toy4);

        System.out.println("Текущий список игрушек таков:" + toys_List);
    }

    public void toys_chance_switchMT()
    {
        ArrayList<Toys> toys_List = new ArrayList();
        toys_List.add(toy1);
        toys_List.add(toy2);
        toys_List.add(toy3);
        toys_List.add(toy4);
        for (Toys toys:toys_List)
        {
            System.out.println("Игрушка с ID#: " + toys.getToy_ID() + " " +toys.getToy_Name());
        }

        System.out.println("Выберите №ID игрушки для изменения шанса выпадения. ");
        Scanner scanner = new Scanner(System.in);
        int which_chance_toChange = scanner.nextInt();


        for (Toys toys: toys_List)
        {
        if (which_chance_toChange == toys.getToy_ID())
        {
            System.out.println("Есть такая игрушка: " + toys.getToy_Name() + "\nШанс ее выпадения: " + toys.getToy_Chance() );
            System.out.println("Меняем на какое значение? ");
            double switched_chanceValue = scanner.nextDouble();
            toys.setToy_Chance(switched_chanceValue);
            System.out.println("Теперь запись этой игрушки в системе отражается так: " + toys);
        }
        }
    }

    public void lotteryList()
    {
        Methods mtd = new Methods();
        ArrayList<Toys> rouletteList = new ArrayList();
        rouletteList.add(toy1);
        rouletteList.add(toy2);
        rouletteList.add(toy3);
        rouletteList.add(toy4);
        for (Toys toyss: rouletteList)
        {
            System.out.println("ID игрушки: " + toyss.getToy_ID() + "\nНазвание игрушки: " + toyss.getToy_Name() + "\nШанс получения: "+ toyss.getToy_Chance());
            System.out.println("----------");
        }

        System.out.println("Выберите игрушку для розыгрыша! Попыток будет три! Советую выбрать ту, где шанс побольше будет! (ID#2)");
        Scanner scanner = new Scanner(System.in);
        int which_toy_lottery = scanner.nextInt();
        for (Toys toys:rouletteList)
        {
        if (which_toy_lottery == toys.getToy_ID()) {
            System.out.println("Есть такая игрушка: " + toys.getToy_Name() + "\nШанс ее выпадения: " + toys.getToy_Chance());
            System.out.println("Попытка номер 1! ");
            Random random = new Random();
            double rnd = random.nextDouble(100);
            if (rnd <= toys.getToy_Chance())
            {
                System.out.println("УРА, ВЫ ПОЛУЧАЕТЕ ИГРУШКУ! С ПЕРВОГО РАЗА! ВЕЗУНЧИК! ");
                System.out.println("Число игрушек " + toys.getToy_Name() + " было " + toys.getToy_Count());
                toys.setToy_Count(toys.getToy_Count()-1);
                System.out.println("Число игрушек " + toys.getToy_Name() + " стало " + toys.getToy_Count());
                System.out.println("Желаете сохранить в файл данные полученной игрушки? \n1. - А как же. \n2. - НЕТ СПАСИБО!!!");
                int savequestion = scanner.nextInt();
                if (savequestion == 2)
                {
                    mtd.exit_classic();
                }
                if (savequestion == 1)
                {
                    try(FileWriter writer = new FileWriter("PRIZE!", false))
                    {
                        String text = toys.toy_Name + " Получена " + LocalDateTime.now() + " с вероятностью " + toys.getToy_Chance() + "%";
                        writer.write(text);
                        writer.append('\n');
                       writer.flush();
                        System.out.println("Файл успешно сохранен! ");
                    }
                    catch (IOException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }


            }
            if (rnd > toys.getToy_Chance())
            {
                System.out.println("Не повезло, да и как тут с первого раза-то повезет? Попробуем еще раз? \n1. - Да. \n2. - Нет. ");
                int continueQestion = scanner.nextInt();
                if (continueQestion == 2)
                {
                    System.out.println("Питонщика ответ. ");
                    System.exit(0);
                }
                if (continueQestion == 1) {
                    System.out.println("И результатом попытки № 2 будет: ");
                    double rnd2 = random.nextDouble(100);
                    if (rnd2 <= toys.toy_Chance)
                    {
                        System.out.println("УрА! Со второго раза получил свою игрушку! ");
                        System.out.println("Число игрушек " + toys.getToy_Name() + " было " + toys.getToy_Count());
                        toys.setToy_Count(toys.getToy_Count()-1);
                        System.out.println("Число игрушек " + toys.getToy_Name() + " стало " + toys.getToy_Count());
                        System.out.println("Желаете сохранить в файл данные полученной игрушки? \n1. - А как же. \n2. - НЕТ СПАСИБО!!!");
                        int savequestion2 = scanner.nextInt();
                        if (savequestion2 == 2)
                        {
                            mtd.exit_classic();
                        }
                        if (savequestion2 == 1)
                        {
                            try(FileWriter writer = new FileWriter("PRIZE!", false))
                            {
                                String text = toys.toy_Name + " Получена " + LocalDateTime.now() + " с вероятностью " + toys.getToy_Chance() + "%";
                                writer.write(text);
                                writer.append('\n');
                                writer.flush();
                                System.out.println("Файл успешно сохранен! ");
                            }
                            catch (IOException ex)
                            {
                                System.out.println(ex.getMessage());
                            }
                        }

                    }
                    if (rnd2 >toys.getToy_Chance())
                    {
                        System.out.println("Неудача... ");
                        System.out.println(" Давай все же Попробуем еще раз? \n1. - Да. \n2. - Нет.");
                        int continue2Question = scanner.nextInt();
                        if (continue2Question == 2)
                        {
                            System.out.println("Да, я бы тоже уже сдался. ");
                            System.exit(0);
                        }
                        if (continue2Question == 1)
                        {
                            System.out.println("И наконец попытка № 3: ");
                            double rnd3 = random.nextDouble(100);
                            if (rnd3 <= toys.getToy_Chance())
                            {
                                System.out.println("НАДО ЖЕ! Получил свою игрушку! И вообще что это за тупое название " + toys.getToy_Name() + "?");
                                System.out.println("Число игрушек " + toys.getToy_Name() + " было " + toys.getToy_Count());
                                toys.setToy_Count(toys.getToy_Count()-1);
                                System.out.println("Число игрушек " + toys.getToy_Name() + " стало " + toys.getToy_Count());
                                System.out.println("Желаете сохранить в файл данные полученной игрушки? \n1. - А как же. \n2. - НЕТ СПАСИБО!!!");
                                int savequestion3 = scanner.nextInt();
                                if (savequestion3 == 2)
                                {
                                    mtd.exit_classic();
                                }
                                if (savequestion3 == 1)
                                {
                                    try(FileWriter writer = new FileWriter("PRIZE!", false))
                                    {
                                        String text = toys.toy_Name + " Получена " + LocalDateTime.now() + " с вероятностью " + toys.getToy_Chance() + "%";
                                        writer.write(text);
                                        writer.append('\n');
                                        writer.flush();
                                        System.out.println("Файл успешно сохранен! ");
                                    }
                                    catch (IOException ex)
                                    {
                                        System.out.println(ex.getMessage());
                                    }
                                }


                            }
                            if (rnd3 > toys.getToy_Chance())
                            {
                                System.out.println("НЕУДАЧА!!!!!!!!!1111111адин ");
                                System.out.println("Попытки ИСЧЕРПАНЫ!!! АХАХАХА! ТЫ НИЧЕГО НЕ ПОЛУЧИЛ!!!111");
                                System.exit(0);
                            }

                        }
                    }

                }

            }
        }
        }
    }



}
