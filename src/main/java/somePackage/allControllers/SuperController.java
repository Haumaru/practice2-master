package somePackage.allControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/super")
public class SuperController {

    @GetMapping("/super")
    @ResponseBody
    String getMeSuperString(){
        return "Super String";
    }

}
