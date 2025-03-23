package in.sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import in.sp.beans.Student;

public class StudentPostProcessor implements BeanPostProcessor
{
	@Override
	public Object postProcessBeforeInitialization(Object beanObj, String beanName) throws BeansException
	{
		Student stdObj = (Student) beanObj;
		stdObj.setName("Hello "+stdObj.getName());
		return stdObj;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object beanObj, String beanName) throws BeansException
	{
		Student stdObj = (Student) beanObj;
		stdObj.setName(stdObj.getName()+", how are you ??");
		return stdObj;
	}
}
