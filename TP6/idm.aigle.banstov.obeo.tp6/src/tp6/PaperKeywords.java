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
 * A representation of the model object '<em><b>Paper Keywords</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp6.PaperKeywords#getWeight <em>Weight</em>}</li>
 *   <li>{@link tp6.PaperKeywords#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp6.Tp6Package#getPaperKeywords()
 * @model annotation="diagraph label\075weight=''"
 * @generated
 */
public interface PaperKeywords extends EObject {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see tp6.Tp6Package#getPaperKeywords_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link tp6.PaperKeywords#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' reference.
	 * @see #setKeyword(Keyword)
	 * @see tp6.Tp6Package#getPaperKeywords_Keyword()
	 * @model
	 * @generated
	 */
	Keyword getKeyword();

	/**
	 * Sets the value of the '{@link tp6.PaperKeywords#getKeyword <em>Keyword</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(Keyword value);

} // PaperKeywords
