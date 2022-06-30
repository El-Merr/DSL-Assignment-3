/**
 */
package nl.tue.dsldesign.robot.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.robot.metamodel.Initial#getXPos <em>XPos</em>}</li>
 *   <li>{@link nl.tue.dsldesign.robot.metamodel.Initial#getYPos <em>YPos</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getInitial()
 * @model
 * @generated
 */
public interface Initial extends EObject {
	/**
	 * Returns the value of the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPos</em>' attribute.
	 * @see #setXPos(Integer)
	 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getInitial_XPos()
	 * @model
	 * @generated
	 */
	Integer getXPos();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.robot.metamodel.Initial#getXPos <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPos</em>' attribute.
	 * @see #getXPos()
	 * @generated
	 */
	void setXPos(Integer value);

	/**
	 * Returns the value of the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPos</em>' attribute.
	 * @see #setYPos(Integer)
	 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getInitial_YPos()
	 * @model
	 * @generated
	 */
	Integer getYPos();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.robot.metamodel.Initial#getYPos <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPos</em>' attribute.
	 * @see #getYPos()
	 * @generated
	 */
	void setYPos(Integer value);

} // Initial
