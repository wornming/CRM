package com.crm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.crm.bean.Chance;
import com.crm.bean.Customer;
import com.crm.bean.UserInfo;
import com.crm.biz.ChanceBiz;
import com.crm.biz.CustomerBiz;
import com.crm.biz.UserInfoBiz;
import com.crm.web.model.PageModel;

import junit.framework.TestCase;

public class Test extends TestCase {

	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		UserInfo user =new UserInfo();
		user.setUname("a");
		user.setPwd("a");
		UserInfoBiz biz=(UserInfoBiz) context.getBean("userInfoBizImpl");
		System.out.println(biz.findUserInfo(user));
	}
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		CustomerBiz biz=(CustomerBiz) context.getBean("customerBizImpl");
		PageModel<Customer> page=new PageModel<Customer>();
		page.setPage(1);
		System.out.println(biz.getCustomerBean(page));
	}
	public void test3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ChanceBiz biz=(ChanceBiz) context.getBean("chanceBizImpl");
		PageModel<Chance> pagemodel=new PageModel<Chance>();
		System.out.println(biz.FindChanceListPage(pagemodel));
	}
}
