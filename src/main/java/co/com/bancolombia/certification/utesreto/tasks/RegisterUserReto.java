package co.com.bancolombia.certification.utesreto.tasks;

import co.com.bancolombia.certification.utesreto.userinterfaces.Home;
import co.com.bancolombia.certification.utesreto.userinterfaces.Location;
import co.com.bancolombia.certification.utesreto.userinterfaces.Personal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(Home.REGISTER),
        SendKeys.of("Rafael").into(Personal.FIRSTNAME),
        SendKeys.of("Turizo").into(Personal.LASTNAME),
        SendKeys.of("Rafael.turizoto@gmail.com").into(Personal.EMAIL),
        SendKeys.of("January").into(Personal.BIRTHMONTH),
        SendKeys.of("7").into(Personal.BIRTHDAY),
        SendKeys.of("1992").into(Personal.BIRTHYEAR),
        Click.on(Location.CITY)

        );
    }

    public static RegisterUserReto Makeinformation() {

        return  instrumented(RegisterUserReto.class);
    }
}
