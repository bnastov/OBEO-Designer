/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package tp6;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tp6.Tp6Factory
 * @model kind="package"
 *        annotation="diastyle.node.dashedred background\075red='null' line\075dash='null' font\075courier='null' fontstyle\075italic='null' fontcolor\075green='null' fontsize\07520='null' align\075center='null' layout\075free='null' size\075100,100='null'"
 *        annotation="diastyle.node.green parent\075dashedred='null' background\075green='null' shape\040\075\040rounded='null' size\075150,150='null' layout\075free='null'"
 *        annotation="diastyle.edge.blue background\075darkblue='null' arrowsize\0754='null' direction\075right='null'"
 *        annotation="diastyle.edge.foobar parent\075blue='null' arrowsize\07540='null'"
 *        annotation="diastyle.node.dashedblue background\075blue='null' parent\075dashedred='null'"
 *        annotation="diastyle.edge.yellow parent\075e1='null' background\075yellow='null'"
 *        annotation="diastyle.edge.blue23 parent\075blue='null' background\075lightblue='null'"
 *        annotation="diastyle.node.bluenode parent\075green='null' background\075lightblue='null' figure\075bluediamond='null'"
 *        annotation="diastyle.edge.yellow3 parent\075green3='null' background\075yellow='null' arrowsize\0755='null'"
 *        annotation="diastyle.edge.e1 background\075black='null' arrowsize\0755='null'"
 *        annotation="diastyle.node.blue22 parent\075green='null' background\075lightblue='null'"
 *        annotation="diastyle.node.yellownode parent\075dashedred='null' background\075yellow='null'"
 *        annotation="diastyle.edge.lightgray background\075lightgray='null'"
 *        annotation="diastyle.partition.bluecompartment background\075blue='null'"
 *        annotation="diastyle.partition.yellow2 background\075yellow='null'"
 *        annotation="diastyle.partition.blue2 background\075lightblue='null'"
 *        annotation="diastyle.edge.black background\075black='null'"
 *        annotation="diastyle.node.green2 parent\075green='null'"
 *        annotation="diastyle.edge.green33 parent\075green3='null'"
 * @generated
 */
