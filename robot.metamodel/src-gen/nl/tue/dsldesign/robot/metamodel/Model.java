/**
 */
package nl.tue.dsldesign.robot.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.dsldesign.robot.metamodel.Model#getStep <em>Step</em>}</li>
 *   <li>{@link nl.tue.dsldesign.robot.metamodel.Model#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.dsldesign.robot.metamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getModel_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(Initial)
	 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getModel_Initial()
	 * @model containment="true"
	 * @generated
	 */
	Initial getInitial();

	/**
	 * Sets the value of the '{@link nl.tue.dsldesign.robot.metamodel.Model#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Initial value);

} // Model
