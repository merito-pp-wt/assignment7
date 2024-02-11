/**
 * Główna klasa aplikacji
 * Kurs: Podstawy programowania
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures;

        figures = new Figure[2];

        Square s = new Square(2.0, 4.0, 6.0); // kwadrat w punkcie (2.0, 4.0), długość boku=6.0
        System.out.println("Pole kwadratu wynosi " + s.getArea()); // powinno wyjść 36
        s.resize(2.0); // zwiększamy długość boku kwadratu dwa razy
        System.out.println("Pole kwadratu wynosi po zmianie " + s.getArea()); // powinno wyjść 144
        figures[0] = s;

        Rectangle r = new Rectangle(1.0, 7.0, 2.0, 5.0); // prostokąt w punkcie (1.0, 7.0), długości boków: 2.0 i 5.0
        System.out.println("Pole prostokąta wynosi " + r.getArea()); // powinno wyjść 10
        r.resize(0.5); // zmiejszamy oba boki prostokąta o połowę
        System.out.println("Pole prostokąta wynosi po zmianie " + r.getArea()); // powino wyjść 2.5
        figures[1] = r;

        for(Figure f : figures) {
            System.out.println(f);
            f.moveTo(-5.0, -6.0); //przesuwamy figurę do punktu (-5.0, -6.0)
            System.out.println(f);
        }
        /*
        Tu na ekranie powinno się pokazać:

        Kwadrat o boku 12,000000 w punkcie (2,000000,4,000000)
        Kwadrat o boku 12,000000 w punkcie (-5,000000,-6,000000)
        Prostokąt o bokach 1,000000,2,500000 w punkcie (1,000000,7,000000)
        Prostokąt o bokach 1,000000,2,500000 w punkcie (-5,000000,-6,000000)
         */

    }
}