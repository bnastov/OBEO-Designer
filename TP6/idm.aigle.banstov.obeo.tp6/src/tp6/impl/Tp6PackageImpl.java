/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp6.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tp6.Collaboration;
import tp6.Keyword;
import tp6.KnowledgeManager;
import tp6.Paper;
import tp6.PaperKeywords;
import tp6.Paragraph;
import tp6.Position;
import tp6.PublicationStructure;
import tp6.Researcher;
import tp6.Skill;
import tp6.Tp6Factory;
import tp6.Tp6Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tp6PackageImpl extends EPackageImpl implements Tp6Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass researcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicationStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paperKeywordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeManagerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tp6.Tp6Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tp6PackageImpl() {
		super(eNS_URI, Tp6Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Tp6Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tp6Package init() {
		if (isInited) return (Tp6Package)EPackage.Registry.INSTANCE.getEPackage(Tp6Package.eNS_URI);

		// Obtain or create and register package
		Tp6PackageImpl theTp6Package = (Tp6PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Tp6PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Tp6PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTp6Package.createPackageContents();

		// Initialize created meta-data
		theTp6Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTp6Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tp6Package.eNS_URI, theTp6Package);
		return theTp6Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResearcher() {
		return researcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResearcher_Name() {
		return (EAttribute)researcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResearcher_ForName() {
		return (EAttribute)researcherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearcher_Res_papers() {
		return (EReference)researcherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearcher_Skills() {
		return (EReference)researcherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearcher_Res_position() {
		return (EReference)researcherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResearcher_Collaborations() {
		return (EReference)researcherEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaper() {
		return paperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_Paragraphs() {
		return (EReference)paperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_Authors() {
		return (EReference)paperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_CitedBy() {
		return (EReference)paperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaper_Name() {
		return (EAttribute)paperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaper_Keywords() {
		return (EReference)paperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Name() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Id() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Content() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicationStructure() {
		return publicationStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationStructure_Researchers() {
		return (EReference)publicationStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationStructure_Papers() {
		return (EReference)publicationStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationStructure_Positions() {
		return (EReference)publicationStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicationStructure_KnowledgeMan() {
		return (EReference)publicationStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkill() {
		return skillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkill_Description() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Name() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Description() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_Parent() {
		return (EReference)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollaboration_Ratio() {
		return (EAttribute)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_Col_paper() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyword() {
		return keywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyword_Key() {
		return (EAttribute)keywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyword_Description() {
		return (EAttribute)keywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyword_KPapers() {
		return (EReference)keywordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaperKeywords() {
		return paperKeywordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaperKeywords_Weight() {
		return (EAttribute)paperKeywordsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaperKeywords_Keyword() {
		return (EReference)paperKeywordsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeManager() {
		return knowledgeManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeManager_AllKeywords() {
		return (EReference)knowledgeManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKnowledgeManager_Name() {
		return (EAttribute)knowledgeManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tp6Factory getTp6Factory() {
		return (Tp6Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		researcherEClass = createEClass(RESEARCHER);
		createEAttribute(researcherEClass, RESEARCHER__NAME);
		createEAttribute(researcherEClass, RESEARCHER__FOR_NAME);
		createEReference(researcherEClass, RESEARCHER__RES_PAPERS);
		createEReference(researcherEClass, RESEARCHER__SKILLS);
		createEReference(researcherEClass, RESEARCHER__RES_POSITION);
		createEReference(researcherEClass, RESEARCHER__COLLABORATIONS);

		paperEClass = createEClass(PAPER);
		createEReference(paperEClass, PAPER__PARAGRAPHS);
		createEReference(paperEClass, PAPER__AUTHORS);
		createEReference(paperEClass, PAPER__CITED_BY);
		createEAttribute(paperEClass, PAPER__NAME);
		createEReference(paperEClass, PAPER__KEYWORDS);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__NAME);
		createEAttribute(paragraphEClass, PARAGRAPH__ID);
		createEAttribute(paragraphEClass, PARAGRAPH__CONTENT);

		publicationStructureEClass = createEClass(PUBLICATION_STRUCTURE);
		createEReference(publicationStructureEClass, PUBLICATION_STRUCTURE__RESEARCHERS);
		createEReference(publicationStructureEClass, PUBLICATION_STRUCTURE__PAPERS);
		createEReference(publicationStructureEClass, PUBLICATION_STRUCTURE__POSITIONS);
		createEReference(publicationStructureEClass, PUBLICATION_STRUCTURE__KNOWLEDGE_MAN);

		skillEClass = createEClass(SKILL);
		createEAttribute(skillEClass, SKILL__DESCRIPTION);

		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__NAME);
		createEAttribute(positionEClass, POSITION__DESCRIPTION);
		createEReference(positionEClass, POSITION__PARENT);

		collaborationEClass = createEClass(COLLABORATION);
		createEAttribute(collaborationEClass, COLLABORATION__RATIO);
		createEReference(collaborationEClass, COLLABORATION__COL_PAPER);

		keywordEClass = createEClass(KEYWORD);
		createEAttribute(keywordEClass, KEYWORD__KEY);
		createEAttribute(keywordEClass, KEYWORD__DESCRIPTION);
		createEReference(keywordEClass, KEYWORD__KPAPERS);

		paperKeywordsEClass = createEClass(PAPER_KEYWORDS);
		createEAttribute(paperKeywordsEClass, PAPER_KEYWORDS__WEIGHT);
		createEReference(paperKeywordsEClass, PAPER_KEYWORDS__KEYWORD);

		knowledgeManagerEClass = createEClass(KNOWLEDGE_MANAGER);
		createEReference(knowledgeManagerEClass, KNOWLEDGE_MANAGER__ALL_KEYWORDS);
		createEAttribute(knowledgeManagerEClass, KNOWLEDGE_MANAGER__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(researcherEClass, Researcher.class, "Researcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResearcher_Name(), ecorePackage.getEString(), "name", null, 0, 1, Researcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResearcher_ForName(), ecorePackage.getEString(), "forName", null, 0, 1, Researcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearcher_Res_papers(), this.getPaper(), this.getPaper_Authors(), "res_papers", null, 0, -1, Researcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearcher_Skills(), this.getSkill(), null, "skills", null, 0, -1, Researcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearcher_Res_position(), this.getPosition(), null, "res_position", null, 0, 1, Researcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResearcher_Collaborations(), this.getCollaboration(), null, "collaborations", null, 0, -1, Researcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paperEClass, Paper.class, "Paper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaper_Paragraphs(), this.getParagraph(), null, "paragraphs", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_Authors(), this.getResearcher(), this.getResearcher_Res_papers(), "authors", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_CitedBy(), this.getPaper(), null, "citedBy", null, 0, 1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaper_Name(), ecorePackage.getEString(), "name", null, 0, 1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaper_Keywords(), this.getPaperKeywords(), null, "keywords", null, 0, -1, Paper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Content(), ecorePackage.getEString(), "content", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicationStructureEClass, PublicationStructure.class, "PublicationStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicationStructure_Researchers(), this.getResearcher(), null, "researchers", null, 0, -1, PublicationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicationStructure_Papers(), this.getPaper(), null, "papers", null, 0, -1, PublicationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicationStructure_Positions(), this.getPosition(), null, "positions", null, 0, -1, PublicationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicationStructure_KnowledgeMan(), this.getKnowledgeManager(), null, "knowledgeMan", null, 0, 1, PublicationStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkill_Description(), ecorePackage.getEString(), "description", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Description(), ecorePackage.getEString(), "description", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPosition_Parent(), this.getPosition(), null, "parent", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollaboration_Ratio(), ecorePackage.getEInt(), "ratio", null, 0, 1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollaboration_Col_paper(), this.getPaper(), null, "col_paper", null, 0, 1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordEClass, Keyword.class, "Keyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyword_Key(), ecorePackage.getEString(), "key", null, 0, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyword_Description(), ecorePackage.getEString(), "description", null, 0, 1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyword_KPapers(), this.getPaper(), null, "kPapers", null, 0, -1, Keyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paperKeywordsEClass, PaperKeywords.class, "PaperKeywords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaperKeywords_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, PaperKeywords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaperKeywords_Keyword(), this.getKeyword(), null, "keyword", null, 0, 1, PaperKeywords.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeManagerEClass, KnowledgeManager.class, "KnowledgeManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeManager_AllKeywords(), this.getKeyword(), null, "allKeywords", null, 0, -1, KnowledgeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKnowledgeManager_Name(), ecorePackage.getEString(), "name", null, 0, 1, KnowledgeManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// diastyle.node.dashedred
		createDiastyleAnnotations();
		// diastyle.node.green
		createDiastyle_1Annotations();
		// diastyle.edge.blue
		createDiastyle_2Annotations();
		// diastyle.edge.foobar
		createDiastyle_3Annotations();
		// diastyle.node.dashedblue
		createDiastyle_4Annotations();
		// diastyle.edge.yellow
		createDiastyle_5Annotations();
		// diastyle.edge.blue23
		createDiastyle_6Annotations();
		// diastyle.node.bluenode
		createDiastyle_7Annotations();
		// diastyle.edge.yellow3
		createDiastyle_8Annotations();
		// diastyle.edge.e1
		createDiastyle_9Annotations();
		// diastyle.node.blue22
		createDiastyle_10Annotations();
		// diastyle.node.yellownode
		createDiastyle_11Annotations();
		// diastyle.edge.lightgray
		createDiastyle_12Annotations();
		// diastyle.partition.bluecompartment
		createDiastyle_13Annotations();
		// diastyle.partition.lightgray
		createDiastyle_14Annotations();
		// diastyle.partition.yellow2
		createDiastyle_15Annotations();
		// diastyle.partition.blue2
		createDiastyle_16Annotations();
		// diastyle.edge.black
		createDiastyle_17Annotations();
		// diastyle.node.green2
		createDiastyle_18Annotations();
		// diastyle.edge.green33
		createDiastyle_19Annotations();
		// diagraph
		createDiagraphAnnotations();
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.dashedred</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyleAnnotations() {
		String source = "diastyle.node.dashedred";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=red", null,
			 "line=dash", null,
			 "font=courier", null,
			 "fontstyle=italic", null,
			 "fontcolor=green", null,
			 "fontsize=20", null,
			 "align=center", null,
			 "layout=free", null,
			 "size=100,100", null
		   });																													
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.green</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_1Annotations() {
		String source = "diastyle.node.green";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=dashedred", null,
			 "background=green", null,
			 "shape = rounded", null,
			 "size=150,150", null,
			 "layout=free", null
		   });																												
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.blue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_2Annotations() {
		String source = "diastyle.edge.blue";				
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=darkblue", null,
			 "arrowsize=4", null,
			 "direction=right", null
		   });																											
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.foobar</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_3Annotations() {
		String source = "diastyle.edge.foobar";					
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=blue", null,
			 "arrowsize=40", null
		   });																										
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.dashedblue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_4Annotations() {
		String source = "diastyle.node.dashedblue";						
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=blue", null,
			 "parent=dashedred", null
		   });																									
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.yellow</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_5Annotations() {
		String source = "diastyle.edge.yellow";							
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=e1", null,
			 "background=yellow", null
		   });																								
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.blue23</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_6Annotations() {
		String source = "diastyle.edge.blue23";								
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=blue", null,
			 "background=lightblue", null
		   });																							
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.bluenode</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_7Annotations() {
		String source = "diastyle.node.bluenode";									
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=green", null,
			 "background=lightblue", null,
			 "figure=bluediamond", null
		   });																						
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.yellow3</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_8Annotations() {
		String source = "diastyle.edge.yellow3";										
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=green3", null,
			 "background=yellow", null,
			 "arrowsize=5", null
		   });																					
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.e1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_9Annotations() {
		String source = "diastyle.edge.e1";											
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=black", null,
			 "arrowsize=5", null
		   });																				
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.blue22</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_10Annotations() {
		String source = "diastyle.node.blue22";												
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=green", null,
			 "background=lightblue", null
		   });																			
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.yellownode</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_11Annotations() {
		String source = "diastyle.node.yellownode";													
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=dashedred", null,
			 "background=yellow", null
		   });																		
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.lightgray</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_12Annotations() {
		String source = "diastyle.edge.lightgray";														
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=lightgray", null
		   });																	
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.bluecompartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_13Annotations() {
		String source = "diastyle.partition.bluecompartment";															
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=blue", null
		   });																
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.lightgray</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_14Annotations() {
		String source = "diastyle.partition.lightgray";																
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });															
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.yellow2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_15Annotations() {
		String source = "diastyle.partition.yellow2";																	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=yellow", null
		   });														
	}

	/**
	 * Initializes the annotations for <b>diastyle.partition.blue2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_16Annotations() {
		String source = "diastyle.partition.blue2";																		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=lightblue", null
		   });													
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.black</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_17Annotations() {
		String source = "diastyle.edge.black";																			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "background=black", null
		   });												
	}

	/**
	 * Initializes the annotations for <b>diastyle.node.green2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_18Annotations() {
		String source = "diastyle.node.green2";																				
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=green", null
		   });											
	}

	/**
	 * Initializes the annotations for <b>diastyle.edge.green33</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiastyle_19Annotations() {
		String source = "diastyle.edge.green33";																					
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "parent=green3", null
		   });										
	}

	/**
	 * Initializes the annotations for <b>diagraph</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDiagraphAnnotations() {
		String source = "diagraph";																						
		addAnnotation
		  (researcherEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "label=name", "",
			 "label=forName", null,
			 "lnk=collaborations", null,
			 "ref=res_position", null,
			 "cref=skills", null,
			 "style=green", null,
			 "style.ref.res_position=e1", null
		   });		
		addAnnotation
		  (paperEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "label=name", null,
			 "kref=paragraphs", "",
			 "lnk=keywords", null,
			 "style=bluenode", null,
			 "style.kref.paragraphs=lightgray", null
		   });		
		addAnnotation
		  (paragraphEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "style=blue22", null,
			 "cont=Paper.paragraphs", "",
			 "label=name", null
		   });		
		addAnnotation
		  (publicationStructureEClass, 
		   source, 
		   new String[] {
			 "pov", null
		   });		
		addAnnotation
		  (skillEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=description", null
		   });		
		addAnnotation
		  (positionEClass, 
		   source, 
		   new String[] {
			 "node", null,
			 "label=description", null
		   });		
		addAnnotation
		  (collaborationEClass, 
		   source, 
		   new String[] {
			 "label=ratio", ""
		   });		
		addAnnotation
		  (keywordEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "label=key", ""
		   });		
		addAnnotation
		  (paperKeywordsEClass, 
		   source, 
		   new String[] {
			 "label=weight", ""
		   });		
		addAnnotation
		  (knowledgeManagerEClass, 
		   source, 
		   new String[] {
			 "node", "",
			 "label=name", "",
			 "kref=allKeywords", ""
		   });
	}

} //Tp6PackageImpl
