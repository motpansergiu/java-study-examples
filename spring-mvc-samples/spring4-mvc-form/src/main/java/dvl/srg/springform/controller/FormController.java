package dvl.srg.springform.controller;

import dvl.srg.springform.form.Subscriber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FormController {

    @ModelAttribute("frequencies")
    public Subscriber.Frequency[] frequencies() {
        return Subscriber.Frequency.values();
    }

    @RequestMapping(value = "/form/new", method = RequestMethod.GET)
    public String loadNewFormPage(Model m) {
        m.addAttribute("subscriber", new Subscriber());
        return "formPage";
    }

    @RequestMapping(value = "form/new", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute Subscriber subscriber, Model m) {
        m.addAttribute("message", "Successfully saved person: " + subscriber.toString());
        return "formPage";
    }

    @RequestMapping(value = "/form/update", method = RequestMethod.GET)
    public String loadExistingFormPage(Model m) {
        m.addAttribute("subscriber", newSubscriber());
        return "formPageUpdate";
    }

    @RequestMapping(value = "/form/update", method = RequestMethod.POST)
    public String updateFormPage(@ModelAttribute Subscriber subscriber, Model m) {
        m.addAttribute("message", "Successfully updated person: " + subscriber.toString());
        return "formPageUpdate";
    }

    private Subscriber newSubscriber() {
        Subscriber subscriber = new Subscriber();
        subscriber.setName("Chello");
        subscriber.setAge(25);
        subscriber.setEmail("chello@mail.com");
        subscriber.setGender(Subscriber.Gender.MALE);
        subscriber.setNewsletterFrequency(Subscriber.Frequency.MONTHLY);
        subscriber.setReceiveNewsletter(true);
        return subscriber;
    }
}
