package com.company;


import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        for(int k = 0;k < 1;k++) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.println("Ответишь 1,значит буду предсказывать.Если 2 то не буду");
            int otvet1 = scanner.nextInt();

            String privetstvie[] = {"Здравствуй смертный.Сегодня для тебя такой ответ:",
                    "Кто вопрошает,тот получает ответ:"
            };
            String otvet2[] = {"Бесспорно", "Никаких сомнений", "Вероятнее всего", "Хорошие перспективы",
                    "Спроси позже", "Сейчас нельзя предсказать"
            };
            if(otvet1 == 1){
                System.out.println("Хорошо,ты сам этого захотел");

            }
            else if(otvet1 == 2){
                System.out.println("Как хочешь!");
                break;
            }
            System.out.println("Введи то,что желаешь узнать!");
            String question;
           question = scanner.next();
            int index = random.nextInt(privetstvie.length);
            int index2 = random.nextInt(otvet2.length);
            System.out.println(privetstvie[index] + otvet2[index2]);



        }
    }
}
