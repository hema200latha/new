package com.netjstech.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
	@Entity
	@Table(name="user_master")
	public class User {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "id")
		private int userid;
			
		@Column(name = "name")
		private String userName;
			
		@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
		private Set<Accounts> accounts = new HashSet<>();

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String string) {
			this.userName = string;
		}

		public Set<Accounts> getAccounts() {
			return accounts;
		}

		public void setAccounts(Set<Accounts> accounts) {
			this.accounts = accounts;
			for (Accounts acct : accounts) {
				acct.setUser(this);	
			}
			}

		public void AddAccount(Accounts account) {
			account.setUser(this);
			this.getAccounts().add(account);
		}



}
