package spring.aop.service.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PengSooProxy implements PengsooService {

    @Autowired
    private PengsooService pengsooService;

    @Override
    public void pengHi() throws InterruptedException {
        long begin = System.currentTimeMillis();

        pengsooService.pengHi();

        long finish = System.currentTimeMillis();
        System.out.println("time : " + (finish - begin));
    }

    @Override
    public void pengBye() {
        pengsooService.pengBye();
    }
}
