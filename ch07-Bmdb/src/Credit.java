
public class Credit {

		
		private int ID;
		private int actorID;
		private int movieID;
		private String role;
		
		
		
		public Credit(int iD, int actorID, int movieID, String role) {
			super();
			ID = iD;
			this.actorID = actorID;
			this.movieID = movieID;
			this.role = role;
		}



		public int getID() {
			return ID;
		}



		public void setID(int iD) {
			ID = iD;
		}



		public int getActorID() {
			return actorID;
		}



		public void setActorID(int actorID) {
			this.actorID = actorID;
		}



		public int getMovieID() {
			return movieID;
		}



		public void setMovieID(int movieID) {
			this.movieID = movieID;
		}



		public String getRole() {
			return role;
		}



		public void setRole(String role) {
			this.role = role;
		}
		
		
		

}
