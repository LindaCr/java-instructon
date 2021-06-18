
package text;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;
import interfaces.DAO;

public class MovieTextFile implements DAO<Movie> {

		private List<Movie> movies=null;
		private Path moviesPath= null;
		private File moviesFile=null;
		private final String FIELD_SEP="\t";
		
		
		public MovieTextFile() {
			super();
			moviesPath=Paths.get("movies.txt");
			moviesFile=moviesPath.toFile();
			movies=getAll();
		}
		
		
		
		@Override
		public Movie get(int id) {
			Movie movie=null;
			
			for (Movie m: movies) {
				if (m.getId()==id) {
					movie=m;
				}
			}
			return movie;
		}
			
		
		
		@Override
		public List<Movie> getAll() {
			if (movies!=null) {
				return movies;
			}
			movies=new ArrayList<Movie>();
			if (Files.exists(moviesPath)) {
				try (BufferedReader in= new BufferedReader(
										new FileReader(moviesFile))) {
					//read items from file into ArrayList
					String line=in.readLine();
					while (line!=null) {
						String [] fields=line.split(FIELD_SEP);
						String idStr=fields[0];
						int id=Integer.parseInt(idStr);
						String title=fields[1];
						String yearStr=fields[2];
						int year=Integer.parseInt(yearStr);
						String rating=fields[3];
						String director=fields[4];
						Movie movie= new Movie(id,title, year, rating, director);
						movies.add(movie);
						line=in.readLine();	
					}
				}
				catch (IOException ioe) {
					ioe.printStackTrace();
					return null;
				}
			}
			else {
				System.out.println(moviesPath.toAbsolutePath()+"doesn't exist");
				try {
					Files.createFile(moviesPath);
					System.out.println("Empty file created.");
				} catch (IOException e) {
					System.out.println("Error creating file.");
					e.printStackTrace();
				}
			}
			return movies;
		}
					

		@Override
		public boolean add(Movie movie) {
			boolean success=false;
			movies.add(movie);
			success=saveAll();
			return success;
		}
			
		@Override
		public boolean update(Movie movie) {
			Movie oldMovie=this.get(movie.getId());
			int idx= movies.indexOf(oldMovie);
			movies.set(idx, movie);
			return saveAll();
		}

			
		@Override
		public boolean delete(Movie movie) {
			movies.remove(movie);
			return saveAll();
		}
			
			
			
	
		private boolean saveAll() {
			boolean success=false;
			try (PrintWriter out= new PrintWriter(
								  new BufferedWriter(
								  new FileWriter(moviesFile)))) {
				for (Movie movie: movies) {
					out.print(movie.getId()+FIELD_SEP);
					out.println(movie.getTitle());
				}
				success=true;
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			
			
			return success;
		}
		
}