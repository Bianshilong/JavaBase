package com.bsl.entity;

import java.util.Date;
import java.util.List;


//import javax.persistence.*;			//可以用*代表导入所有的该类型包

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="user")
@Getter@Setter
public class User {
	
	@Id@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",nullable=false,unique=true)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	private String email;
	private String sex;
	
	//集合被注释了
	/*@ElementCollection
	@CollectionTable(name="habirat",joinColumns=@JoinColumn(name="user_id"))
	@Column(name="habirat_name")
	@OrderColumn(name="list_order")
	private List<String> habirat;
	*/
	@Temporal(TemporalType.DATE)
	private Date birth;
	
	//提供无参的构造函数
	public User() {
	}

	//提供有参的构造函数
	public User(Long id,String username, String password, String email, String sex, /*List<String> habirat,*/ Date birth) {
		super();
		this.id=id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.sex = sex;
//		this.habirat = habirat;
		this.birth = birth;
	}
	
}
