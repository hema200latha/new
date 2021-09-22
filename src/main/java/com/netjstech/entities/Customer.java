package com.netjstech.entities;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="Customer_master")
@NamedQuery(name ="Customer.findByAmount",query="Select c from Customerc where c.id in(Select t.customer from Transactions t where t.amount>?1)")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int Customerid;
	
	@Column(name = "name")
	private String CustomerName;
	
	@Column(name = "Address")
	private String CustomerAddress;
	
	@Column(name = "Email")
	private String CustomerEmail;
	
	@OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL)
	private Set<Transactions> transactions = new HashSet<>();
	
	
	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		 this.Customerid = customerid;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public Set<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transactions> transactions) {
		this.transactions =transactions ;
		for (Transactions acct : transactions) {
			acct.setCustomer(this);	
		}
		}

	
	}


	
	
	

