package PraktikumOOPInterface.TugasPraktikum;

public class Employee implements Payable{
    private int registrationNumber, salaryPerMonth;
    private String name;
    public Invoice[] invoices;
    public int totalHarga;

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int registrationNumber, int salaryPerMonth, String name) {
        setRegistrationNumber(registrationNumber);
        setSalaryPerMonth(salaryPerMonth);
        setName(name);
    }

    @Override
    public int getPayableMethod() {
        return salaryPerMonth - totalHarga;
    }

    @Override
    public String toString() {
        return "Nama Karyawan: " + getName() +
                "\nNomor Registrasi: " + getRegistrationNumber() +
                "\nGaji per Bulan: $" + getSalaryPerMonth();
    }
    public void cetakInvoices(){
        System.out.println("daftar invoice: ");
        for (int i = 0; i < invoices.length; i++) {
            if (invoices[i] != null) {
                System.out.println((i+1) + " -- " + invoices[i]);
                totalHarga += invoices[i].getTotalPrice();
            }
        }
        System.out.println("total harga yang harus dibayarkan: $" + totalHarga);
        if (totalHarga <= salaryPerMonth) System.out.println("gaji setelah dipotong invoices: $" + getPayableMethod());
        else System.out.println("gaji tidak mencukupi untuk membayar seluruh invoice!");
    }
}
