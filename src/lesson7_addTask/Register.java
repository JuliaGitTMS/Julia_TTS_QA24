package lesson7_addTask;
public class Register {
    Document[] documents = new Document[10];
    int count = 0;
    public void saveDocument(Document document) {
        if (count < 10) {
            documents[count] = document;
            count += 1;
            System.out.println("Документ успешно добавлен в регистр");
        } else System.out.println("Регистр переполнен");
    }
    public void documentInfo(Document document) {
        document.documentShowInfo();
    }
}

