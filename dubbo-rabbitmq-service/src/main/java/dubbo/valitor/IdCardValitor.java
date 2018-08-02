package dubbo.valitor;

import dubbo.valitor.impl.IdCardValitorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Constraint(validatedBy = IdCardValitorImpl.class)
public @interface IdCardValitor {
    String message() default "身份证号码输入错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
