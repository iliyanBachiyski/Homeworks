	public class Name {
		private String firstName;
		private String seconName;
		private String lastName;
	
		public Name(String firstName, String seconName, String lastName) {
			this.firstName = firstName;
			this.seconName = seconName;
			this.lastName = lastName;
		}
	
		public String getFirstName() {
			return firstName;
		}
	
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	
		public String getSeconName() {
			return seconName;
		}
	
		public void setSeconName(String seconName) {
			this.seconName = seconName;
		}
	
		public String getLastName() {
			return lastName;
		}
	
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}