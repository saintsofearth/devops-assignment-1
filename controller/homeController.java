import java.*;

@RestController
@RequestMapping("/home")

public class HomeController {

	@GetMapping("test")
	public String testApi () {
		return "Response from your service";
	}
}
