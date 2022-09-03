package co.com.bancolombia.certification.utesreto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {

    public static final Target REGISTER = Target.the("register").
            locatedBy("//a[@class=\"unauthenticated-nav-bar__dropdown-menu-sign-up\"]");


}
