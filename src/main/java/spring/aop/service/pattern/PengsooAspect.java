package spring.aop.service.pattern;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PengsooAspect {

    // @Around("execution(* spring.aop.service.aop.PengsooService.*(..))") // 기존 코드 수정(X), 중복 (X), 복잡한 설정, 예외처리 불가
    @Around("@annotation(Perflogging)") // 기존 코드 수정 (O), 중복 (X), 예외처리 가능
    public Object logPerf(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long begin = System.currentTimeMillis();

        Object retVal = proceedingJoinPoint.proceed();

        long finish = System.currentTimeMillis();

        System.out.println("TIME : " + (finish - begin));

        return retVal;
    }
}
