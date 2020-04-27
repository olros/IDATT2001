package Oblig5b_design;

import java.time.LocalDate;

public class WildAnimalFactorySingleton {
	public static Individual individual = null;

	private WildAnimalFactorySingleton() {
	}

	public static ScandinavianWildAnimal newMaleBear(String name, LocalDate birthDate, LocalDate arrivalDate, String address) {
		if (individual == null) {
			return individual = new MaleIndividual("Brunbjørn", "Ursus arctos",
					"Ursidae", arrivalDate, name, birthDate, true, address);
		}
		return individual;
	}

	public static ScandinavianWildAnimal newFemaleWolf(String name, LocalDate birthDate, LocalDate arrivalDate, String address, int noLitters) {
		if (individual == null) {
			return individual = new FemaleIndividual("Ulv", "Canis lupus", "Canidae", arrivalDate,
					name, birthDate, true, address, noLitters);
		}
		return individual;
	}

	public static ScandinavianWildAnimal newMaleWolf(String name, LocalDate birthDate, LocalDate arrivalDate, String address) {
		if (individual == null) {
			return individual = new MaleIndividual("Ulv", "Canis lupus", "Canidae", arrivalDate,
					name, birthDate, true, address);
		}
		return individual;
	}
}
