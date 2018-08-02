package dubbo.valitor.impl;

import dubbo.valitor.IdCardValitor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdCardValitorImpl implements ConstraintValidator<IdCardValitor,String> {

    private final static char[] last = {1 ,0 ,'X' ,9 ,8 ,7 ,6 ,5 ,4 ,3 ,2};
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value != null){
            if(value.length() == 18){
                valivali(value);
            }
            System.out.println("输入身份证号格式不正确，请重新输入");
            return false;
        }
        System.out.println("校验的身份证号为空，请输入身份证号");
        return false;
    }

    @Override
    public void initialize(IdCardValitor constraintAnnotation) {

    }

    public boolean valivali(String string){
        int count = 0 ;
        int[] ints = new int[]{7 ,9, 10 ,5 ,8 ,4 ,2 ,1 ,6 ,3 ,7 ,9 ,10 ,5 ,8 ,4 ,2};
        for (int i = 0; i < 17; i++) {
           count += (string.charAt(i)-'0') * ints[i];
           //System.out.println(count);
        }

        if(last[count % 11] == (string.charAt(17)-'0')){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args){
        String id = "140427199512158068";

//       / boolean flag = valivali(id);
//
//        System.out.println(flag);

    }
}
