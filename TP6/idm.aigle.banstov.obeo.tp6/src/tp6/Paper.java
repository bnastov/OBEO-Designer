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
 * A representation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tp6.Paper#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link tp6.Paper#getAuthors <em>Authors</em>}</li>
 *   <li>{@link tp6.Paper#getCitedBy <em>Cited By</em>}</li>
 *   <li>{@link tp6.Paper#getName <em>Name</em>}</li>
 *   <li>{@link tp6.Paper#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 *
 * @see tp6.Tp6Package#getPaper()
 * @model annotation="diagraph node='' label\075name='null' kref\075paragraphs='' lnk\075keywords='null' style\075bluenode='null' style.kref.paragraphs\075lightgray='null'"
 * @generated
 */
public interface Paper extends EObject {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see tp6.Tp6Package#getPaper_Paragraphs()
	 * @model type="tp6.Paragraph" containment="true"
	 * @generated
	 */
	EList getParagraphs();

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' reference list.
	 * The list contents are of type {@link tp6.Researcher}.
	 * It is bidirectional and its opposite is '{@link tp6.Researcher#getRes_papers <em>Res papers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' reference list.
	 * @see tp6.Tp6Package#getPaper_Authors()
	 * @see tp6.Researcher#getRes_papers
	 * @model type="tp6.Researcher" opposite="res_papers"
	 * @generated
	 */
	EList getAuthors();

	/**
	 * Returns the value of the '<em><b>Cited By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited By</em>' reference.
	 * @see #setCitedBy(Paper)
	 * @see tp6.Tp6Package#getPaper_CitedBy()
	 * @model
	 * @generated
	 */
	Paper getCitedBy();

	/**
	 * Sets the value of the '{@link tp6.Paper#getCitedBy <em>Cited By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited By</em>' reference.
	 * @see #getCitedBy()
	 * @generated
	 */
	void setCitedBy(Paper value);

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
	 * @see tp6.Tp6Package#getPaper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tp6.Paper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference list.
	 * The list contents are of type {@link tp6.PaperKeywords}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference list.
	 * @see tp6.Tp6Package#getPaper_Keywords()
	 * @model type="tp6.PaperKeywords" containment="true"
	 * @generated
	 */
	EList getKeywords();

} // Paper
