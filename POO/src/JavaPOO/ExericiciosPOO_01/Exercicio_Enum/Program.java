package JavaPOO.ExericiciosPOO_01.Exercicio_Enum;

import JavaPOO.ExericiciosPOO_01.Exercicio_Enum.Entities.Departament;
import JavaPOO.ExericiciosPOO_01.Exercicio_Enum.Entities.HourContract;
import JavaPOO.ExericiciosPOO_01.Exercicio_Enum.Entities.Worker;
import JavaPOO.ExericiciosPOO_01.Exercicio_Enum.EntitiesEnum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary  = sc.nextDouble();
        Worker worker = new Worker(new Departament(departmentName), baseSalary, WorkerLevel.valueOf(workerLevel), workerName);

        System.out.println("How many contracts to this worker ? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/yyyy): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
