package spring.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.aop.service.aop.PengsooService;

@RestController
public class PengsooController {

    @Autowired
    private PengsooService pengsooService;

    @GetMapping("/peng")
    public void pengHi() throws InterruptedException {
        pengsooService.pengHi();
    }
}
