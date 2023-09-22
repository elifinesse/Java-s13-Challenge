package employeeApp;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "Insurance A", Plan.PLAN3);
        Healthplan plan2 = new Healthplan(2, "Insurance B", Plan.PLAN2);

        System.out.println(plan1);
        System.out.println(plan2);

        String[] healthPlans = new String[3];
        healthPlans[0] = plan1.getName();
        healthPlans[1] = plan2.getName();

        Employee employee1 = new Employee("1A", "Bruce Wayne", "bat@man.com", "yarasaadam", healthPlans);
        employee1.addHealthplan(2, "Insurance C");
        employee1.addHealthplan(1, "Insurance D");
        employee1.addHealthplan(4, "Insurance E");
        employee1.addHealthplan(2, "Insurance E");

        System.out.println(employee1);
        System.out.println(Arrays.toString(employee1.getHealthplans()));

        String [] developers = new String[9];
        developers[0] = "Bruce";
        developers[1] = "Lucius";
        developers[2] = "Alfred";
        developers[3] = "Richard";

        Company company1 = new Company("1", "Wayne Enterprises", 999999999, developers);

        company1.addEmployee(4, "Barbara");
        company1.addEmployee(10, "Tim");
        company1.addEmployee(5, "Bruce");

        System.out.println(company1);


    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
