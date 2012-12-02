/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp6.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tp6.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tp6FactoryImpl extends EFactoryImpl implements Tp6Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tp6Factory init() {
		try {
			Tp6Factory theTp6Factory = (Tp6Factory)EPackage.Registry.INSTANCE.getEFactory("http://aigle-tp6.v0"); 
			if (theTp6Factory != null) {
				return theTp6Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tp6FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp6FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Tp6Package.RESEARCHER: return createResearcher();
			case Tp6Package.PAPER: return createPaper();
			case Tp6Package.PARAGRAPH: return createParagraph();
			case Tp6Package.PUBLICATION_STRUCTURE: return createPublicationStructure();
			case Tp6Package.SKILL: return createSkill();
			case Tp6Package.POSITION: return createPosition();
			case Tp6Package.COLLABORATION: return createCollaboration();
			case Tp6Package.KEYWORD: return createKeyword();
			case Tp6Package.PAPER_KEYWORDS: return createPaperKeywords();
			case Tp6Package.KNOWLEDGE_MANAGER: return createKnowledgeManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Researcher createResearcher() {
		ResearcherImpl researcher = new ResearcherImpl();
		return researcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paper createPaper() {
		PaperImpl paper = new PaperImpl();
		return paper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraph createParagraph() {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationStructure createPublicationStructure() {
		PublicationStructureImpl publicationStructure = new PublicationStructureImpl();
		return publicationStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill createSkill() {
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collaboration createCollaboration() {
		CollaborationImpl collaboration = new CollaborationImpl();
		return collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword createKeyword() {
		KeywordImpl keyword = new KeywordImpl();
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaperKeywords createPaperKeywords() {
		PaperKeywordsImpl paperKeywords = new PaperKeywordsImpl();
		return paperKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeManager createKnowledgeManager() {
		KnowledgeManagerImpl knowledgeManager = new KnowledgeManagerImpl();
		return knowledgeManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp6Package getTp6Package() {
		return (Tp6Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static Tp6Package getPackage() {
		return Tp6Package.eINSTANCE;
	}

} //Tp6FactoryImpl
