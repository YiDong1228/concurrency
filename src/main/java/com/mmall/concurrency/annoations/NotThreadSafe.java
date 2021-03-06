package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.annoations
 * @ClassName: ThreadSafe
 * @Description: 用来标记【线程不安全】的类或写法
 * @Author: yidong
 * @CreateDate: 2018/9/12 14:24
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface NotThreadSafe {

    String value() default "";

}
