public class Main {
//    Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
//    Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
//    Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
//    Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
//    Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
//    Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2.2, 3.3);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(5.6);
        rectangle2.setWidth(8.8);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
    }
}