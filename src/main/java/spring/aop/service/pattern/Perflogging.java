package spring.aop.service.pattern;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS) // 어노테이션 정보 보관 관련 설정
@Target(ElementType.METHOD)
public @interface Perflogging {

}
