package AOP;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by hupeng on 2017/5/25.
 */

@Aspect
public class Exception_AOP {

   /* @Before("handler(Exception)")
    public void onExceptionBefore(JoinPoint joinPoint)
    {
        String key = joinPoint.getSignature().toString();
        Log.d(TAG, "onExceptionBefore: " + key);
    }*/
    @Pointcut("handler(Exception)")
    public void logForException(){

    };

    @Before("logForException()")
    public void log(JoinPoint joinPoint)
    {
        Log.e("Exception","CatchException: "+joinPoint.getArgs().toString()+','+joinPoint.getSignature().toString()+','+
        joinPoint.getStaticPart().getSourceLocation().toString());
    }
}
