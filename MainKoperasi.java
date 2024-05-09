package PraktikumOOPInterface.TugasPraktikum;

public class MainKoperasi {
    public static void main(String[] args) {
        Employee[] arrEmployee = new Employee[10]; //kapasitas terbesar employee
        Employee e1 = new Employee(1, 2000, "Andi");
        Employee e2 = new Employee(2, 1200, "Budi");
        Employee e3 = new Employee(3, 1000, "Cadi");

        arrEmployee[0] = e1;
        Invoice i1e1 = new Invoice("Apel", 4, 4);
        Invoice i2e1 = new Invoice("Roti", 3, 2);
        Invoice i3e1 = new Invoice("Soda", 1, 1);

        e1.invoices = new Invoice[5];
        e1.invoices[0] = i1e1;
        e1.invoices[1] = i2e1;
        e1.invoices[2] = i3e1;

        arrEmployee[1] = e2;

        arrEmployee[2] = e3;
        Invoice i1e3 = new Invoice("teh botol (bukan merk)", 2, 2);
        Invoice i2e3 = new Invoice("saham koperasi", 800, 1);
        Invoice i3e3 = new Invoice("etalase", 200, 1);
        e3.invoices = new Invoice[5];
        e3.invoices[0] = i1e3;
        e3.invoices[1] = i2e3;
        e3.invoices[3] = i3e3;

        for (int i = 0; i < arrEmployee.length; i++) {
            if (arrEmployee[i] != null) {
                System.out.printf("Karyawan %d ------------------\n", (i+1));
                System.out.println(arrEmployee[i]);
                if (arrEmployee[i].invoices != null) {
                    arrEmployee[i].cetakInvoices();
                } else System.out.println("tidak ada data invoice");
            }
            System.out.println();
        }
    }
}
