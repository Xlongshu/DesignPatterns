package longshu.designpatterns.builder;

public class BuilderTest {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
		
		System.out.println(pizza);
		waiter.setPizzaBuilder(spicy_pizzabuilder);
		waiter.constructPizza();
		System.out.println(waiter.getPizza());
	}
}
