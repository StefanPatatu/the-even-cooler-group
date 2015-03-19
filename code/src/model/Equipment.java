package model;

public class Equipment {
	private int id_equipment;
	private String equipmentType;
	private String equipmentDescription;

	public int getId_equipment() {
		return id_equipment;
	}

	public void setId_equipment(int id_equipment) {
		this.id_equipment = id_equipment;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getEquipmentDescription() {
		return equipmentDescription;
	}

	public void setEquipmentDescription(String equipmentDescription) {
		this.equipmentDescription = equipmentDescription;
	}

	@Override
	public String toString() {
		return "Equipment [" + 
				"id_equipment=" + id_equipment + 
				", equipmentType=" + equipmentType + 
				", equimentDescription=" + equipmentDescription +
				"]";

}
}
