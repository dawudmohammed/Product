package work;

import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Product> products = new ArrayList<>(
                List.of(new Product("112", "Nokia", 20.30, "2021-11-11"),
                        new Product("311", "Samsung", 20.30, "2005-01-05"),
                        new Product("521", "iphone", 20.30, "2016-11-02"),
                        new Product("501", "Tecno", 40.30, "2001-11-02"))
        );


//        String expirydate = "2010-01-01";
//        products.stream().filter(i-> LocalDate.parse(i.getDateMfd()).getYear() < LocalDate.parse(expirydate).getYear()).toList()
//                .forEach(System.out::println);
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (LocalDate.parse(product.getDateMfd()).getYear() < 2010) {
                productList.add(product);
            }
        }

        //calling createCsvDate

        List<String[]> csvData = createCsvData(productList);
        try (CSVWriter writer = new CSVWriter(new FileWriter("Book1.csv"))) {
            writer.writeAll(csvData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static List<String[]> createCsvData(List<Product> products) {
         List<String[]> list = new ArrayList<>();

        String[] header = {"productid", "name", "unitprice", "dateMtd"};
        list.add(header);

        for(Product product:products){
            String[] record = {product.getProductid(),product.getName(),product.getUnitPrice().toString(),product.getDateMfd()};
            list.add(record);
        }

        return list;
    }
}
