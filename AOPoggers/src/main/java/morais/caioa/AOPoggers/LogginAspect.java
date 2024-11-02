package morais.caioa.AOPoggers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Aspect
@Component
public class LogginAspect {

    //Advice: Acao executada que adiciona o comportamento

    @Before("execution(* morais.caioa.AOPoggers.services.*.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("UEPA TO CHAMANDO O " + joinPoint.getSignature() + " HEIN");
    }

    @Around("execution(* morais.caioa.AOPoggers.dummy.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("UEPA OIA A CHAMADA INDO" + joinPoint.getSignature() + " HEIN");
        Object obj = joinPoint.proceed();
        System.out.println("UEPA OIA A CHAMADA VOLTANDO" + joinPoint.getSignature() + " HEIN");
        return obj;

    }
}
