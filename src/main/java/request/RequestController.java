package request;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RequestController {

    private static final String TEMPLATE = "Request, %s!";

    @RequestMapping("/request")
    public HttpEntity<Request> request_info(
            @RequestParam(value = "id", required = false, defaultValue = "12345") String name) {

        Request myrequest = new Request(String.format(TEMPLATE, name));
        myrequest.add(linkTo(methodOn(RequestController.class).request_info(name)).withSelfRel());

        return new ResponseEntity<Request>(myrequest, HttpStatus.OK);
    }
}
