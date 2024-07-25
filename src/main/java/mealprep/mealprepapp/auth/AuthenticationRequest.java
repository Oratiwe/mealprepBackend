package mealprep.mealprepapp.auth;import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {

    private Long id;
    private String email;
    private String password;
    private String confirmPassword;
}
