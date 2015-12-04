package org.sample;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class Sample {

    @RequestMapping("/")
    String home() {
        return "Hello World! v3";
    }
}
