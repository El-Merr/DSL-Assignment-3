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
 *   <li>{@link nl.tue.dsldesign.robot.metamodel.Model#getRobots <em>Robots</em>}</li>
 * </ul>
 *
 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.dsldesign.robot.metamodel.Robot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' containment reference list.
	 * @see nl.tue.dsldesign.robot.metamodel.MetamodelPackage#getModel_Robots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Robot> getRobots();

} // Model
