package foo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zzc on 3/28/16.
 */

@Controller
@RequestMapping("/client")
public class ClientController {

  private RestTemplate restTemplate = new RestTemplate();

  @RequestMapping(method = RequestMethod.GET, value = "/foo")
  public DateWrapper foo() {
    return restTemplate.getForObject("http://localhost:8080/server/foo", DateWrapper.class);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/bar")
  public DateWrapper bar() {
    return restTemplate.postForObject("http://localhost:8080/server/bar", new DateWrapper(), DateWrapper.class);
  }

}

