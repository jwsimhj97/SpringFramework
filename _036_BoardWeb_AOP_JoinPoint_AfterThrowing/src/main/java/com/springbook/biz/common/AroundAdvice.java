package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	//ProceedingJoinPoint : ���� �������� ����Ʈ�� �޼ҵ�, JoinPoint �������̽��� ��ӹ޾Ƽ� ������ ��ü
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("[BEFORE] : ����Ͻ� ���� ���� �� ó���� ����...");
		Object returnObj = pjp.proceed();
		System.out.println("[AFTER] : ����Ͻ� ���� ���� �� ó���� ����...");
		return returnObj;
	}
}
