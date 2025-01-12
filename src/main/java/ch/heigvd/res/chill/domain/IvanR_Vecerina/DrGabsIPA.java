package ch.heigvd.res.chill.domain.IvanR_Vecerina;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class DrGabsIPA implements IProduct {

  public final static String NAME = "Dr.Gabs IPA";
  public final static BigDecimal PRICE = new BigDecimal(4.1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
