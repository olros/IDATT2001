package Oblig5b_design;

import java.time.LocalDate;
import java.util.logging.Level;

public class Client {
	public static void main(String[] args) {
		try {
			ScandinavianWildAnimal ulla = WildAnimalFactorySingleton.newFemaleWolf("Ulla", LocalDate.of(2015, 2, 26), LocalDate.of(2015, 4, 29), "Innhegning 2, Skandinaviske rovdyr", 0);
			System.out.println(ulla.printInfo());
		} catch (Exception e) {
			e.printStackTrace();
			ZooLogger.getLogger().log(Level.FINE, e.getMessage());
		}
	}
}

