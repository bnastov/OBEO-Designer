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

import tp6.Collaboration;
import tp6.Paper;
import tp6.Position;
import tp6.Researcher;
import tp6.Skill;
import tp6.Tp6Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Researcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp6.impl.ResearcherImpl#getName <em>Name</em>}</li>
 *   <li>{@link tp6.impl.ResearcherImpl#getForName <em>For Name</em>}</li>
 *   <li>{@link tp6.impl.ResearcherImpl#getRes_papers <em>Res papers</em>}</li>
 *   <li>{@link tp6.impl.ResearcherImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link tp6.impl.ResearcherImpl#getRes_position <em>Res position</em>}</li>
 *   <li>{@link tp6.impl.ResearcherImpl#getCollaborations <em>Collaborations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResearcherImpl extends EObjectImpl implements Researcher {
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
	 * The default value of the '{@link #getForName() <em>For Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForName() <em>For Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForName()
	 * @generated
	 * @ordered
	 */
	protected String forName = FOR_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRes_papers() <em>Res papers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes_papers()
	 * @generated
	 * @ordered
	 */
	protected EList res_papers;

	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList skills;

	/**
	 * The cached value of the '{@link #getRes_position() <em>Res position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes_position()
	 * @generated
	 * @ordered
	 */
	protected Position res_position;

	/**
	 * The cached value of the '{@link #getCollaborations() <em>Collaborations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborations()
	 * @generated
	 * @ordered
	 */
	protected EList collaborations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResearcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp6Package.Literals.RESEARCHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.RESEARCHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForName() {
		return forName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForName(String newForName) {
		String oldForName = forName;
		forName = newForName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.RESEARCHER__FOR_NAME, oldForName, forName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRes_papers() {
		if (res_papers == null) {
			res_papers = new EObjectWithInverseResolvingEList.ManyInverse(Paper.class, this, Tp6Package.RESEARCHER__RES_PAPERS, Tp6Package.PAPER__AUTHORS);
		}
		return res_papers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSkills() {
		if (skills == null) {
			skills = new EObjectContainmentEList(Skill.class, this, Tp6Package.RESEARCHER__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getRes_position() {
		if (res_position != null && res_position.eIsProxy()) {
			InternalEObject oldRes_position = (InternalEObject)res_position;
			res_position = (Position)eResolveProxy(oldRes_position);
			if (res_position != oldRes_position) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Tp6Package.RESEARCHER__RES_POSITION, oldRes_position, res_position));
			}
		}
		return res_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetRes_position() {
		return res_position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes_position(Position newRes_position) {
		Position oldRes_position = res_position;
		res_position = newRes_position;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.RESEARCHER__RES_POSITION, oldRes_position, res_position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCollaborations() {
		if (collaborations == null) {
			collaborations = new EObjectContainmentEList(Collaboration.class, this, Tp6Package.RESEARCHER__COLLABORATIONS);
		}
		return collaborations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp6Package.RESEARCHER__RES_PAPERS:
				return ((InternalEList)getRes_papers()).basicAdd(otherEnd, msgs);
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
			case Tp6Package.RESEARCHER__RES_PAPERS:
				return ((InternalEList)getRes_papers()).basicRemove(otherEnd, msgs);
			case Tp6Package.RESEARCHER__SKILLS:
				return ((InternalEList)getSkills()).basicRemove(otherEnd, msgs);
			case Tp6Package.RESEARCHER__COLLABORATIONS:
				return ((InternalEList)getCollaborations()).basicRemove(otherEnd, msgs);
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
			case Tp6Package.RESEARCHER__NAME:
				return getName();
			case Tp6Package.RESEARCHER__FOR_NAME:
				return getForName();
			case Tp6Package.RESEARCHER__RES_PAPERS:
				return getRes_papers();
			case Tp6Package.RESEARCHER__SKILLS:
				return getSkills();
			case Tp6Package.RESEARCHER__RES_POSITION:
				if (resolve) return getRes_position();
				return basicGetRes_position();
			case Tp6Package.RESEARCHER__COLLABORATIONS:
				return getCollaborations();
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
			case Tp6Package.RESEARCHER__NAME:
				setName((String)newValue);
				return;
			case Tp6Package.RESEARCHER__FOR_NAME:
				setForName((String)newValue);
				return;
			case Tp6Package.RESEARCHER__RES_PAPERS:
				getRes_papers().clear();
				getRes_papers().addAll((Collection)newValue);
				return;
			case Tp6Package.RESEARCHER__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection)newValue);
				return;
			case Tp6Package.RESEARCHER__RES_POSITION:
				setRes_position((Position)newValue);
				return;
			case Tp6Package.RESEARCHER__COLLABORATIONS:
				getCollaborations().clear();
				getCollaborations().addAll((Collection)newValue);
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
			case Tp6Package.RESEARCHER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tp6Package.RESEARCHER__FOR_NAME:
				setForName(FOR_NAME_EDEFAULT);
				return;
			case Tp6Package.RESEARCHER__RES_PAPERS:
				getRes_papers().clear();
				return;
			case Tp6Package.RESEARCHER__SKILLS:
				getSkills().clear();
				return;
			case Tp6Package.RESEARCHER__RES_POSITION:
				setRes_position((Position)null);
				return;
			case Tp6Package.RESEARCHER__COLLABORATIONS:
				getCollaborations().clear();
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
			case Tp6Package.RESEARCHER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tp6Package.RESEARCHER__FOR_NAME:
				return FOR_NAME_EDEFAULT == null ? forName != null : !FOR_NAME_EDEFAULT.equals(forName);
			case Tp6Package.RESEARCHER__RES_PAPERS:
				return res_papers != null && !res_papers.isEmpty();
			case Tp6Package.RESEARCHER__SKILLS:
				return skills != null && !skills.isEmpty();
			case Tp6Package.RESEARCHER__RES_POSITION:
				return res_position != null;
			case Tp6Package.RESEARCHER__COLLABORATIONS:
				return collaborations != null && !collaborations.isEmpty();
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
		result.append(", forName: ");
		result.append(forName);
		result.append(')');
		return result.toString();
	}

} //ResearcherImpl
