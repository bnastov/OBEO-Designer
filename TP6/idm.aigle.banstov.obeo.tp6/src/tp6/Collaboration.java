/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp6;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp6.Collaboration#getRatio <em>Ratio</em>}</li>
 *   <li>{@link tp6.Collaboration#getCol_paper <em>Col paper</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp6.Tp6Package#getCollaboration()
 * @model annotation="diagraph label\075ratio=''"
 * @generated
 */
public interface Collaboration extends EObject {
	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #setRatio(int)
	 * @see tp6.Tp6Package#getCollaboration_Ratio()
	 * @model
	 * @generated
	 */
	int getRatio();

	/**
	 * Sets the value of the '{@link tp6.Collaboration#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(int value);

	/**
	 * Returns the value of the '<em><b>Col paper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col paper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col paper</em>' reference.
	 * @see #setCol_paper(Paper)
	 * @see tp6.Tp6Package#getCollaboration_Col_paper()
	 * @model
	 * @generated
	 */
	Paper getCol_paper();

	/**
	 * Sets the value of the '{@link tp6.Collaboration#getCol_paper <em>Col paper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col paper</em>' reference.
	 * @see #getCol_paper()
	 * @generated
	 */
	void setCol_paper(Paper value);

} // Collaboration
