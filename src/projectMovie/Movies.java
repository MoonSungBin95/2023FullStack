package projectMovie;

public class Movies {
	
	private String MovieTitle;
	private String	MovieSerialNumber;
	private String Genre;
	private String ReleaseDate;
	private String WithdrawDate; 
	private String  ScreeningStatus;
	
	
	public Movies(String movieTitle, String movieSerialNumber, String genre, String releaseDate, String withdrawDate,
			String screeningStatus) {
		super();
		MovieTitle = movieTitle;
		MovieSerialNumber = movieSerialNumber;
		Genre = genre;
		ReleaseDate = releaseDate;
		WithdrawDate = withdrawDate;
		ScreeningStatus = screeningStatus;
	}
	
	public String getMovieTitle() {
		return MovieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		MovieTitle = movieTitle;
	}
	public String getMovieSerialNumber() {
		return MovieSerialNumber;
	}
	public void setMovieSerialNumber(String movieSerialNumber) {
		MovieSerialNumber = movieSerialNumber;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}
	public String getWithdrawDate() {
		return WithdrawDate;
	}
	public void setWithdrawDate(String withdrawDate) {
		WithdrawDate = withdrawDate;
	}


	public String getScreeningStatus() {
		return ScreeningStatus;
	}

	public void setScreeningStatus(String screeningStatus) {
		ScreeningStatus = screeningStatus;
	}

	@Override
	public String toString() {
		return "Movies [MovieTitle=" + MovieTitle + ", MovieSerialNumber=" + MovieSerialNumber + ", Genre=" + Genre
				+ ", ReleaseDate=" + ReleaseDate + ", WithdrawDate=" + WithdrawDate + ", ScreeningStatus="
				+ ScreeningStatus + "]";
	}
	
	
}
