package in.sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import in.sp.beans.Employee;
import in.sp.beans.Student;

public class PostProcessor implements BeanPostProcessor
{
	@Override
	public Object postProcessBeforeInitialization(Object beanObj, String beanName) throws BeansException
	{
		if(beanObj instanceof Student)
		{
			Student stdObj = (Student) beanObj;
			stdObj.setName("Hello "+stdObj.getName());
			return stdObj;
		}
		else
		{
			Employee empObj = (Employee) beanObj;
			empObj.setPhoneno("+91-"+empObj.getPhoneno());
			return empObj;
		}
	}
	
	@Override
	public Object postProcessAfterInitialization(Object beanObj, String beanName) throws BeansException
	{
//		if(beanObj instanceof Student)
//		{
//			Student stdObj = (Student) beanObj;
//			stdObj.setName(stdObj.getName()+", how are you ??");
//			return stdObj;
//		}
//		else
//		{
//			return beanObj;
//		}
		
		return beanObj;
	}
}
