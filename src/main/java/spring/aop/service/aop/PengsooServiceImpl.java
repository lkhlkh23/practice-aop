package spring.aop.service.aop;

import org.springframework.stereotype.Service;

@Service
public class PengsooServiceImpl implements PengsooService {

    @Override
    public void pengHi() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("PENG HI");
    }

    @Override
    public void pengBye() {
        System.out.println("PENG BYE");
    }

}
