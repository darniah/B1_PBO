package posttest5;

import java.util.Scanner;
import java.util.ArrayList;

public  class Emina extends Makeups {

    private String brandProduct;
    private String nameProduct;
    private int stockProduct;
    private int priceProduct;
    Scanner input = new Scanner(System.in);

    public Emina(String brand, String name, int stock, int price) {
        super(brand, name, stock, price);

    }

    public void faceAdd(ArrayList<Emina> faces) {

        System.out.println("Input brand");
        brandProduct = input.next();
        System.out.println("Input name:");
        nameProduct = input.next();
        System.out.println("Input stocks:");
        stockProduct = input.nextInt();
        System.out.println("Input price:");
        priceProduct = input.nextInt();

        Emina face = new Emina("", "", 0, 0);

        face.setBrand(brandProduct);
        face.name = nameProduct;
        face.setStock(stockProduct);
        face.setPrice(priceProduct);

        faces.add(face);

    }

    public void faceShow(ArrayList<Emina> faces) {
        if (faces.isEmpty()) {
            System.out.println("Data Kosong");

        } else {

            for (int i = 0; i < faces.size(); i++) {

                System.out.println("Product name                 :" + faces.get(i).getBrand());
                System.out.println("This product is              :" + faces.get(i).name);
                System.out.println("Product Stock at produsen    :" + faces.get(i).getStock());
                System.out.println("Price if want to be reseller :" + faces.get(i).getPrice());

                i++;
            }

        }
    }

    public void facesEdit(ArrayList<Emina> faces) {
        System.out.println("Massukan Index : ");
        int choose = input.nextInt();

        System.out.println("Input brand");
        brandProduct = input.next();
        System.out.println("Input name:");
        nameProduct = input.next();
        System.out.println("Input stocks:");
        stockProduct = input.nextInt();
        System.out.println("Input price:");
        priceProduct = input.nextInt();

        faces.get(choose).setBrand(brandProduct);
        faces.get(choose).name = nameProduct;
        faces.get(choose).setStock(stockProduct);
        faces.get(choose).setPrice(priceProduct);
    }

    public void facesRemove(ArrayList<Emina> faces) {

        System.out.println("Massukan Index : ");
        int choose = input.nextInt();
        faces.remove((int) Integer.valueOf(choose));

    }

    public void lipsAdd(ArrayList<Emina> lips) {

        System.out.println("Input brand");
        brandProduct = input.next();
        System.out.println("Input name:");
        nameProduct = input.next();
        System.out.println("Input stocks:");
        stockProduct = input.nextInt();
        System.out.println("Input price:");
        priceProduct = input.nextInt();

        Emina lip = new Emina("", "", 0, 0);

        lip.setBrand(brandProduct);
        lip.name = nameProduct;
        lip.setStock(stockProduct);
        lip.setPrice(priceProduct);

        lips.add(lip);

    }

    public void lipsShow(ArrayList<Emina> lips) {
        if (lips.isEmpty()) {
            System.out.println("Data Kosong");

        } else {

            for (int i = 0; i < lips.size(); i++) {

                System.out.println("Product name                 :" + lips.get(i).getBrand());
                System.out.println("This product is              :" + lips.get(i).name);
                System.out.println("Product Stock at produsen    :" + lips.get(i).getStock());
                System.out.println("Price if want to be reseller :" + lips.get(i).getPrice());

                i++;
                

            }

        }
    }

    public void lipsEdit(ArrayList<Emina> lips) {
        System.out.println("Massukan Index : ");
        int choose = input.nextInt();

        System.out.println("Input brand");
        brandProduct = input.next();
        System.out.println("Input name:");
        nameProduct = input.next();
        System.out.println("Input stocks:");
        stockProduct = input.nextInt();
        System.out.println("Input price:");
        priceProduct = input.nextInt();

        lips.get(choose).setBrand(brandProduct);
        lips.get(choose).name = nameProduct;
        lips.get(choose).setStock(stockProduct);
        lips.get(choose).setPrice(priceProduct);
    }

    public void lipsRemove(ArrayList<Emina> lips) {

        System.out.println("Massukan Index : ");
        int choose = input.nextInt();
        lips.remove((int) Integer.valueOf(choose));

    }

    public void eyesAdd(ArrayList<Emina> eyes) {

        System.out.println("Input brand");
        brandProduct = input.next();
        System.out.println("Input name:");
        nameProduct = input.next();
        System.out.println("Input stocks:");
        stockProduct = input.nextInt();
        System.out.println("Input price:");
        priceProduct = input.nextInt();

        Emina eye = new Emina("", "", 0, 0);

        eye.setBrand(brandProduct);
        eye.name = nameProduct;
        eye.setStock(stockProduct);
        eye.setPrice(priceProduct);

        eyes.add(eye);

    }

    public void eyesShow(ArrayList<Emina> eyes) {
        if (eyes.isEmpty()) {
            System.out.println("Data Kosong");

        } else {

            for (int i = 0; i < eyes.size(); i++) {

                System.out.println("Product name                 :" + eyes.get(i).getBrand());
                System.out.println("This product is              :" + eyes.get(i).name);
                System.out.println("Product Stock at produsen    :" + eyes.get(i).getStock());
                System.out.println("Price if want to be reseller :" + eyes.get(i).getPrice());

                i++;
                

            }

        }
    }

    public void eyesEdit(ArrayList<Emina> eyes) {
        System.out.println("Massukan Index : ");
        int choose = input.nextInt();

        System.out.println("Input brand");
        brandProduct = input.next();
        System.out.println("Input name:");
        nameProduct = input.next();
        System.out.println("Input stocks:");
        stockProduct = input.nextInt();
        System.out.println("Input price:");
        priceProduct = input.nextInt();

        eyes.get(choose).setBrand(brandProduct);
        eyes.get(choose).name = nameProduct;
        eyes.get(choose).setStock(stockProduct);
        eyes.get(choose).setPrice(priceProduct);
    }

    public void eyesRemove(ArrayList<Emina> eyes) {

        System.out.println("Massukan Index : ");
        int choose = input.nextInt();
        eyes.remove((int) Integer.valueOf(choose));

    }

    void sayseyes() {
        System.out.println("eyes beautiful for beautiful day");
    }

    void sayslips() {
        System.out.println("love of your lips");
    }

    void saysfaces() {
        System.out.println("glowing face for better day");
    }

    public String getBrandProduct() {
        return brandProduct;
    }

    public void setBrandProduct(String brandProduct) {
        this.brandProduct = brandProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(int stockProduct) {
        this.stockProduct = stockProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }
}
