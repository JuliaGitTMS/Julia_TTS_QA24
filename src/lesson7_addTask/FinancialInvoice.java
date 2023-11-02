package lesson7_addTask;

import java.util.Date;

public class FinancialInvoice extends Document {
    private float totalSum;
    private String departmentCode;

    public float getTotalSum() {
        return totalSum;
    }

    public FinancialInvoice(String documentNumber, Date documentDate,
                            float totalSum, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalSum = totalSum;
        this.departmentCode = departmentCode;
    }

    public void setTotalSum(float totalSum) {
        this.totalSum = totalSum;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public void documentShowInfo() {
        System.out.println("Финансовая накладная от " + super.getDocumentDate() + " номер " +
                super.getDocumentNumber() + "\nкод департамента " + departmentCode + ", итоговая сумма " +
                totalSum);
    }
}