public interface Tp6Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tp6";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://aigle-tp6.v0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tp6";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tp6Package eINSTANCE = tp6.impl.Tp6PackageImpl.init();

	/**
	 * The meta object id for the '{@link tp6.impl.ResearcherImpl <em>Researcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.ResearcherImpl
	 * @see tp6.impl.Tp6PackageImpl#getResearcher()
	 * @generated
	 */
	int RESEARCHER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCHER__NAME = 0;

	/**
	 * The feature id for the '<em><b>For Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCHER__FOR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Res papers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCHER__RES_PAPERS = 2;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCHER__SKILLS = 3;

	/**
	 * The feature id for the '<em><b>Res position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCHER__RES_POSITION = 4;

	/**
	 * The feature id for the '<em><b>Collaborations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCHER__COLLABORATIONS = 5;

	/**
	 * The number of structural features of the '<em>Researcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESEARCHER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link tp6.impl.PaperImpl <em>Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.PaperImpl
	 * @see tp6.impl.Tp6PackageImpl#getPaper()
	 * @generated
	 */
	int PAPER = 1;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__PARAGRAPHS = 0;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__AUTHORS = 1;

	/**
	 * The feature id for the '<em><b>Cited By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__CITED_BY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER__KEYWORDS = 4;

	/**
	 * The number of structural features of the '<em>Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link tp6.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.ParagraphImpl
	 * @see tp6.impl.Tp6PackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ID = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tp6.impl.PublicationStructureImpl <em>Publication Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.PublicationStructureImpl
	 * @see tp6.impl.Tp6PackageImpl#getPublicationStructure()
	 * @generated
	 */
	int PUBLICATION_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Researchers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_STRUCTURE__RESEARCHERS = 0;

	/**
	 * The feature id for the '<em><b>Papers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_STRUCTURE__PAPERS = 1;

	/**
	 * The feature id for the '<em><b>Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_STRUCTURE__POSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Knowledge Man</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_STRUCTURE__KNOWLEDGE_MAN = 3;

	/**
	 * The number of structural features of the '<em>Publication Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICATION_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link tp6.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.SkillImpl
	 * @see tp6.impl.Tp6PackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link tp6.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.PositionImpl
	 * @see tp6.impl.Tp6PackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tp6.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.CollaborationImpl
	 * @see tp6.impl.Tp6PackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 6;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__RATIO = 0;

	/**
	 * The feature id for the '<em><b>Col paper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__COL_PAPER = 1;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link tp6.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.KeywordImpl
	 * @see tp6.impl.Tp6PackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__KEY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>KPapers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD__KPAPERS = 2;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link tp6.impl.PaperKeywordsImpl <em>Paper Keywords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.PaperKeywordsImpl
	 * @see tp6.impl.Tp6PackageImpl#getPaperKeywords()
	 * @generated
	 */
	int PAPER_KEYWORDS = 8;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_KEYWORDS__WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_KEYWORDS__KEYWORD = 1;

	/**
	 * The number of structural features of the '<em>Paper Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPER_KEYWORDS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link tp6.impl.KnowledgeManagerImpl <em>Knowledge Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tp6.impl.KnowledgeManagerImpl
	 * @see tp6.impl.Tp6PackageImpl#getKnowledgeManager()
	 * @generated
	 */
	int KNOWLEDGE_MANAGER = 9;

	/**
	 * The feature id for the '<em><b>All Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_MANAGER__ALL_KEYWORDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_MANAGER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Knowledge Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_MANAGER_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link tp6.Researcher <em>Researcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Researcher</em>'.
	 * @see tp6.Researcher
	 * @generated
	 */
	EClass getResearcher();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Researcher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp6.Researcher#getName()
	 * @see #getResearcher()
	 * @generated
	 */
	EAttribute getResearcher_Name();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Researcher#getForName <em>For Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Name</em>'.
	 * @see tp6.Researcher#getForName()
	 * @see #getResearcher()
	 * @generated
	 */
	EAttribute getResearcher_ForName();

	/**
	 * Returns the meta object for the reference list '{@link tp6.Researcher#getRes_papers <em>Res papers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Res papers</em>'.
	 * @see tp6.Researcher#getRes_papers()
	 * @see #getResearcher()
	 * @generated
	 */
	EReference getResearcher_Res_papers();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.Researcher#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see tp6.Researcher#getSkills()
	 * @see #getResearcher()
	 * @generated
	 */
	EReference getResearcher_Skills();

	/**
	 * Returns the meta object for the reference '{@link tp6.Researcher#getRes_position <em>Res position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Res position</em>'.
	 * @see tp6.Researcher#getRes_position()
	 * @see #getResearcher()
	 * @generated
	 */
	EReference getResearcher_Res_position();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.Researcher#getCollaborations <em>Collaborations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collaborations</em>'.
	 * @see tp6.Researcher#getCollaborations()
	 * @see #getResearcher()
	 * @generated
	 */
	EReference getResearcher_Collaborations();

	/**
	 * Returns the meta object for class '{@link tp6.Paper <em>Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paper</em>'.
	 * @see tp6.Paper
	 * @generated
	 */
	EClass getPaper();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.Paper#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see tp6.Paper#getParagraphs()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Paragraphs();

	/**
	 * Returns the meta object for the reference list '{@link tp6.Paper#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authors</em>'.
	 * @see tp6.Paper#getAuthors()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Authors();

	/**
	 * Returns the meta object for the reference '{@link tp6.Paper#getCitedBy <em>Cited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cited By</em>'.
	 * @see tp6.Paper#getCitedBy()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_CitedBy();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Paper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp6.Paper#getName()
	 * @see #getPaper()
	 * @generated
	 */
	EAttribute getPaper_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.Paper#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywords</em>'.
	 * @see tp6.Paper#getKeywords()
	 * @see #getPaper()
	 * @generated
	 */
	EReference getPaper_Keywords();

	/**
	 * Returns the meta object for class '{@link tp6.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see tp6.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Paragraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp6.Paragraph#getName()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Name();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Paragraph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tp6.Paragraph#getId()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Id();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Paragraph#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see tp6.Paragraph#getContent()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Content();

	/**
	 * Returns the meta object for class '{@link tp6.PublicationStructure <em>Publication Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publication Structure</em>'.
	 * @see tp6.PublicationStructure
	 * @generated
	 */
	EClass getPublicationStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.PublicationStructure#getResearchers <em>Researchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Researchers</em>'.
	 * @see tp6.PublicationStructure#getResearchers()
	 * @see #getPublicationStructure()
	 * @generated
	 */
	EReference getPublicationStructure_Researchers();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.PublicationStructure#getPapers <em>Papers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Papers</em>'.
	 * @see tp6.PublicationStructure#getPapers()
	 * @see #getPublicationStructure()
	 * @generated
	 */
	EReference getPublicationStructure_Papers();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.PublicationStructure#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Positions</em>'.
	 * @see tp6.PublicationStructure#getPositions()
	 * @see #getPublicationStructure()
	 * @generated
	 */
	EReference getPublicationStructure_Positions();

	/**
	 * Returns the meta object for the containment reference '{@link tp6.PublicationStructure#getKnowledgeMan <em>Knowledge Man</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knowledge Man</em>'.
	 * @see tp6.PublicationStructure#getKnowledgeMan()
	 * @see #getPublicationStructure()
	 * @generated
	 */
	EReference getPublicationStructure_KnowledgeMan();

	/**
	 * Returns the meta object for class '{@link tp6.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see tp6.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Skill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tp6.Skill#getDescription()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Description();

	/**
	 * Returns the meta object for class '{@link tp6.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see tp6.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Position#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp6.Position#getName()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Name();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Position#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tp6.Position#getDescription()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Description();

	/**
	 * Returns the meta object for the reference '{@link tp6.Position#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see tp6.Position#getParent()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Parent();

	/**
	 * Returns the meta object for class '{@link tp6.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see tp6.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Collaboration#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see tp6.Collaboration#getRatio()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_Ratio();

	/**
	 * Returns the meta object for the reference '{@link tp6.Collaboration#getCol_paper <em>Col paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Col paper</em>'.
	 * @see tp6.Collaboration#getCol_paper()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Col_paper();

	/**
	 * Returns the meta object for class '{@link tp6.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see tp6.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Keyword#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see tp6.Keyword#getKey()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Key();

	/**
	 * Returns the meta object for the attribute '{@link tp6.Keyword#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tp6.Keyword#getDescription()
	 * @see #getKeyword()
	 * @generated
	 */
	EAttribute getKeyword_Description();

	/**
	 * Returns the meta object for the reference list '{@link tp6.Keyword#getKPapers <em>KPapers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>KPapers</em>'.
	 * @see tp6.Keyword#getKPapers()
	 * @see #getKeyword()
	 * @generated
	 */
	EReference getKeyword_KPapers();

	/**
	 * Returns the meta object for class '{@link tp6.PaperKeywords <em>Paper Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paper Keywords</em>'.
	 * @see tp6.PaperKeywords
	 * @generated
	 */
	EClass getPaperKeywords();

	/**
	 * Returns the meta object for the attribute '{@link tp6.PaperKeywords#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see tp6.PaperKeywords#getWeight()
	 * @see #getPaperKeywords()
	 * @generated
	 */
	EAttribute getPaperKeywords_Weight();

	/**
	 * Returns the meta object for the reference '{@link tp6.PaperKeywords#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keyword</em>'.
	 * @see tp6.PaperKeywords#getKeyword()
	 * @see #getPaperKeywords()
	 * @generated
	 */
	EReference getPaperKeywords_Keyword();

	/**
	 * Returns the meta object for class '{@link tp6.KnowledgeManager <em>Knowledge Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Manager</em>'.
	 * @see tp6.KnowledgeManager
	 * @generated
	 */
	EClass getKnowledgeManager();

	/**
	 * Returns the meta object for the containment reference list '{@link tp6.KnowledgeManager#getAllKeywords <em>All Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Keywords</em>'.
	 * @see tp6.KnowledgeManager#getAllKeywords()
	 * @see #getKnowledgeManager()
	 * @generated
	 */
	EReference getKnowledgeManager_AllKeywords();

	/**
	 * Returns the meta object for the attribute '{@link tp6.KnowledgeManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tp6.KnowledgeManager#getName()
	 * @see #getKnowledgeManager()
	 * @generated
	 */
	EAttribute getKnowledgeManager_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tp6Factory getTp6Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tp6.impl.ResearcherImpl <em>Researcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.ResearcherImpl
		 * @see tp6.impl.Tp6PackageImpl#getResearcher()
		 * @generated
		 */
		EClass RESEARCHER = eINSTANCE.getResearcher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESEARCHER__NAME = eINSTANCE.getResearcher_Name();

		/**
		 * The meta object literal for the '<em><b>For Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESEARCHER__FOR_NAME = eINSTANCE.getResearcher_ForName();

		/**
		 * The meta object literal for the '<em><b>Res papers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCHER__RES_PAPERS = eINSTANCE.getResearcher_Res_papers();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCHER__SKILLS = eINSTANCE.getResearcher_Skills();

		/**
		 * The meta object literal for the '<em><b>Res position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCHER__RES_POSITION = eINSTANCE.getResearcher_Res_position();

		/**
		 * The meta object literal for the '<em><b>Collaborations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESEARCHER__COLLABORATIONS = eINSTANCE.getResearcher_Collaborations();

		/**
		 * The meta object literal for the '{@link tp6.impl.PaperImpl <em>Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.PaperImpl
		 * @see tp6.impl.Tp6PackageImpl#getPaper()
		 * @generated
		 */
		EClass PAPER = eINSTANCE.getPaper();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__PARAGRAPHS = eINSTANCE.getPaper_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__AUTHORS = eINSTANCE.getPaper_Authors();

		/**
		 * The meta object literal for the '<em><b>Cited By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__CITED_BY = eINSTANCE.getPaper_CitedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER__NAME = eINSTANCE.getPaper_Name();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER__KEYWORDS = eINSTANCE.getPaper_Keywords();

		/**
		 * The meta object literal for the '{@link tp6.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.ParagraphImpl
		 * @see tp6.impl.Tp6PackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__NAME = eINSTANCE.getParagraph_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__ID = eINSTANCE.getParagraph_Id();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__CONTENT = eINSTANCE.getParagraph_Content();

		/**
		 * The meta object literal for the '{@link tp6.impl.PublicationStructureImpl <em>Publication Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.PublicationStructureImpl
		 * @see tp6.impl.Tp6PackageImpl#getPublicationStructure()
		 * @generated
		 */
		EClass PUBLICATION_STRUCTURE = eINSTANCE.getPublicationStructure();

		/**
		 * The meta object literal for the '<em><b>Researchers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_STRUCTURE__RESEARCHERS = eINSTANCE.getPublicationStructure_Researchers();

		/**
		 * The meta object literal for the '<em><b>Papers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_STRUCTURE__PAPERS = eINSTANCE.getPublicationStructure_Papers();

		/**
		 * The meta object literal for the '<em><b>Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_STRUCTURE__POSITIONS = eINSTANCE.getPublicationStructure_Positions();

		/**
		 * The meta object literal for the '<em><b>Knowledge Man</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLICATION_STRUCTURE__KNOWLEDGE_MAN = eINSTANCE.getPublicationStructure_KnowledgeMan();

		/**
		 * The meta object literal for the '{@link tp6.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.SkillImpl
		 * @see tp6.impl.Tp6PackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__DESCRIPTION = eINSTANCE.getSkill_Description();

		/**
		 * The meta object literal for the '{@link tp6.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.PositionImpl
		 * @see tp6.impl.Tp6PackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__NAME = eINSTANCE.getPosition_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__DESCRIPTION = eINSTANCE.getPosition_Description();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__PARENT = eINSTANCE.getPosition_Parent();

		/**
		 * The meta object literal for the '{@link tp6.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.CollaborationImpl
		 * @see tp6.impl.Tp6PackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__RATIO = eINSTANCE.getCollaboration_Ratio();

		/**
		 * The meta object literal for the '<em><b>Col paper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__COL_PAPER = eINSTANCE.getCollaboration_Col_paper();

		/**
		 * The meta object literal for the '{@link tp6.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.KeywordImpl
		 * @see tp6.impl.Tp6PackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__KEY = eINSTANCE.getKeyword_Key();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD__DESCRIPTION = eINSTANCE.getKeyword_Description();

		/**
		 * The meta object literal for the '<em><b>KPapers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORD__KPAPERS = eINSTANCE.getKeyword_KPapers();

		/**
		 * The meta object literal for the '{@link tp6.impl.PaperKeywordsImpl <em>Paper Keywords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.PaperKeywordsImpl
		 * @see tp6.impl.Tp6PackageImpl#getPaperKeywords()
		 * @generated
		 */
		EClass PAPER_KEYWORDS = eINSTANCE.getPaperKeywords();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAPER_KEYWORDS__WEIGHT = eINSTANCE.getPaperKeywords_Weight();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAPER_KEYWORDS__KEYWORD = eINSTANCE.getPaperKeywords_Keyword();

		/**
		 * The meta object literal for the '{@link tp6.impl.KnowledgeManagerImpl <em>Knowledge Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tp6.impl.KnowledgeManagerImpl
		 * @see tp6.impl.Tp6PackageImpl#getKnowledgeManager()
		 * @generated
		 */
		EClass KNOWLEDGE_MANAGER = eINSTANCE.getKnowledgeManager();

		/**
		 * The meta object literal for the '<em><b>All Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_MANAGER__ALL_KEYWORDS = eINSTANCE.getKnowledgeManager_AllKeywords();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNOWLEDGE_MANAGER__NAME = eINSTANCE.getKnowledgeManager_Name();

	}

} //Tp6Package
