package EndPoints; /**
 * Created by User on 13/02/2016.
 */
import java.util.concurrent.atomic.AtomicLong;

import Controller.MutantController;
import Model.DiceRoller;
import Model.Tabeller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        DiceRoller dr = new DiceRoller();
        Tabeller t = new Tabeller();
        MutantController mc = new MutantController(dr, t);

        return new Greeting(counter.incrementAndGet(),
                String.format(t.getResult(Tabeller.Table.ruinIndustri, mc.getDiceResults())));
    }

}