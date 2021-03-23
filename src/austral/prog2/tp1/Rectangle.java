package austral.prog2.tp1;

public class Rectangle {
    int base;
    int height;

    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public Rectangle(){

    }

    public void setBase(int base){
        this.base = base;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double calculateArea(){
        return (double)(base*height)/2;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setBase(10);
        rectangle1.setHeight(5);
        System.out.println(rectangle1.calculateArea());
        Rectangle rectangle2 = new Rectangle(23, 7);
        System.out.println(rectangle2.calculateArea());
    }
}
