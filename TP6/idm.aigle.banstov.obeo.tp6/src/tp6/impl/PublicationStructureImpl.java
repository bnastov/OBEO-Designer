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
import org.eclipse.emf.ecore.util.InternalEList;

import tp6.KnowledgeManager;
import tp6.Paper;
import tp6.Position;
import tp6.PublicationStructure;
import tp6.Researcher;
import tp6.Tp6Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tp6.impl.PublicationStructureImpl#getResearchers <em>Researchers</em>}</li>
 *   <li>{@link tp6.impl.PublicationStructureImpl#getPapers <em>Papers</em>}</li>
 *   <li>{@link tp6.impl.PublicationStructureImpl#getPositions <em>Positions</em>}</li>
 *   <li>{@link tp6.impl.PublicationStructureImpl#getKnowledgeMan <em>Knowledge Man</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicationStructureImpl extends EObjectImpl implements PublicationStructure {
	/**
	 * The cached value of the '{@link #getResearchers() <em>Researchers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResearchers()
	 * @generated
	 * @ordered
	 */
	protected EList researchers;

	/**
	 * The cached value of the '{@link #getPapers() <em>Papers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPapers()
	 * @generated
	 * @ordered
	 */
	protected EList papers;

	/**
	 * The cached value of the '{@link #getPositions() <em>Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositions()
	 * @generated
	 * @ordered
	 */
	protected EList positions;

	/**
	 * The cached value of the '{@link #getKnowledgeMan() <em>Knowledge Man</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnowledgeMan()
	 * @generated
	 * @ordered
	 */
	protected KnowledgeManager knowledgeMan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return Tp6Package.Literals.PUBLICATION_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getResearchers() {
		if (researchers == null) {
			researchers = new EObjectContainmentEList(Researcher.class, this, Tp6Package.PUBLICATION_STRUCTURE__RESEARCHERS);
		}
		return researchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPapers() {
		if (papers == null) {
			papers = new EObjectContainmentEList(Paper.class, this, Tp6Package.PUBLICATION_STRUCTURE__PAPERS);
		}
		return papers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPositions() {
		if (positions == null) {
			positions = new EObjectContainmentEList(Position.class, this, Tp6Package.PUBLICATION_STRUCTURE__POSITIONS);
		}
		return positions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeManager getKnowledgeMan() {
		return knowledgeMan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnowledgeMan(KnowledgeManager newKnowledgeMan, NotificationChain msgs) {
		KnowledgeManager oldKnowledgeMan = knowledgeMan;
		knowledgeMan = newKnowledgeMan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN, oldKnowledgeMan, newKnowledgeMan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledgeMan(KnowledgeManager newKnowledgeMan) {
		if (newKnowledgeMan != knowledgeMan) {
			NotificationChain msgs = null;
			if (knowledgeMan != null)
				msgs = ((InternalEObject)knowledgeMan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN, null, msgs);
			if (newKnowledgeMan != null)
				msgs = ((InternalEObject)newKnowledgeMan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN, null, msgs);
			msgs = basicSetKnowledgeMan(newKnowledgeMan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN, newKnowledgeMan, newKnowledgeMan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tp6Package.PUBLICATION_STRUCTURE__RESEARCHERS:
				return ((InternalEList)getResearchers()).basicRemove(otherEnd, msgs);
			case Tp6Package.PUBLICATION_STRUCTURE__PAPERS:
				return ((InternalEList)getPapers()).basicRemove(otherEnd, msgs);
			case Tp6Package.PUBLICATION_STRUCTURE__POSITIONS:
				return ((InternalEList)getPositions()).basicRemove(otherEnd, msgs);
			case Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN:
				return basicSetKnowledgeMan(null, msgs);
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
			case Tp6Package.PUBLICATION_STRUCTURE__RESEARCHERS:
				return getResearchers();
			case Tp6Package.PUBLICATION_STRUCTURE__PAPERS:
				return getPapers();
			case Tp6Package.PUBLICATION_STRUCTURE__POSITIONS:
				return getPositions();
			case Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN:
				return getKnowledgeMan();
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
			case Tp6Package.PUBLICATION_STRUCTURE__RESEARCHERS:
				getResearchers().clear();
				getResearchers().addAll((Collection)newValue);
				return;
			case Tp6Package.PUBLICATION_STRUCTURE__PAPERS:
				getPapers().clear();
				getPapers().addAll((Collection)newValue);
				return;
			case Tp6Package.PUBLICATION_STRUCTURE__POSITIONS:
				getPositions().clear();
				getPositions().addAll((Collection)newValue);
				return;
			case Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN:
				setKnowledgeMan((KnowledgeManager)newValue);
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
			case Tp6Package.PUBLICATION_STRUCTURE__RESEARCHERS:
				getResearchers().clear();
				return;
			case Tp6Package.PUBLICATION_STRUCTURE__PAPERS:
				getPapers().clear();
				return;
			case Tp6Package.PUBLICATION_STRUCTURE__POSITIONS:
				getPositions().clear();
				return;
			case Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN:
				setKnowledgeMan((KnowledgeManager)null);
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
			case Tp6Package.PUBLICATION_STRUCTURE__RESEARCHERS:
				return researchers != null && !researchers.isEmpty();
			case Tp6Package.PUBLICATION_STRUCTURE__PAPERS:
				return papers != null && !papers.isEmpty();
			case Tp6Package.PUBLICATION_STRUCTURE__POSITIONS:
				return positions != null && !positions.isEmpty();
			case Tp6Package.PUBLICATION_STRUCTURE__KNOWLEDGE_MAN:
				return knowledgeMan != null;
		}
		return super.eIsSet(featureID);
	}

} //PublicationStructureImpl
