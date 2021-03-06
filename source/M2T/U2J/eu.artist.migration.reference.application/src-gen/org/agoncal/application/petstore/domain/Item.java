/*******************************************************************************
 * File generated from the petstore-app::org::agoncal::application::petstore::domain::Item uml Class
 * Generated by the Acceleo 3 <i>UML to Java</i> generator.
 * Date: 26. Juni 2014 10:57:28 MESZ
 *******************************************************************************/
package org.agoncal.application.petstore.domain;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Entity;
import org.agoncal.application.petstore.domain.Product;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Item.
 * 
 * @author 
 */
@Entity
public class Item {
	/**
	 * Description of the property id.
	 */
	@Id
	public Long id;
	/**
	  * Description of the property name.
	  */
	
	public String name;
	/**
	   * Description of the property description.
	   */
	
	public String description;
	/**
	    * Description of the property unitCost.
	    */
	
	public float unitCost;
	/**
	     * Description of the property product.
	     */
	
	public Ref<Product> product;
	// Start of user code (user defined attributes for Item)
	
	// End of user code
	
	/**
	 * The default constructor.
	 */
	public Item() {
	
	}
	
	// Start of user code (user defined methods for Item)
	
	// End of user code
	/**
	 * Returns id.
	 * @return id 
	 */
	public long getId() {
		return this.id;
	}
	
	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(long newId) {
	    this.id = newId;
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
	    this.name = newName;
	}

	/**
	 * Returns description.
	 * @return description 
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Sets a value to attribute description. 
	 * @param newDescription 
	 */
	public void setDescription(String newDescription) {
	    this.description = newDescription;
	}

	/**
	 * Returns unitCost.
	 * @return unitCost 
	 */
	public float getUnitCost() {
		return this.unitCost;
	}
	
	/**
	 * Sets a value to attribute unitCost. 
	 * @param newUnitCost 
	 */
	public void setUnitCost(float newUnitCost) {
	    this.unitCost = newUnitCost;
	}

	/** Returns product.
	 * @return product 
	 */
	public Product getProduct() {
		return this.product.get();
	}
	
	/**
	 * Sets a value to attribute product. 
	 * @param newProduct 
	 */
	public void setProduct(Product referencedEntity) {
		this.product = Ref.create(referencedEntity);
	}




}
