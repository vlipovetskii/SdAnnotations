package vlfsoft.principles.moduleclass;

import vlfsoft.principles.ProgrammingPrinciple;

import java.lang.annotation.*;

/**
 * See <a href="http://java-design-patterns.com/principles/#curlys-law">Curly's Law</a>
 */
@ProgrammingPrinciple.ModuleClass
@Documented
@Inherited
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE})
public @interface CurlyLawPrinciple {
    boolean value();
}
