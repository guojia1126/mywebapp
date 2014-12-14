/**
 * 
 */
package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * Title: User
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author GuoJM
 * @date 2014年12月14日
 */
@Entity
@Table(name = "t_user")
public class User {
	// 这里在test 库，建立表t_user,字段都很简单，方便测试
	// 主键自动增长
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}