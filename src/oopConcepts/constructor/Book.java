package oopConcepts.constructor;

public class Book {

    public String name;
    public String author;
    public String publisher;
    public int pageNumber;
    public double price;


    //PARAMETRELI  CONSTRUCTOR
    //parametreli constructor yazarsak default constructor kırılır.
    public Book(String name, String author, String publisher, int pageNumber, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    public Book() {

    }

    //parametresiz constructor varsa bu sekilde uzun uzun yazılır
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Seker Portakali";
        book1.author = "Vasconcelos";
        book1.publisher = "Can Yayinlari";
        book1.pageNumber = 100;
        book1.price = 100.0;

        Book book2 = new Book("A","B","C",100,120.5);

/*        - parametreli constructor (p.li const.) default u ezer.
        - parametreler zorunludur.
                - parametresiz const(p.siz const.) kullanmak istiyorsan elle default yazmak zorundasın
        - iyi bir dev. p.li const. yazmak zorundadır.
        . p.li const. kullanıyorsak mutlaka değer girmeliyiz.
        - p.li const. nesneyi oluştururken kod kalabalığından kurtuluyoruz
                - lombok jar ını nerden yüklediysek onu oradan kaldırma yoksa kütüohaneyi okumaz
        - aritmetik işlem yapmayacaksam int yapmaya gerek yok
        ------
                - array ve collections...
        - array esnek değildir ve collect. öyle değil
        - array aynı data türünde ve belirlenen sayıda nesne alır
        - nesne sayısı sabitse array (gün,ay vb). Değişme ihtimali olmayan yapıları
                - değişme ihtimali varsa collec
                - elemanların türleri farklı olacaksa (int.string vb) collec.
                - interface de const. olmadğı için nesne üretemeyiz*/

    }
}
