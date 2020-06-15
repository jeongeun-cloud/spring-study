package part11;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("profiler")
public class Profiler {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("profiler == Before || " + joinPoint.getSignature().toShortString());
		try {
			Object result = joinPoint.proceed();
			return result;
		}finally{
			System.out.println("profiler == After || " + joinPoint.getSignature().toShortString());
		}
	}
}
