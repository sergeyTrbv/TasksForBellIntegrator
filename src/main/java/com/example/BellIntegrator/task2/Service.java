package com.example.BellIntegrator.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    public static void main(String[] args) {

        //Коллекция List в которой хранятся преобразованные значения из таблицы
        List<Map<String, String>> data = new ArrayList<>();

        //Коллекция Map с данными о воркере1
        Map<String, String> worker1 = new HashMap<>();
        worker1.put("Имя", "Кирилл");
        worker1.put("Возраст", "26");
        worker1.put("Должность", "Middle java dev");
        worker1.put("Зарплата", "150000 руб");

        //Сохраняю воркера в Коллекцию data
        data.add(worker1);

        //Коллекция Map с данными о воркере2
        Map<String, String> worker2 = new HashMap<>();
        worker2.put("Имя", "Виталий");
        worker2.put("Возраст", "28");
        worker2.put("Должность", "Senior java automation QA");
        worker2.put("Зарплата", "2000$");

        data.add(worker2);

        //Коллекция Map с данными о воркере3
        Map<String, String> worker3 = new HashMap<>();
        worker3.put("Имя", "Александр");
        worker3.put("Возраст", "31");
        worker3.put("Должность", "junior functional tester");
        worker3.put("Зарплата", "50000 руб");

        data.add(worker3);

        //Коллекция Map с данными о воркере4
        Map<String, String> worker4 = new HashMap<>();
        worker4.put("Имя", "Дементий");
        worker4.put("Возраст", "35");
        worker4.put("Должность", "dev-ops");
        worker4.put("Зарплата", "1500$");

        data.add(worker4);

        // Имена сотрудников младше 30 лет
        for (Map<String, String> worker : data) {
            int age = Integer.parseInt(worker.get("Возраст"));
            if (age < 30) {
                System.out.println(worker.get("Имя") + " младше 30-ти");
            }
        }


        // Имена сотрудников, получающих зарплату в рублях
        for (Map<String, String> worker : data) {
            String salary = worker.get("Зарплата");
            if (salary.contains("руб")) {
                System.out.println(worker.get("Имя") + " получает зарпалату в рублях");
            }
        }

        // Средний возраст всех сотрудников
        int sumAgeWorkers = 0;
        int countWorkers = data.size();
        for (Map<String, String> worker : data) {

            String ageWorker = worker.get("Возраст");
            sumAgeWorkers += Integer.parseInt(ageWorker);

        }
        System.out.println("Средний возраст работников:  " + sumAgeWorkers / countWorkers);


        // + бонусный метод "Средняя зарплата сотрудников"
        double totalSalaryRubles = 0;
        double course = 85;

        for (Map<String, String> workers : data) {
            String salary = workers.get("Зарплата");
            if (salary.contains("$")) {
                double salaryDollars = Double.parseDouble(salary.replace("$", ""));
                double salaryRubles = salaryDollars * course; // Допустим курс 1$=85 руб
                totalSalaryRubles += salaryRubles;
            } else {
                totalSalaryRubles += Double.parseDouble(salary.replace(" руб", ""));
            }
        }

        double averageSalaryRubles = totalSalaryRubles / countWorkers;

        System.out.println("Средняя зарплата в рублях: " + averageSalaryRubles + " руб при курсе равном: " + course + " руб");

    }
}
