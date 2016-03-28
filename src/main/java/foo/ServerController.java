package foo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zzc on 3/28/16.
 */

@RestController
@RequestMapping("/server")
public class ServerController {


  @RequestMapping(method = RequestMethod.GET, value = "/foo")
  public DateWrapper foo() {
    return new DateWrapper();
  }

  @RequestMapping(method = RequestMethod.POST, value = "/bar")
  public DateWrapper bar(DateWrapper dateWrapper) {
    return dateWrapper;
  }


}

