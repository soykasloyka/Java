import java.util.Objects;

public class iphone {
    private String model;
    private String color;
    private int price;

    public iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        iphone iphone = (iphone) o;
        return price == iphone.price &&
                Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);
    }

    public static void main(String[] args) {
        iphone iphone1 = new iphone("X", "Black", 999);
        iphone iphone2 = new iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
