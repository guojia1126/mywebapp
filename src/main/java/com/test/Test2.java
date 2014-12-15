package com.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.TbUserMapper;
import com.test.model.TbUser;

public class Test2 {
	public static void main(String[] args) {
		// 读取spring配置文件
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		// 通过spring配置文件生成的beanFactory获得SqlSessionFactory
		SqlSessionFactory factory = (SqlSessionFactory) beanFactory.getBean("sqlSessionFactory");
		// 获得SqlSession
		SqlSession session = factory.openSession();
		// 用session根据Mapper获得对象的Mapper对象
		TbUserMapper tbUserMapper = session.getMapper(TbUserMapper.class);

		TbUser tbUser = new TbUser();
		tbUser.setId(5);
		tbUser.setPwd("abc");
		// 数据插入
		tbUserMapper.insert(tbUser);
		// 数据更新
		tbUserMapper.updateByPrimaryKey(tbUser);
		// 数据删除
		tbUserMapper.deleteByPrimaryKey(1);
		// 数据查询
		List<TbUser> users = tbUserMapper.selectAll();
		for (TbUser user : users) {
			System.out.println(user);
		}
	}
}
