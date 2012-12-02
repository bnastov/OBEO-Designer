/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp6.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import tp6.Keyword;
import tp6.PaperKeywords;
import tp6.Tp6Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paper Keywords</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp6.impl.PaperKeywordsImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link tp6.impl.PaperKeywordsImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaperKeywordsImpl extends EObjectImpl implements PaperKeywords {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected Keyword keyword;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaperKeywordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp6Package.Literals.PAPER_KEYWORDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.PAPER_KEYWORDS__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword getKeyword() {
		if (keyword != null && keyword.eIsProxy()) {
			InternalEObject oldKeyword = (InternalEObject)keyword;
			keyword = (Keyword)eResolveProxy(oldKeyword);
			if (keyword != oldKeyword) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp6Package.PAPER_KEYWORDS__KEYWORD, oldKeyword, keyword));
			}
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword basicGetKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(Keyword newKeyword) {
		Keyword oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.PAPER_KEYWORDS__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp6Package.PAPER_KEYWORDS__WEIGHT:
				return new Integer(getWeight());
			case Tp6Package.PAPER_KEYWORDS__KEYWORD:
				if (resolve) return getKeyword();
				return basicGetKeyword();
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
			case Tp6Package.PAPER_KEYWORDS__WEIGHT:
				setWeight(((Integer)newValue).intValue());
				return;
			case Tp6Package.PAPER_KEYWORDS__KEYWORD:
				setKeyword((Keyword)newValue);
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
			case Tp6Package.PAPER_KEYWORDS__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case Tp6Package.PAPER_KEYWORDS__KEYWORD:
				setKeyword((Keyword)null);
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
			case Tp6Package.PAPER_KEYWORDS__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case Tp6Package.PAPER_KEYWORDS__KEYWORD:
				return keyword != null;
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //PaperKeywordsImpl
