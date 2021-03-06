package vlfsoft.principles.generic;

import vlfsoft.principles.ProgrammingPrinciple;

import java.lang.annotation.*;

/**
 * See <a href="http://java-design-patterns.com/principles/#do-the-simplest-thing-that-could-possibly-work">Keep things DRY</a>
 * DRY - don't repeat yourself
 */
@ProgrammingPrinciple.Generic
@Documented
@Inherited
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE})
public @interface KeepThingsDRYPrinciple {
    boolean value();
}
