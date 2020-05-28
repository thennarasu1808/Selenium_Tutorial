package JavaCrashCourse;

public class SuperHeroOrNot {

	String superHero = "Thor";

	public void superHero_or_not() {

		switch (superHero) {
		case "Super man":
			System.out.println("Super man is the Super Hero");
			break;

		case "Iron man":
			System.out.println("Iron man is the Super Hero");
			break;
		case "Bat man":
			System.out.println("Bat man is the Super Hero");
			break;
		case "Thor":
			System.out.println("Thor is the Super Hero");
			break;

// If no above conditions are not satisfied, the below default code will execute
		default:
			System.out.println("He is not the super hero");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperHeroOrNot hero = new SuperHeroOrNot();
		hero.superHero_or_not();

	}

}
