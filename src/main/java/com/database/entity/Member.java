package com.database.entity;


	import javax.persistence.*;
	 
	@Entity
	@Table(name = "member")
	public class Member {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;

	    @Column(name = "uname")
	    private String uname;

	    @Column(name = "password")
	    private String password;

	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "phone")
	    private float phone;

	   

	    public Member(int id,String uname , String password, String email,float phone) {
	        this.uname = uname;
	        this.password = password;
	        this.email = email;
	        this.phone=phone;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	 
	    public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public float getPhone() {
			return phone;
		}

		public void setPhone(float phone) {
			this.phone = phone;
		}

		@Override
	    public String toString() {
	        return "Member [id=" + id + ", uname=" + uname+ ", password=" + password + ", email=" + email + ", password= " + password + "]";
	    }
}
	     
	   
	

