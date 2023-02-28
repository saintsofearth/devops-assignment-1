import java.*;

@RestController
@RequestMapping("/home")

public class HomeController {

	@GetMapping("test")
	public String testApi () {
		return "Response from your service";
	}

	@PostMapping("fetch/profile")
	public List<String> fetchUserProfile (@RequestBody User user) {
		return homeRepository.getUserProfile(user);
	}
}
