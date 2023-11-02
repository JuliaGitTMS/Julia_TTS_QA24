package lesson7_addTask;

import java.util.Date;

public class GoodsSupplyContract extends Document {
    private String goodType;
    private double goodQuantity;

    @Override
    public void documentShowInfo() {
        System.out.println("Контракт на поставку товаров от " + super.getDocumentDate() +
                " номер " + super.getDocumentNumber() + "\nтовар типа " + goodType + " в количестве " +
                goodQuantity);
    }
    public GoodsSupplyContract() {
    }

    public GoodsSupplyContract(String documentNumber, Date documentDate,
                               String goodType, double goodQuantity) {
        super(documentNumber, documentDate);
        this.goodType = goodType;
        this.goodQuantity = goodQuantity;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public double getGoodQuantity() {
        return goodQuantity;
    }

    public void setGoodQuantity(double goodQuantity) {
        this.goodQuantity = goodQuantity;
    }
}
