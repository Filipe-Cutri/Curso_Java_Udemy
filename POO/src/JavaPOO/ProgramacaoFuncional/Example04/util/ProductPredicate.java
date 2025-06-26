package JavaPOO.ProgramacaoFuncional.Example04.util;

import JavaPOO.ProgramacaoFuncional.Example04.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
