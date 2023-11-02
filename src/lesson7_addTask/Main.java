package lesson7_addTask;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Document document1 = new EmployeeContract("E1", new Date(4675464L),
                new Date(4675464L), new Date(78789), "Васильев Петр");
        Document document2 = new FinancialInvoice("1209", new Date(3209874L),
                376f, "38");
        Document document3 = new GoodsSupplyContract("67U", new Date(3747560L),
                "Принтер HP", 33);
        Register register1 = new Register();
        register1.saveDocument(document1);
        register1.saveDocument(document2);
        register1.saveDocument(document3);
        register1.documentInfo(document1);
        register1.documentInfo(document2);
        register1.documentInfo(document3);
    }
}

