package fr.insee.pearljam.api.dto.surveyunit;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import fr.insee.pearljam.api.dto.address.AddressDto;
import fr.insee.pearljam.api.dto.person.PersonDto;
import fr.insee.pearljam.api.dto.sampleidentifier.SampleIdentifiersDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyUnitContextDto {
	private String id;
	private List<PersonDto> persons;
	private AddressDto address;
	private String geographicalLocationId;
	private String organizationUnitId;
	private Boolean priority;
	private String campaign;
	private SampleIdentifiersDto sampleIdentifiers;

	public SurveyUnitContextDto() {
	}
	
	
	public SurveyUnitContextDto(String id, List<PersonDto> persons, AddressDto address, String geographicalLocationId,
			String organizationUnitId, Boolean priority, String campaign, SampleIdentifiersDto sampleIdentifiers) {
		super();
		this.id = id;
		this.persons = persons;
		this.address = address;
		this.geographicalLocationId = geographicalLocationId;
		this.organizationUnitId = organizationUnitId;
		this.priority = priority;
		this.campaign = campaign;
		this.sampleIdentifiers = sampleIdentifiers;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the persons
	 */
	public List<PersonDto> getPersons() {
		return persons;
	}

	/**
	 * @param persons the persons to set
	 */
	public void setPersons(List<PersonDto> persons) {
		this.persons = persons;
	}

	/**
	 * @return the address
	 */
	public AddressDto getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressDto address) {
		this.address = address;
	}

	/**
	 * @return the geographicalLocationId
	 */
	public String getGeographicalLocationId() {
		return geographicalLocationId;
	}

	/**
	 * @param geographicalLocationId the geographicalLocationId to set
	 */
	public void setGeographicalLocationId(String geographicalLocationId) {
		this.geographicalLocationId = geographicalLocationId;
	}

	/**
	 * @return the organizationUnitId
	 */
	public String getOrganizationUnitId() {
		return organizationUnitId;
	}
	/**
	 * @param organizationUnitId the organizationUnitId to set
	 */
	public void setOrganizationUnitId(String organizationUnitId) {
		this.organizationUnitId = organizationUnitId;
	}

	/**
	 * @return the priority
	 */
	public Boolean getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	/**
	 * @return the campaign
	 */
	public String getCampaign() {
		return campaign;
	}

	/**
	 * @param campaign the campaign to set
	 */
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	/**
	 * @return the sampleIdentifiers
	 */
	public SampleIdentifiersDto getSampleIdentifiers() {
		return sampleIdentifiers;
	}

	/**
	 * @param sampleIdentifiers the sampleIdentifiers to set
	 */
	public void setSampleIdentifiers(SampleIdentifiersDto sampleIdentifiers) {
		this.sampleIdentifiers = sampleIdentifiers;
	}

	/**
	 * This method checks if mandatory fields in the Survey Unit are valid or not
	 * @return boolean
	 */
	@JsonIgnore
	public boolean isValid() {
		return (this.id!=null && !this.id.isBlank()
				&& this.campaign!=null && !this.campaign.isBlank()
				&& this.address != null				
				&& this.persons != null && !this.persons.isEmpty()
				&& this.sampleIdentifiers != null
				&& this.priority != null);
	}
}
