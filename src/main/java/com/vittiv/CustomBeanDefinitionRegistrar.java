package com.vittiv;
import org.reflections.Reflections;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AutowireCandidateQualifier;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.beans.Introspector;
import java.util.Set;

public class CustomBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Reflections scanner = new Reflections("com.vittiv");
        Set<Class<?>> classes = scanner.getTypesAnnotatedWith(Singlton.class);
        for (Class<?> aClass : classes) {
            GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
            beanDefinition.setBeanClass(aClass);
            beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
            beanDefinition.addQualifier(new AutowireCandidateQualifier(Legacy.class));

            registry.registerBeanDefinition(Introspector.decapitalize(aClass.getSimpleName()), beanDefinition);
        }
    }
}
