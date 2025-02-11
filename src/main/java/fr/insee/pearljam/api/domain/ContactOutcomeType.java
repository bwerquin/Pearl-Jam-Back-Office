package fr.insee.pearljam.api.domain;

/**
 * Define the type of the ContactOutcome entity
 * @author scorcaud
 *
 */
public enum ContactOutcomeType {
	INA("Interview accepted"),
	REF("Refusal"),
	IMP("Imposssible to reach"),
	UCD("Unusable Contact Data"),
	UTR("Unable To Respond"),
	ALA("Already answered"),
	ACP("Absence during Colletion Period"),
	DCD("Deceased"),
	NUH("No longer Used for Habitation"),
	NER("No interview for Exceptional");
	
	/**
	 * label of the ContactOutcomeType
	 */
	private String label;

	/**
	 * Defaut constructor for a ContactOutcomeType
	 * @param label
	 */
	ContactOutcomeType(String label) {
		this.label = label;
	}

	/**
	 * Get the label for a ContactOutcomeType
	 * @return label
	 */
	public String getLabel() {
		return label;
	}
}
