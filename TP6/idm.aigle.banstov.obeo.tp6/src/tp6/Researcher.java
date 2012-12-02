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
 * A representation of the model object '<em><b>Researcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp6.Researcher#getName <em>Name</em>}</li>
 *   <li>{@link tp6.Researcher#getForName <em>For Name</em>}</li>
 *   <li>{@link tp6.Researcher#getRes_papers <em>Res papers</em>}</li>
 *   <li>{@link tp6.Researcher#getSkills <em>Skills</em>}</li>
 *   <li>{@link tp6.Researcher#getRes_position <em>Res position</em>}</li>
 *   <li>{@link tp6.Researcher#getCollaborations <em>Collaborations</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp6.Tp6Package#getResearcher()
 * @model annotation="diagraph node='' label\075name='' label\075forName='null' lnk\075collaborations='null' ref\075res_position='null' cref\075skills='null' style\075green='null' style.ref.res_position\075e1='null'"
 * @generated
 */
public interface Researcher extends EObject {
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
	 * @see tp6.Tp6Package#getResearcher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp6.Researcher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>For Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Name</em>' attribute.
	 * @see #setForName(String)
	 * @see tp6.Tp6Package#getResearcher_ForName()
	 * @model
	 * @generated
	 */
	String getForName();

	/**
	 * Sets the value of the '{@link tp6.Researcher#getForName <em>For Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Name</em>' attribute.
	 * @see #getForName()
	 * @generated
	 */
	void setForName(String value);

	/**
	 * Returns the value of the '<em><b>Res papers</b></em>' reference list.
	 * The list contents are of type {@link tp6.Paper}.
	 * It is bidirectional and its opposite is '{@link tp6.Paper#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res papers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res papers</em>' reference list.
	 * @see tp6.Tp6Package#getResearcher_Res_papers()
	 * @see tp6.Paper#getAuthors
	 * @model type="tp6.Paper" opposite="authors"
	 * @generated
	 */
	EList getRes_papers();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.Skill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see tp6.Tp6Package#getResearcher_Skills()
	 * @model type="tp6.Skill" containment="true"
	 * @generated
	 */
	EList getSkills();

	/**
	 * Returns the value of the '<em><b>Res position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res position</em>' reference.
	 * @see #setRes_position(Position)
	 * @see tp6.Tp6Package#getResearcher_Res_position()
	 * @model
	 * @generated
	 */
	Position getRes_position();

	/**
	 * Sets the value of the '{@link tp6.Researcher#getRes_position <em>Res position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res position</em>' reference.
	 * @see #getRes_position()
	 * @generated
	 */
	void setRes_position(Position value);

	/**
	 * Returns the value of the '<em><b>Collaborations</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.Collaboration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaborations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborations</em>' containment reference list.
	 * @see tp6.Tp6Package#getResearcher_Collaborations()
	 * @model type="tp6.Collaboration" containment="true"
	 * @generated
	 */
	EList getCollaborations();

} // Researcher
