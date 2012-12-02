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

import tp6.Collaboration;
import tp6.Paper;
import tp6.Tp6Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp6.impl.CollaborationImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link tp6.impl.CollaborationImpl#getCol_paper <em>Col paper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationImpl extends EObjectImpl implements Collaboration {
	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final int RATIO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected int ratio = RATIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCol_paper() <em>Col paper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol_paper()
	 * @generated
	 * @ordered
	 */
	protected Paper col_paper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp6Package.Literals.COLLABORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRatio() {
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatio(int newRatio) {
		int oldRatio = ratio;
		ratio = newRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.COLLABORATION__RATIO, oldRatio, ratio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper getCol_paper() {
		if (col_paper != null && col_paper.eIsProxy()) {
			InternalEObject oldCol_paper = (InternalEObject)col_paper;
			col_paper = (Paper)eResolveProxy(oldCol_paper);
			if (col_paper != oldCol_paper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp6Package.COLLABORATION__COL_PAPER, oldCol_paper, col_paper));
			}
		}
		return col_paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper basicGetCol_paper() {
		return col_paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCol_paper(Paper newCol_paper) {
		Paper oldCol_paper = col_paper;
		col_paper = newCol_paper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.COLLABORATION__COL_PAPER, oldCol_paper, col_paper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Tp6Package.COLLABORATION__RATIO:
				return new Integer(getRatio());
			case Tp6Package.COLLABORATION__COL_PAPER:
				if (resolve) return getCol_paper();
				return basicGetCol_paper();
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
			case Tp6Package.COLLABORATION__RATIO:
				setRatio(((Integer)newValue).intValue());
				return;
			case Tp6Package.COLLABORATION__COL_PAPER:
				setCol_paper((Paper)newValue);
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
			case Tp6Package.COLLABORATION__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case Tp6Package.COLLABORATION__COL_PAPER:
				setCol_paper((Paper)null);
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
			case Tp6Package.COLLABORATION__RATIO:
				return ratio != RATIO_EDEFAULT;
			case Tp6Package.COLLABORATION__COL_PAPER:
				return col_paper != null;
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
		result.append(" (ratio: ");
		result.append(ratio);
		result.append(')');
		return result.toString();
	}

} //CollaborationImpl
