package com.tacticlogistics.crm.model.entities.dashboard;
// Generated 02-nov-2015 10:55:17 by Hibernate Tools 4.3.1.Final

import com.tacticlogistics.crm.model.entities.Ciudades;
import com.tacticlogistics.crm.model.entities.EntityId;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Inventario generated by hbm2java
 */
@Entity
@Table(name = "Inventario", catalog = "dbo")
public class Inventario implements java.io.Serializable, EntityId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Ciudades ciudades;
	private String buildingId;
	private String area;
	private String storageLocation;
	private String itemNumber;
	private String description;
	private String inventoryStatus;
	private Integer unitQuantity;
	private String lotNumber;
	private String fifoDate;
	private String expirationDate;
	private Integer maximumCapacity;
	private Integer usedCapacity;
	private String itemClientId;
	private String unitType;

	public Inventario() {
	}

	public Inventario(Integer id) {
		this.id = id;
	}

	public Inventario(Integer id, Ciudades ciudades, String buildingId, String area, String storageLocation,
			String itemNumber, String description, String inventoryStatus, Integer unitQuantity, String lotNumber,
			String fifoDate, String expirationDate, Integer maximumCapacity, Integer usedCapacity,
			String itemClientId) {
		this.id = id;
		this.ciudades = ciudades;
		this.buildingId = buildingId;
		this.area = area;
		this.storageLocation = storageLocation;
		this.itemNumber = itemNumber;
		this.description = description;
		this.inventoryStatus = inventoryStatus;
		this.unitQuantity = unitQuantity;
		this.lotNumber = lotNumber;
		this.fifoDate = fifoDate;
		this.expirationDate = expirationDate;
		this.maximumCapacity = maximumCapacity;
		this.usedCapacity = usedCapacity;
		this.itemClientId = itemClientId;
	}

	@Override
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ciudad", nullable = false)
	public Ciudades getCiudades() {
		return this.ciudades;
	}

	public void setCiudades(Ciudades ciudades) {
		this.ciudades = ciudades;
	}

	@Column(name = "Building_ID", length = 50)
	public String getBuildingId() {
		return this.buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	@Column(name = "Area", length = 50)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "Storage_Location", length = 50)
	public String getStorageLocation() {
		return this.storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	@Column(name = "Item_Number", length = 50)
	public String getItemNumber() {
		return this.itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Column(name = "Description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "Inventory_Status", length = 50)
	public String getInventoryStatus() {
		return this.inventoryStatus;
	}

	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}

	@Column(name = "Unit_Quantity")
	public Integer getUnitQuantity() {
		return this.unitQuantity;
	}

	public void setUnitQuantity(Integer unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

	@Column(name = "Lot_Number", length = 50)
	public String getLotNumber() {
		return this.lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	@Column(name = "FIFO_Date", length = 50)
	public String getFifoDate() {
		return this.fifoDate;
	}

	public void setFifoDate(String fifoDate) {
		this.fifoDate = fifoDate;
	}

	@Column(name = "Expiration_Date", length = 50)
	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Column(name = "Maximum_Capacity")
	public Integer getMaximumCapacity() {
		return this.maximumCapacity;
	}

	public void setMaximumCapacity(Integer maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	@Column(name = "Used_Capacity")
	public Integer getUsedCapacity() {
		return this.usedCapacity;
	}

	public void setUsedCapacity(Integer usedCapacity) {
		this.usedCapacity = usedCapacity;
	}

	@Column(name = "Item_Client_ID", length = 50)
	public String getItemClientId() {
		return this.itemClientId;
	}

	public void setItemClientId(String itemClientId) {
		this.itemClientId = itemClientId;
	}

	@Column(name = "Unit_Type", length = 50)
	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}
