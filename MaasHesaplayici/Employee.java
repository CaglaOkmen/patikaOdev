public class Employee {
    String name;
    double Salary;
    double workHours;
    int hireYear;

    Employee(String name, double Salary, double workHours, int hireYear){
        this.name = name;
        this.Salary = Salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(Salary<1000){
            return 0;
        }
        else{
            return (Salary * 0.03);
        }
    }
    public double Bonus(){
        if(workHours>40){
            return ((int)workHours-40) * 30;
        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        if((2023 - hireYear)<10){
            return Salary*0.05;
        }
        if((2023 - hireYear)>9 && (2023 - hireYear)<20){
            return Salary * 0.1;
        }
        else{
            return Salary * 0.15;
        }
    }
    @Override
    public String toString(){
        double tax = tax();
        double bonus = Bonus();
        double raiseSalary = raiseSalary();
        double total = Salary + tax + bonus;
        double totalSalary = Salary + raiseSalary;

        return String.format("Adı: %s\nMaaşı: %.2f TL\nÇalışma Saati: %.1f\nBaşlangıç Yılı: %d\nVergi: %.2f TL\nBonus: %.2f TL\nMaaş Artışı: %.2f TL\nVergi ve Bonuslar ile birlikte maaş: %.2f TL\nToplam maaş: %.2f TL", name, Salary, workHours, hireYear, tax, bonus, raiseSalary, total, totalSalary);
    }
}
