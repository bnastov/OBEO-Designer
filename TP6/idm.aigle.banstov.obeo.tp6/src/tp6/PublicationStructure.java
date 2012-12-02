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
 * A representation of the model object '<em><b>Publication Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp6.PublicationStructure#getResearchers <em>Researchers</em>}</li>
 *   <li>{@link tp6.PublicationStructure#getPapers <em>Papers</em>}</li>
 *   <li>{@link tp6.PublicationStructure#getPositions <em>Positions</em>}</li>
 *   <li>{@link tp6.PublicationStructure#getKnowledgeMan <em>Knowledge Man</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp6.Tp6Package#getPublicationStructure()
 * @model annotation="diagraph pov='null'"
 * @generated
 */
public interface PublicationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Researchers</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.Researcher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Researchers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Researchers</em>' containment reference list.
	 * @see tp6.Tp6Package#getPublicationStructure_Researchers()
	 * @model type="tp6.Researcher" containment="true"
	 * @generated
	 */
	EList getResearchers();

	/**
	 * Returns the value of the '<em><b>Papers</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.Paper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Papers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Papers</em>' containment reference list.
	 * @see tp6.Tp6Package#getPublicationStructure_Papers()
	 * @model type="tp6.Paper" containment="true"
	 * @generated
	 */
	EList getPapers();

	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see tp6.Tp6Package#getPublicationStructure_Positions()
	 * @model type="tp6.Position" containment="true"
	 * @generated
	 */
	EList getPositions();

	/**
	 * Returns the value of the '<em><b>Knowledge Man</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knowledge Man</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Man</em>' containment reference.
	 * @see #setKnowledgeMan(KnowledgeManager)
	 * @see tp6.Tp6Package#getPublicationStructure_KnowledgeMan()
	 * @model containment="true"
	 * @generated
	 */
	KnowledgeManager getKnowledgeMan();

	/**
	 * Sets the value of the '{@link tp6.PublicationStructure#getKnowledgeMan <em>Knowledge Man</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge Man</em>' containment reference.
	 * @see #getKnowledgeMan()
	 * @generated
	 */
	void setKnowledgeMan(KnowledgeManager value);

} // PublicationStructure
