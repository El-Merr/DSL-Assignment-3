/**
 */
package nl.tue.dsldesign.robot.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.robot.metamodel.Step#getDirection <em>Direction</em>}</li>
 *   <li>{@link nl.tue.dsldesign.robot.metamodel.Step#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.dsldesign.robot.metamodel.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see nl.tue.dsldesign.robot.metamodel.Direction
	 * @see #setDirection(Direction)
	 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getStep_Direction()
	 * @model required="true"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.robot.metamodel.Step#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see nl.tue.dsldesign.robot.metamodel.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(Integer)
	 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getStep_Distance()
	 * @model
	 * @generated
	 */
	Integer getDistance();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.robot.metamodel.Step#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Integer value);

} // Step
