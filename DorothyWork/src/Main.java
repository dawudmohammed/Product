import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(
                List.of(new Product("451","Iphone",20.30,"2021-01-12"),
                        new Product("362","Samsung",20.30,"2016-01-12"),
                        new Product("954","Nokia",20.30,"2005-01-12")
                        )
        );


//        List<Integer> strings = products.stream().map(p -> LocalDate.parse(p.getDateMfd()).getYear())
//                        .filter(i->i<2017).toList();
//        System.out.println(strings);
          String expiryDate = "2017-01-01";
        products.stream().filter(i -> LocalDate.parse(i.getDateMfd()).getYear()<(LocalDate.parse(expiryDate)).getYear()).toList()
                        .forEach(System.out::println);
        //

    }
}
