
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{

    private static final String template = "Hello, tutaj dane: wiek %s, id %s, imie %s, plec %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/bye") // odpowiada endpoint’om http
    public Greeting greeting(@RequestParam(value = "wiek", defaultValue = "10") String
                                     wiek,
                                   @RequestParam(value = "id", defaultValue = "1234") String id,
                                   @RequestParam(value = "imie", defaultValue = "Wiktoria") String imie, String plec)
    {

        if(imie.endsWith("a"))
        {
            plec = "Kobieta";
        }
        else
        {
            plec = "Mezczyzna";
        }

        return new Greeting(counter.incrementAndGet(), String.format(template, wiek, id, imie, plec));
    }

    private final AtomicLong counternowy = new AtomicLong();
    @RequestMapping("/byenowy") // odpowiada endpoint’om http
    public String greetingnowy(@RequestParam(value = "sprawdzam_wzor", defaultValue = "Wiktoria") String
                                         imie, String wzor)
    {
        if(imie == "Wiktoria")
        {
            wzor = "zawiera sie we wzorze";
        }
        else
        {
            wzor = "nie zawiera sie we wzorze";
        }
        return "Podane imie " +wzor;
    }

}