package solutions;

public class WorkingOvertime {
    public double totalPay(double hoursWorked, double hourlyRate) {
        double hours = Math.min(hoursWorked,40D);
        hoursWorked -= hours;
        return hours * hourlyRate + hoursWorked * (hourlyRate + hourlyRate / 2);
    }
}
