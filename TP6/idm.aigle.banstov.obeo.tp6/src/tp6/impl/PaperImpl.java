/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp6.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tp6.Paper;
import tp6.PaperKeywords;
import tp6.Paragraph;
import tp6.Researcher;
import tp6.Tp6Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp6.impl.PaperImpl#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link tp6.impl.PaperImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link tp6.impl.PaperImpl#getCitedBy <em>Cited By</em>}</li>
 *   <li>{@link tp6.impl.PaperImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp6.impl.PaperImpl#getKeywords <em>Keywords</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaperImpl extends EObjectImpl implements Paper {
	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList paragraphs;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected EList authors;

	/**
	 * The cached value of the '{@link #getCitedBy() <em>Cited By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedBy()
	 * @generated
	 * @ordered
	 */
	protected Paper citedBy;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList keywords;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp6Package.Literals.PAPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList(Paragraph.class, this, Tp6Package.PAPER__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuthors() {
		if (authors == null) {
			authors = new EObjectWithInverseResolvingEList.ManyInverse(Researcher.class, this, Tp6Package.PAPER__AUTHORS, Tp6Package.RESEARCHER__RES_PAPERS);
		}
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper getCitedBy() {
		if (citedBy != null && citedBy.eIsProxy()) {
			InternalEObject oldCitedBy = (InternalEObject)citedBy;
			citedBy = (Paper)eResolveProxy(oldCitedBy);
			if (citedBy != oldCitedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp6Package.PAPER__CITED_BY, oldCitedBy, citedBy));
			}
		}
		return citedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper basicGetCitedBy() {
		return citedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitedBy(Paper newCitedBy) {
		Paper oldCitedBy = citedBy;
		citedBy = newCitedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.PAPER__CITED_BY, oldCitedBy, citedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.PAPER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKeywords() {
		if (keywords == null) {
			keywords = new EObjectContainmentEList(PaperKeywords.class, this, Tp6Package.PAPER__KEYWORDS);
		}
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp6Package.PAPER__AUTHORS:
				return ((InternalEList)getAuthors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp6Package.PAPER__PARAGRAPHS:
				return ((InternalEList)getParagraphs()).basicRemove(otherEnd, msgs);
			case Tp6Package.PAPER__AUTHORS:
				return ((InternalEList)getAuthors()).basicRemove(otherEnd, msgs);
			case Tp6Package.PAPER__KEYWORDS:
				return ((InternalEList)getKeywords()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp6Package.PAPER__PARAGRAPHS:
				return getParagraphs();
			case Tp6Package.PAPER__AUTHORS:
				return getAuthors();
			case Tp6Package.PAPER__CITED_BY:
				if (resolve) return getCitedBy();
				return basicGetCitedBy();
			case Tp6Package.PAPER__NAME:
				return getName();
			case Tp6Package.PAPER__KEYWORDS:
				return getKeywords();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Tp6Package.PAPER__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection)newValue);
				return;
			case Tp6Package.PAPER__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection)newValue);
				return;
			case Tp6Package.PAPER__CITED_BY:
				setCitedBy((Paper)newValue);
				return;
			case Tp6Package.PAPER__NAME:
				setName((String)newValue);
				return;
			case Tp6Package.PAPER__KEYWORDS:
				getKeywords().clear();
				getKeywords().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case Tp6Package.PAPER__PARAGRAPHS:
				getParagraphs().clear();
				return;
			case Tp6Package.PAPER__AUTHORS:
				getAuthors().clear();
				return;
			case Tp6Package.PAPER__CITED_BY:
				setCitedBy((Paper)null);
				return;
			case Tp6Package.PAPER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tp6Package.PAPER__KEYWORDS:
				getKeywords().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Tp6Package.PAPER__PARAGRAPHS:
				return paragraphs != null && !paragraphs.isEmpty();
			case Tp6Package.PAPER__AUTHORS:
				return authors != null && !authors.isEmpty();
			case Tp6Package.PAPER__CITED_BY:
				return citedBy != null;
			case Tp6Package.PAPER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tp6Package.PAPER__KEYWORDS:
				return keywords != null && !keywords.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PaperImpl
