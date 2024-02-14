package zuci.mts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {
	@Id
	@Positive(message = "Movie id must no be in negative number")
	private int movieId;
	@NotBlank(message="movie name is mandatory")
	private String movieName;
	private int ticketCost;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@FutureOrPresent
	private Date releaseDate;
}
