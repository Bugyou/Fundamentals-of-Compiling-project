package AOP;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by hupeng on 2017/5/18.
 */

@Aspect

public class AspectTest {

    private static final String TAG = "AspectTest";

    @Before("execution(* android.app.Activity.on**(..))")

    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {

        String key = joinPoint.getSignature().toString();

        Log.d(TAG, "onActivityMethodBefore: " + key);

    }

}