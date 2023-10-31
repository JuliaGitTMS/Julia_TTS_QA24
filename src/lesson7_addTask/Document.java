package lesson7_addTask;
import java.util.Date;

public abstract class Document {
    private String documentNumber;
    private Date documentDate;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }
    public abstract void documentShowInfo ();

    public Document() {
    }

    public Document(String documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
}
