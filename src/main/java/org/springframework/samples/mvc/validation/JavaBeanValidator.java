package org.springframework.samples.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class JavaBeanValidator implements ConstraintValidator<ValidJavaBean,Object> {
    @Override
    public void initialize(ValidJavaBean constraintAnnotation) {

    }

    /**
     * Returns true if the objects passes the validation. This one requires the number
     * of the JavaBean to be positive, but much more complex validation can be used.
     * @param obj The object that has to be validated, should be of JavaBean type.
     * @param context Context of the validation.
     * @return True if the object passes the validation.
     */
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        if(obj instanceof JavaBean){
            JavaBean javaBean = (JavaBean) obj;
            if(javaBean.getNumber()>0) {
                return true;
            }
        }

        return false;
    }
}
