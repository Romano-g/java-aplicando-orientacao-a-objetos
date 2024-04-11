package desafio_003.sellable;

public class SellableMain {
	public static void main(String[] args) {
		Product product = new Product();
		Service service = new Service();

		product.setQuantityOfProducts(5);
		product.setDiscount(10);

		service.setDiscount(5);
		service.setQuantityOfProducts(5);

		System.out.println(product.calculateFinalPrice());
		System.out.println(service.calculateFinalPrice());
	}
}
