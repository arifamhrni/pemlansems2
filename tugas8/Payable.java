package tugas8;


public interface Payable {
    double getPayableAmount();
}


class Invoice implements Payable {
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;

    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPricePerItem() {
        return pricePerItem;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }
}


class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public double getPayableAmount() {
        double totalAmount = 0;
        for (Invoice invoice : invoices) {
            totalAmount += invoice.getPayableAmount();
        }
        return totalAmount;
    }

    public double getNetSalary() {
        return salaryPerMonth - getPayableAmount();
    }
}

