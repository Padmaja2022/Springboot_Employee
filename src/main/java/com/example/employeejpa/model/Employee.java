package com.example.employeejpa.model;
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "employee")
	public class Employee {
	        
	        /**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the emailId
		 */
		public String getEmailId() {
			return emailId;
		}

		/**
		 * @param emailId the emailId to set
		 */
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

			@Id
	        @GeneratedValue(strategy = GenerationType.IDENTITY)
	        @Column(name="emp_id")
	            private Long id;
	        
	        @Column(name="first_name")
	        private String firstName;
	        
	        @Column(name="last_name")
	        private String lastName;
	        
	        @Column(name="email_id")
	        private String emailId;
	}

