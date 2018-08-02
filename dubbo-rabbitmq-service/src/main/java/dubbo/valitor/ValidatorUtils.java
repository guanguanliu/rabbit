package dubbo.valitor;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ValidatorUtils {

    private static Validator validator;

    static {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }
    public static <T> void validate(T t){
        if (null != t) {
            Set<ConstraintViolation<T>> set = validator.validate(t);
            if (set.size() > 0) {
                System.out.println("身份证信息错误");
            }
        }
    }
}
