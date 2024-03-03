class Manager extends Employee{
    public Manager(String n, double s, int d, int m, int y){
        super(n, s, d, m, y);
        secretaryName = " ";
    }

    @Override
    public void raiseSalary(double byPercent){
        //add 1/2% bonus for every year of service
        GregorianCalendar todayDate = new GregorianCalendar();
        int currentYear = todayDate.get(Calendar.YEAR);
        double bonus = 0.5*(currentYear - hireYear());
        super.raiseSalary(byPercent+bonus);
    }

    public String getSecretaryName(){
        return secretaryName;
    }

    private String secretaryName;
}