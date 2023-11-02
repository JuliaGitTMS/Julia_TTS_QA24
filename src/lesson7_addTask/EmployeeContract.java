package lesson7_addTask;

import java.util.Date;

public class EmployeeContract extends Document {
    private Date contractStartDate;
    private Date contractFinishDate;
    private String employeeName;

    @Override
    public void documentShowInfo() {
        System.out.println("Контракт с сотрудником " + employeeName + " от " + super.getDocumentDate() +
                " номер " + super.getDocumentNumber() + "\nдата начала контракта " + contractStartDate +
                ", дата окончания контракта " + contractFinishDate);
    }
    public EmployeeContract() {
    }
    public EmployeeContract(String documentNumber, Date documentDate, Date contractStartDate,
                            Date contractFinishDate, String employeeName) {
        super(documentNumber, documentDate);
        this.contractStartDate = contractStartDate;
        this.contractFinishDate = contractFinishDate;
        this.employeeName = employeeName;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractFinishDate() {
        return contractFinishDate;
    }

    public void setContractFinishDate(Date contractFinishDate) {
        this.contractFinishDate = contractFinishDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

