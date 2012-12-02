/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp6;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp6.KnowledgeManager#getAllKeywords <em>All Keywords</em>}</li>
 *   <li>{@link tp6.KnowledgeManager#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp6.Tp6Package#getKnowledgeManager()
 * @model annotation="diagraph node='' label\075name='' kref\075allKeywords=''"
 * @generated
 */
public interface KnowledgeManager extends EObject {
	/**
	 * Returns the value of the '<em><b>All Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.Keyword}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Keywords</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Keywords</em>' containment reference list.
	 * @see tp6.Tp6Package#getKnowledgeManager_AllKeywords()
	 * @model type="tp6.Keyword" containment="true"
	 * @generated
	 */
	EList getAllKeywords();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tp6.Tp6Package#getKnowledgeManager_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp6.KnowledgeManager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // KnowledgeManager
