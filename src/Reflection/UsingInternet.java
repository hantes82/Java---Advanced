import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by OskarPraca on 2017-03-29.
 */

@Target({ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface UsingInternet {
    String internetGetway();
}
