abstract class Employee {
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();
}

class Manager extends Employee {
    private double baseSalary;

    public Manager(int employeeId, String name, double baseSalary) {
        super(employeeId, name);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class Technician extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Technician(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        // Assuming technician's salary calculation involves multiplying hourly rate with hours worked
        return hourlyRate * hoursWorked;
    }
}

class main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "John Doe", 5000.0);
        Technician technician = new Technician(2, "Jane Smith", 25.0, 160);

        System.out.println("Manager's salary: $" + manager.calculateSalary());
        System.out.println("Technician's salary: $" + technician.calculateSalary());
    }
}
