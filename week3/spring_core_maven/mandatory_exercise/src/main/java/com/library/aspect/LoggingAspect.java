package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.library.service.*.*(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = pjp.proceed();
        long duration = System.currentTimeMillis() - start;
        System.out.println(pjp.getSignature() + " executed in " + duration + "ms");
        return result;
    }

    @Before("execution(* com.library.service.*.*(..))")
    public void beforeAdvice() {
        System.out.println("Before method call...");
    }

    @After("execution(* com.library.service.*.*(..))")
    public void afterAdvice() {
        System.out.println("After method call...");
    }
}
