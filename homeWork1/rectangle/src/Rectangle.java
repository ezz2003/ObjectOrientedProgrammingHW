public class Rectangle {
    private double width ;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(){
        width = height = 0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public  double calculateArea(){
        return this.width * this.height;
    }

    public double calculatePerimeter(){
        return (this.height * this.width)/2;
    }
}
