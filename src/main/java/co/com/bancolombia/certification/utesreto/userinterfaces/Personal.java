package co.com.bancolombia.certification.utesreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {

    public static final Target FIRSTNAME = Target.the("first name").
            locatedBy("//input[@id=\"firstName\"]");
    public static final Target LASTNAME = Target.the("last name").
            locatedBy(" //input[@id=\"lastName\"]");
    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");

    public static final Target BIRTHMONTH = Target.the("birth month").
            locatedBy("//select[@id=\"birthMonth\"]");
    public static final Target BIRTHDAY = Target.the("birth day").
            locatedBy(" //input[@id=\"//select[@id=\"birthDay\"]");
    public static final Target BIRTHYEAR = Target.the("birth year").
            locatedBy("//select[@id=\"birthYear\"]");

    public static final Target NextLocation = Target.the("next location").
            locatedBy("//a[@class=\"btn btn-blue]");







}
