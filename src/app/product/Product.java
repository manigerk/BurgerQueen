package app.product;

public class Product {

    private int id;      // 모든 상품들의 공통적인 속성
    private String name; // 모든 상품들의 공통적인 속성
    private int price;
    private int kcal;

    public Product(int id, String name, int price, int kcal) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }
    public Product(String name, int price, int kcal) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
