import java.*;

@RestController
@RestMapping("cart")

public class CartController {

	@GetMapping("{user_id}/items")
	public List<String> cartItems (@PathVariable("user_id") Long userId) {
		return cartRepository.getMyCart(userId);
	}
}
