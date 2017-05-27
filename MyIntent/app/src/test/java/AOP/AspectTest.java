package AOP;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by hupeng on 2017/5/20.
 */
@Aspect

public class AspectTest {

    private static final String TAG = "xuyisheng";
    @Before("execution(* com.hupeng.myintent.*.on*(..))")
    //@Before("execution(* android.app.MainActivity.on**(..))")

    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {

        String key = joinPoint.getSignature().toString();

        Log.d(TAG, "onActivityMethodBefore: " + key);

    }

}