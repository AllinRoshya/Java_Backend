package Assignment001;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Movie movie1=new Movie("GOAT",(short)2024);
		Movie movie2=new Movie("Leo",(short)2023);
		Movie movie3=new Movie("Varisu",(short)2023);
		Movie movie4=new Movie("Beast",(short)2022);
		Movie movie5=new Movie("Master",(short)2021);
		Movie movie6=new Movie("Kaththi", (short)2014);
		Movie movie7=new Movie("Jilla", (short)2014);
		
		Movie[] movies= {movie1,movie2,movie3,movie4,movie5,movie6,movie7};
		Arrays.sort(movies);
		for(Movie title:movies) {
			System.out.println(title);
		}
	}

}
