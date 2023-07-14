package lab5_1;

final class Paycheck {
    private final double grossPay;
    private final double fica;
    private final double state ;
    private final double local ;
    private final double madicare;
    private final double socialSecurity;
    private final DateRange payPeriod;

    Paycheck(double grossPay, double fica, double state, double local, double madicare, double socialSecurity, DateRange payPeriod) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.local = local;
        this.madicare = madicare;
        this.socialSecurity = socialSecurity;
        this.payPeriod = payPeriod;
    }


    public double getNetPay() {
        double totalInterest=fica+state+local+madicare+socialSecurity;
        return grossPay-(grossPay*totalInterest);
    }

    //String.format(Locale.US, "%.2f", i2)

    public void print() {
        System.out.println("Gross Pay: "+grossPay+", Net Pay: "+getNetPay()+", Date Range: "+payPeriod);

    }


}
