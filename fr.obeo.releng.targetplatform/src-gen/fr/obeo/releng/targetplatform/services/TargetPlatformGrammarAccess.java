/*
* generated by Xtext
*/
package fr.obeo.releng.targetplatform.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class TargetPlatformGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class TargetPlatformElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TargetPlatform");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTargetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cVersionKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cTargetVersionsAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cTargetVersionsTargetVersionEnumRuleCall_2_0_1_0 = (RuleCall)cTargetVersionsAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_0_2 = (Group)cGroup_2_0.eContents().get(2);
		private final Keyword cCommaKeyword_2_0_2_0 = (Keyword)cGroup_2_0_2.eContents().get(0);
		private final Assignment cTargetVersionsAssignment_2_0_2_1 = (Assignment)cGroup_2_0_2.eContents().get(1);
		private final RuleCall cTargetVersionsTargetVersionEnumRuleCall_2_0_2_1_0 = (RuleCall)cTargetVersionsAssignment_2_0_2_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cWithKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cOptionsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cOptionsOptionEnumRuleCall_2_1_1_0 = (RuleCall)cOptionsAssignment_2_1_1.eContents().get(0);
		private final Group cGroup_2_1_2 = (Group)cGroup_2_1.eContents().get(2);
		private final Keyword cCommaKeyword_2_1_2_0 = (Keyword)cGroup_2_1_2.eContents().get(0);
		private final Assignment cOptionsAssignment_2_1_2_1 = (Assignment)cGroup_2_1_2.eContents().get(1);
		private final RuleCall cOptionsOptionEnumRuleCall_2_1_2_1_0 = (RuleCall)cOptionsAssignment_2_1_2_1.eContents().get(0);
		private final Assignment cLocationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLocationsLocationParserRuleCall_3_0 = (RuleCall)cLocationsAssignment_3.eContents().get(0);
		
		//TargetPlatform:
		//	("target" name=STRING (("version" targetVersions+=TargetVersion ("," targetVersions+=TargetVersion)*)? & ("with"
		//	options+=Option ("," options+=Option)*)?) locations+=Location*)?;
		public ParserRule getRule() { return rule; }

		//("target" name=STRING (("version" targetVersions+=TargetVersion ("," targetVersions+=TargetVersion)*)? & ("with"
		//options+=Option ("," options+=Option)*)?) locations+=Location*)?
		public Group getGroup() { return cGroup; }

		//"target"
		public Keyword getTargetKeyword_0() { return cTargetKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//("version" targetVersions+=TargetVersion ("," targetVersions+=TargetVersion)*)? & ("with" options+=Option (","
		//options+=Option)*)?
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }

		//("version" targetVersions+=TargetVersion ("," targetVersions+=TargetVersion)*)?
		public Group getGroup_2_0() { return cGroup_2_0; }

		//"version"
		public Keyword getVersionKeyword_2_0_0() { return cVersionKeyword_2_0_0; }

		//targetVersions+=TargetVersion
		public Assignment getTargetVersionsAssignment_2_0_1() { return cTargetVersionsAssignment_2_0_1; }

		//TargetVersion
		public RuleCall getTargetVersionsTargetVersionEnumRuleCall_2_0_1_0() { return cTargetVersionsTargetVersionEnumRuleCall_2_0_1_0; }

		//("," targetVersions+=TargetVersion)*
		public Group getGroup_2_0_2() { return cGroup_2_0_2; }

		//","
		public Keyword getCommaKeyword_2_0_2_0() { return cCommaKeyword_2_0_2_0; }

		//targetVersions+=TargetVersion
		public Assignment getTargetVersionsAssignment_2_0_2_1() { return cTargetVersionsAssignment_2_0_2_1; }

		//TargetVersion
		public RuleCall getTargetVersionsTargetVersionEnumRuleCall_2_0_2_1_0() { return cTargetVersionsTargetVersionEnumRuleCall_2_0_2_1_0; }

		//("with" options+=Option ("," options+=Option)*)?
		public Group getGroup_2_1() { return cGroup_2_1; }

		//"with"
		public Keyword getWithKeyword_2_1_0() { return cWithKeyword_2_1_0; }

		//options+=Option
		public Assignment getOptionsAssignment_2_1_1() { return cOptionsAssignment_2_1_1; }

		//Option
		public RuleCall getOptionsOptionEnumRuleCall_2_1_1_0() { return cOptionsOptionEnumRuleCall_2_1_1_0; }

		//("," options+=Option)*
		public Group getGroup_2_1_2() { return cGroup_2_1_2; }

		//","
		public Keyword getCommaKeyword_2_1_2_0() { return cCommaKeyword_2_1_2_0; }

		//options+=Option
		public Assignment getOptionsAssignment_2_1_2_1() { return cOptionsAssignment_2_1_2_1; }

		//Option
		public RuleCall getOptionsOptionEnumRuleCall_2_1_2_1_0() { return cOptionsOptionEnumRuleCall_2_1_2_1_0; }

		//locations+=Location*
		public Assignment getLocationsAssignment_3() { return cLocationsAssignment_3; }

		//Location
		public RuleCall getLocationsLocationParserRuleCall_3_0() { return cLocationsLocationParserRuleCall_3_0; }
	}

	public class LocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Location");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLocationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Assignment cIdAssignment_1_0 = (Assignment)cUnorderedGroup_1.eContents().get(0);
		private final RuleCall cIdIDTerminalRuleCall_1_0_0 = (RuleCall)cIdAssignment_1_0.eContents().get(0);
		private final Assignment cUriAssignment_1_1 = (Assignment)cUnorderedGroup_1.eContents().get(1);
		private final RuleCall cUriSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cUriAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cWithKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cOptionsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cOptionsOptionEnumRuleCall_2_1_1_0 = (RuleCall)cOptionsAssignment_2_1_1.eContents().get(0);
		private final Group cGroup_2_1_2 = (Group)cGroup_2_1.eContents().get(2);
		private final Keyword cCommaKeyword_2_1_2_0 = (Keyword)cGroup_2_1_2.eContents().get(0);
		private final Assignment cOptionsAssignment_2_1_2_1 = (Assignment)cGroup_2_1_2.eContents().get(1);
		private final RuleCall cOptionsOptionEnumRuleCall_2_1_2_1_0 = (RuleCall)cOptionsAssignment_2_1_2_1.eContents().get(0);
		private final Assignment cIusAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cIusIUParserRuleCall_2_2_0 = (RuleCall)cIusAssignment_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//Location:
		//	"location" (id=ID? & uri=STRING) ("{" ("with" options+=Option ("," options+=Option)*)? ius+=IU* "}")?;
		public ParserRule getRule() { return rule; }

		//"location" (id=ID? & uri=STRING) ("{" ("with" options+=Option ("," options+=Option)*)? ius+=IU* "}")?
		public Group getGroup() { return cGroup; }

		//"location"
		public Keyword getLocationKeyword_0() { return cLocationKeyword_0; }

		//id=ID? & uri=STRING
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }

		//id=ID?
		public Assignment getIdAssignment_1_0() { return cIdAssignment_1_0; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0_0() { return cIdIDTerminalRuleCall_1_0_0; }

		//uri=STRING
		public Assignment getUriAssignment_1_1() { return cUriAssignment_1_1; }

		//STRING
		public RuleCall getUriSTRINGTerminalRuleCall_1_1_0() { return cUriSTRINGTerminalRuleCall_1_1_0; }

		//("{" ("with" options+=Option ("," options+=Option)*)? ius+=IU* "}")?
		public Group getGroup_2() { return cGroup_2; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }

		//("with" options+=Option ("," options+=Option)*)?
		public Group getGroup_2_1() { return cGroup_2_1; }

		//"with"
		public Keyword getWithKeyword_2_1_0() { return cWithKeyword_2_1_0; }

		//options+=Option
		public Assignment getOptionsAssignment_2_1_1() { return cOptionsAssignment_2_1_1; }

		//Option
		public RuleCall getOptionsOptionEnumRuleCall_2_1_1_0() { return cOptionsOptionEnumRuleCall_2_1_1_0; }

		//("," options+=Option)*
		public Group getGroup_2_1_2() { return cGroup_2_1_2; }

		//","
		public Keyword getCommaKeyword_2_1_2_0() { return cCommaKeyword_2_1_2_0; }

		//options+=Option
		public Assignment getOptionsAssignment_2_1_2_1() { return cOptionsAssignment_2_1_2_1; }

		//Option
		public RuleCall getOptionsOptionEnumRuleCall_2_1_2_1_0() { return cOptionsOptionEnumRuleCall_2_1_2_1_0; }

		//ius+=IU*
		public Assignment getIusAssignment_2_2() { return cIusAssignment_2_2; }

		//IU
		public RuleCall getIusIUParserRuleCall_2_2_0() { return cIusIUParserRuleCall_2_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
	}

	public class IUElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IU");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIDAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIDQualifiedNameParserRuleCall_0_0 = (RuleCall)cIDAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cSemicolonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cVersionKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Alternatives cAlternatives_1_3 = (Alternatives)cGroup_1.eContents().get(3);
		private final Assignment cVersionAssignment_1_3_0 = (Assignment)cAlternatives_1_3.eContents().get(0);
		private final RuleCall cVersionVersionRangeParserRuleCall_1_3_0_0 = (RuleCall)cVersionAssignment_1_3_0.eContents().get(0);
		private final Assignment cVersionAssignment_1_3_1 = (Assignment)cAlternatives_1_3.eContents().get(1);
		private final RuleCall cVersionSTRINGTerminalRuleCall_1_3_1_0 = (RuleCall)cVersionAssignment_1_3_1.eContents().get(0);
		
		//IU:
		//	ID=QualifiedName (";" "version" "=" (version=VersionRange | version=STRING))?;
		public ParserRule getRule() { return rule; }

		//ID=QualifiedName (";" "version" "=" (version=VersionRange | version=STRING))?
		public Group getGroup() { return cGroup; }

		//ID=QualifiedName
		public Assignment getIDAssignment_0() { return cIDAssignment_0; }

		//QualifiedName
		public RuleCall getIDQualifiedNameParserRuleCall_0_0() { return cIDQualifiedNameParserRuleCall_0_0; }

		//(";" "version" "=" (version=VersionRange | version=STRING))?
		public Group getGroup_1() { return cGroup_1; }

		//";"
		public Keyword getSemicolonKeyword_1_0() { return cSemicolonKeyword_1_0; }

		//"version"
		public Keyword getVersionKeyword_1_1() { return cVersionKeyword_1_1; }

		//"="
		public Keyword getEqualsSignKeyword_1_2() { return cEqualsSignKeyword_1_2; }

		//version=VersionRange | version=STRING
		public Alternatives getAlternatives_1_3() { return cAlternatives_1_3; }

		//version=VersionRange
		public Assignment getVersionAssignment_1_3_0() { return cVersionAssignment_1_3_0; }

		//VersionRange
		public RuleCall getVersionVersionRangeParserRuleCall_1_3_0_0() { return cVersionVersionRangeParserRuleCall_1_3_0_0; }

		//version=STRING
		public Assignment getVersionAssignment_1_3_1() { return cVersionAssignment_1_3_1; }

		//STRING
		public RuleCall getVersionSTRINGTerminalRuleCall_1_3_1_0() { return cVersionSTRINGTerminalRuleCall_1_3_1_0; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName hidden():
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//(=> "." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//=> "."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Version");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cFullStopKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_2_1 = (RuleCall)cGroup_1_2.eContents().get(1);
		private final Group cGroup_1_2_2 = (Group)cGroup_1_2.eContents().get(2);
		private final Keyword cFullStopKeyword_1_2_2_0 = (Keyword)cGroup_1_2_2.eContents().get(0);
		private final Alternatives cAlternatives_1_2_2_1 = (Alternatives)cGroup_1_2_2.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_2_2_1_0 = (RuleCall)cAlternatives_1_2_2_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_2_2_1_1 = (RuleCall)cAlternatives_1_2_2_1.eContents().get(1);
		
		//Version hidden():
		//	INT ("." INT ("." INT ("." (ID | INT))?)?)?;
		public ParserRule getRule() { return rule; }

		//INT ("." INT ("." INT ("." (ID | INT))?)?)?
		public Group getGroup() { return cGroup; }

		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }

		//("." INT ("." INT ("." (ID | INT))?)?)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }

		//("." INT ("." (ID | INT))?)?
		public Group getGroup_1_2() { return cGroup_1_2; }

		//"."
		public Keyword getFullStopKeyword_1_2_0() { return cFullStopKeyword_1_2_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_2_1() { return cINTTerminalRuleCall_1_2_1; }

		//("." (ID | INT))?
		public Group getGroup_1_2_2() { return cGroup_1_2_2; }

		//"."
		public Keyword getFullStopKeyword_1_2_2_0() { return cFullStopKeyword_1_2_2_0; }

		//ID | INT
		public Alternatives getAlternatives_1_2_2_1() { return cAlternatives_1_2_2_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_2_2_1_0() { return cIDTerminalRuleCall_1_2_2_1_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_2_2_1_1() { return cINTTerminalRuleCall_1_2_2_1_1; }
	}

	public class VersionRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VersionRange");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Alternatives cAlternatives_0_0 = (Alternatives)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0_0 = (Keyword)cAlternatives_0_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_0_0_1 = (Keyword)cAlternatives_0_0.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final RuleCall cWSTerminalRuleCall_0_3 = (RuleCall)cGroup_0.eContents().get(3);
		private final Keyword cCommaKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final RuleCall cWSTerminalRuleCall_0_5 = (RuleCall)cGroup_0.eContents().get(5);
		private final RuleCall cVersionParserRuleCall_0_6 = (RuleCall)cGroup_0.eContents().get(6);
		private final RuleCall cWSTerminalRuleCall_0_7 = (RuleCall)cGroup_0.eContents().get(7);
		private final Alternatives cAlternatives_0_8 = (Alternatives)cGroup_0.eContents().get(8);
		private final Keyword cRightParenthesisKeyword_0_8_0 = (Keyword)cAlternatives_0_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_8_1 = (Keyword)cAlternatives_0_8.eContents().get(1);
		private final RuleCall cVersionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//VersionRange hidden():
		//	("(" | "[") WS* Version WS* "," WS* Version WS* (")" | "]") | Version;
		public ParserRule getRule() { return rule; }

		//("(" | "[") WS* Version WS* "," WS* Version WS* (")" | "]") | Version
		public Alternatives getAlternatives() { return cAlternatives; }

		//("(" | "[") WS* Version WS* "," WS* Version WS* (")" | "]")
		public Group getGroup_0() { return cGroup_0; }

		//"(" | "["
		public Alternatives getAlternatives_0_0() { return cAlternatives_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_0_0() { return cLeftParenthesisKeyword_0_0_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0_0_1() { return cLeftSquareBracketKeyword_0_0_1; }

		//WS*
		public RuleCall getWSTerminalRuleCall_0_1() { return cWSTerminalRuleCall_0_1; }

		//Version
		public RuleCall getVersionParserRuleCall_0_2() { return cVersionParserRuleCall_0_2; }

		//WS*
		public RuleCall getWSTerminalRuleCall_0_3() { return cWSTerminalRuleCall_0_3; }

		//","
		public Keyword getCommaKeyword_0_4() { return cCommaKeyword_0_4; }

		//WS*
		public RuleCall getWSTerminalRuleCall_0_5() { return cWSTerminalRuleCall_0_5; }

		//Version
		public RuleCall getVersionParserRuleCall_0_6() { return cVersionParserRuleCall_0_6; }

		//WS*
		public RuleCall getWSTerminalRuleCall_0_7() { return cWSTerminalRuleCall_0_7; }

		//")" | "]"
		public Alternatives getAlternatives_0_8() { return cAlternatives_0_8; }

		//")"
		public Keyword getRightParenthesisKeyword_0_8_0() { return cRightParenthesisKeyword_0_8_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_0_8_1() { return cRightSquareBracketKeyword_0_8_1; }

		//Version
		public RuleCall getVersionParserRuleCall_1() { return cVersionParserRuleCall_1; }
	}
	
	
	public class TargetVersionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "TargetVersion");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTARGET_38EnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTARGET_38PDE_38Keyword_0_0 = (Keyword)cTARGET_38EnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTARGET_36EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTARGET_36PDE_36Keyword_1_0 = (Keyword)cTARGET_36EnumLiteralDeclaration_1.eContents().get(0);
		
		//enum TargetVersion:
		//	TARGET_38="PDE_3.8" | TARGET_36="PDE_3.6";
		public EnumRule getRule() { return rule; }

		//TARGET_38="PDE_3.8" | TARGET_36="PDE_3.6"
		public Alternatives getAlternatives() { return cAlternatives; }

		//TARGET_38="PDE_3.8"
		public EnumLiteralDeclaration getTARGET_38EnumLiteralDeclaration_0() { return cTARGET_38EnumLiteralDeclaration_0; }

		//"PDE_3.8"
		public Keyword getTARGET_38PDE_38Keyword_0_0() { return cTARGET_38PDE_38Keyword_0_0; }

		//TARGET_36="PDE_3.6"
		public EnumLiteralDeclaration getTARGET_36EnumLiteralDeclaration_1() { return cTARGET_36EnumLiteralDeclaration_1; }

		//"PDE_3.6"
		public Keyword getTARGET_36PDE_36Keyword_1_0() { return cTARGET_36PDE_36Keyword_1_0; }
	}

	public class OptionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Option");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINCLUDE_REQUIREDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINCLUDE_REQUIREDRequirementsKeyword_0_0 = (Keyword)cINCLUDE_REQUIREDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cINCLUDE_ALL_ENVIRONMENTSEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cINCLUDE_ALL_ENVIRONMENTSAllEnvironmentsKeyword_1_0 = (Keyword)cINCLUDE_ALL_ENVIRONMENTSEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cINCLUDE_SOURCEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cINCLUDE_SOURCESourceKeyword_2_0 = (Keyword)cINCLUDE_SOURCEEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cINCLUDE_CONFIGURE_PHASEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cINCLUDE_CONFIGURE_PHASEConfigurePhaseKeyword_3_0 = (Keyword)cINCLUDE_CONFIGURE_PHASEEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Option:
		//	INCLUDE_REQUIRED="requirements" | INCLUDE_ALL_ENVIRONMENTS="allEnvironments" | INCLUDE_SOURCE="source" |
		//	INCLUDE_CONFIGURE_PHASE="configurePhase";
		public EnumRule getRule() { return rule; }

		//INCLUDE_REQUIRED="requirements" | INCLUDE_ALL_ENVIRONMENTS="allEnvironments" | INCLUDE_SOURCE="source" |
		//INCLUDE_CONFIGURE_PHASE="configurePhase"
		public Alternatives getAlternatives() { return cAlternatives; }

		//INCLUDE_REQUIRED="requirements"
		public EnumLiteralDeclaration getINCLUDE_REQUIREDEnumLiteralDeclaration_0() { return cINCLUDE_REQUIREDEnumLiteralDeclaration_0; }

		//"requirements"
		public Keyword getINCLUDE_REQUIREDRequirementsKeyword_0_0() { return cINCLUDE_REQUIREDRequirementsKeyword_0_0; }

		//INCLUDE_ALL_ENVIRONMENTS="allEnvironments"
		public EnumLiteralDeclaration getINCLUDE_ALL_ENVIRONMENTSEnumLiteralDeclaration_1() { return cINCLUDE_ALL_ENVIRONMENTSEnumLiteralDeclaration_1; }

		//"allEnvironments"
		public Keyword getINCLUDE_ALL_ENVIRONMENTSAllEnvironmentsKeyword_1_0() { return cINCLUDE_ALL_ENVIRONMENTSAllEnvironmentsKeyword_1_0; }

		//INCLUDE_SOURCE="source"
		public EnumLiteralDeclaration getINCLUDE_SOURCEEnumLiteralDeclaration_2() { return cINCLUDE_SOURCEEnumLiteralDeclaration_2; }

		//"source"
		public Keyword getINCLUDE_SOURCESourceKeyword_2_0() { return cINCLUDE_SOURCESourceKeyword_2_0; }

		//INCLUDE_CONFIGURE_PHASE="configurePhase"
		public EnumLiteralDeclaration getINCLUDE_CONFIGURE_PHASEEnumLiteralDeclaration_3() { return cINCLUDE_CONFIGURE_PHASEEnumLiteralDeclaration_3; }

		//"configurePhase"
		public Keyword getINCLUDE_CONFIGURE_PHASEConfigurePhaseKeyword_3_0() { return cINCLUDE_CONFIGURE_PHASEConfigurePhaseKeyword_3_0; }
	}
	
	private TargetPlatformElements pTargetPlatform;
	private TargetVersionElements unknownRuleTargetVersion;
	private LocationElements pLocation;
	private OptionElements unknownRuleOption;
	private IUElements pIU;
	private QualifiedNameElements pQualifiedName;
	private VersionElements pVersion;
	private VersionRangeElements pVersionRange;
	private TerminalRule tINT;
	private TerminalRule tID;
	private TerminalRule tSTRING;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tWS;
	private TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public TargetPlatformGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.obeo.releng.targetplatform.TargetPlatform".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//TargetPlatform:
	//	("target" name=STRING (("version" targetVersions+=TargetVersion ("," targetVersions+=TargetVersion)*)? & ("with"
	//	options+=Option ("," options+=Option)*)?) locations+=Location*)?;
	public TargetPlatformElements getTargetPlatformAccess() {
		return (pTargetPlatform != null) ? pTargetPlatform : (pTargetPlatform = new TargetPlatformElements());
	}
	
	public ParserRule getTargetPlatformRule() {
		return getTargetPlatformAccess().getRule();
	}

	//enum TargetVersion:
	//	TARGET_38="PDE_3.8" | TARGET_36="PDE_3.6";
	public TargetVersionElements getTargetVersionAccess() {
		return (unknownRuleTargetVersion != null) ? unknownRuleTargetVersion : (unknownRuleTargetVersion = new TargetVersionElements());
	}
	
	public EnumRule getTargetVersionRule() {
		return getTargetVersionAccess().getRule();
	}

	//Location:
	//	"location" (id=ID? & uri=STRING) ("{" ("with" options+=Option ("," options+=Option)*)? ius+=IU* "}")?;
	public LocationElements getLocationAccess() {
		return (pLocation != null) ? pLocation : (pLocation = new LocationElements());
	}
	
	public ParserRule getLocationRule() {
		return getLocationAccess().getRule();
	}

	//enum Option:
	//	INCLUDE_REQUIRED="requirements" | INCLUDE_ALL_ENVIRONMENTS="allEnvironments" | INCLUDE_SOURCE="source" |
	//	INCLUDE_CONFIGURE_PHASE="configurePhase";
	public OptionElements getOptionAccess() {
		return (unknownRuleOption != null) ? unknownRuleOption : (unknownRuleOption = new OptionElements());
	}
	
	public EnumRule getOptionRule() {
		return getOptionAccess().getRule();
	}

	//IU:
	//	ID=QualifiedName (";" "version" "=" (version=VersionRange | version=STRING))?;
	public IUElements getIUAccess() {
		return (pIU != null) ? pIU : (pIU = new IUElements());
	}
	
	public ParserRule getIURule() {
		return getIUAccess().getRule();
	}

	//QualifiedName hidden():
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//Version hidden():
	//	INT ("." INT ("." INT ("." (ID | INT))?)?)?;
	public VersionElements getVersionAccess() {
		return (pVersion != null) ? pVersion : (pVersion = new VersionElements());
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}

	//VersionRange hidden():
	//	("(" | "[") WS* Version WS* "," WS* Version WS* (")" | "]") | Version;
	public VersionRangeElements getVersionRangeAccess() {
		return (pVersionRange != null) ? pVersionRange : (pVersionRange = new VersionRangeElements());
	}
	
	public ParserRule getVersionRangeRule() {
		return getVersionRangeAccess().getRule();
	}

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_" | "-" | "0".."9")+;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return (tANY_OTHER != null) ? tANY_OTHER : (tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER"));
	} 
}