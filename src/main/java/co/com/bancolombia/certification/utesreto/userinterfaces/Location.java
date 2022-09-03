package co.com.bancolombia.certification.utesreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {

    public static final Target CITY = Target.the("city").
            locatedBy("//input[@id=\"city\"]");

}
