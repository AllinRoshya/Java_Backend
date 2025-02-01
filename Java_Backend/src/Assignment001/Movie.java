package Assignment001;

class Movie implements Comparable<Movie>{
   String movieName;
   short releaseYear;
	Movie(String movieName,short releaseYear){
		this.movieName=movieName;
		this.releaseYear=releaseYear;
	}
	@Override
	public int compareTo(Movie otherMovie) {
		return Short.compare(this.releaseYear,otherMovie.releaseYear);
//		return Integer.compare(otherMovie.releaseYear,this. releaseYear);
	}
	@Override
	public String toString() {
		return "\nTitle: "+movieName+"\nRelease Year: "+releaseYear; 
	}

}


