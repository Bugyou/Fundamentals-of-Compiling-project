package AOP;

/**
 * Created by hupeng on 2017/5/27.
 */

import android.util.Log;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by hupeng on 2017/5/26.
 */
@Aspect
public class Throwable_AOP
{
    @AfterThrowing(throwing="ex", pointcut = "execution(* org.moire.opensudoku..*.*(..))")
    public void logForThrowable(Throwable ex)
    {
        Log.e("Throwable", ex.toString());
    }

}
