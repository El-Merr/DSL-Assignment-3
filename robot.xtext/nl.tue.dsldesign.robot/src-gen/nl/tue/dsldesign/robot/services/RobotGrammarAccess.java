/*
 * generated by Xtext 2.27.0
 */
package nl.tue.dsldesign.robot.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RobotGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.dsldesign.robot.Robot.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRobotsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRobotsRobotParserRuleCall_1_0 = (RuleCall)cRobotsAssignment_1.eContents().get(0);
		
		//Model returns Model:
		//    {Model} robots+=Robot*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} robots+=Robot*
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//robots+=Robot*
		public Assignment getRobotsAssignment_1() { return cRobotsAssignment_1; }
		
		//Robot
		public RuleCall getRobotsRobotParserRuleCall_1_0() { return cRobotsRobotParserRuleCall_1_0; }
	}
	public class RobotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.dsldesign.robot.Robot.Robot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRobotAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBeginKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInitialAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInitialInitialParserRuleCall_2_0 = (RuleCall)cInitialAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cStepsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cStepsStepParserRuleCall_3_0_0 = (RuleCall)cStepsAssignment_3_0.eContents().get(0);
		private final Assignment cStepsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStepsStepParserRuleCall_3_1_0 = (RuleCall)cStepsAssignment_3_1.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Robot returns Robot:
		//    {Robot}
		//    'begin'
		//        (initial=Initial)?
		//        (steps+=Step (steps+=Step)* )?
		//    'end';
		@Override public ParserRule getRule() { return rule; }
		
		//{Robot}
		//'begin'
		//    (initial=Initial)?
		//    (steps+=Step (steps+=Step)* )?
		//'end'
		public Group getGroup() { return cGroup; }
		
		//{Robot}
		public Action getRobotAction_0() { return cRobotAction_0; }
		
		//'begin'
		public Keyword getBeginKeyword_1() { return cBeginKeyword_1; }
		
		//(initial=Initial)?
		public Assignment getInitialAssignment_2() { return cInitialAssignment_2; }
		
		//Initial
		public RuleCall getInitialInitialParserRuleCall_2_0() { return cInitialInitialParserRuleCall_2_0; }
		
		//(steps+=Step (steps+=Step)* )?
		public Group getGroup_3() { return cGroup_3; }
		
		//steps+=Step
		public Assignment getStepsAssignment_3_0() { return cStepsAssignment_3_0; }
		
		//Step
		public RuleCall getStepsStepParserRuleCall_3_0_0() { return cStepsStepParserRuleCall_3_0_0; }
		
		//(steps+=Step)*
		public Assignment getStepsAssignment_3_1() { return cStepsAssignment_3_1; }
		
		//Step
		public RuleCall getStepsStepParserRuleCall_3_1_0() { return cStepsStepParserRuleCall_3_1_0; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.dsldesign.robot.Robot.Step");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStepAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDirectionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDirectionDirectionEnumRuleCall_1_0 = (RuleCall)cDirectionAssignment_1.eContents().get(0);
		private final Assignment cDistanceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDistanceEIntParserRuleCall_2_0 = (RuleCall)cDistanceAssignment_2.eContents().get(0);
		
		//Step returns Step:
		//    {Step} direction=Direction (distance=EInt)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Step} direction=Direction (distance=EInt)?
		public Group getGroup() { return cGroup; }
		
		//{Step}
		public Action getStepAction_0() { return cStepAction_0; }
		
		//direction=Direction
		public Assignment getDirectionAssignment_1() { return cDirectionAssignment_1; }
		
		//Direction
		public RuleCall getDirectionDirectionEnumRuleCall_1_0() { return cDirectionDirectionEnumRuleCall_1_0; }
		
		//(distance=EInt)?
		public Assignment getDistanceAssignment_2() { return cDistanceAssignment_2; }
		
		//EInt
		public RuleCall getDistanceEIntParserRuleCall_2_0() { return cDistanceEIntParserRuleCall_2_0; }
	}
	public class InitialElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.dsldesign.robot.Robot.Initial");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInitialAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInitialKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cXPosAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cXPosEIntParserRuleCall_2_0 = (RuleCall)cXPosAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cYPosAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cYPosEIntParserRuleCall_4_0 = (RuleCall)cYPosAssignment_4.eContents().get(0);
		
		//Initial returns Initial:
		//    {Initial} 'initial' xPos=EInt ',' yPos=EInt;
		@Override public ParserRule getRule() { return rule; }
		
		//{Initial} 'initial' xPos=EInt ',' yPos=EInt
		public Group getGroup() { return cGroup; }
		
		//{Initial}
		public Action getInitialAction_0() { return cInitialAction_0; }
		
		//'initial'
		public Keyword getInitialKeyword_1() { return cInitialKeyword_1; }
		
		//xPos=EInt
		public Assignment getXPosAssignment_2() { return cXPosAssignment_2; }
		
		//EInt
		public RuleCall getXPosEIntParserRuleCall_2_0() { return cXPosEIntParserRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//yPos=EInt
		public Assignment getYPosAssignment_4() { return cYPosAssignment_4; }
		
		//EInt
		public RuleCall getYPosEIntParserRuleCall_4_0() { return cYPosEIntParserRuleCall_4_0; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.dsldesign.robot.Robot.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class DirectionElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "nl.tue.dsldesign.robot.Robot.Direction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUpEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUpUpKeyword_0_0 = (Keyword)cUpEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDownEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDownDownKeyword_1_0 = (Keyword)cDownEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLeftEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLeftLeftKeyword_2_0 = (Keyword)cLeftEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cRightEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cRightRightKeyword_3_0 = (Keyword)cRightEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Direction returns Direction:
		//                up = 'up' | down = 'down' | left = 'left' | right = 'right';
		public EnumRule getRule() { return rule; }
		
		//up = 'up' | down = 'down' | left = 'left' | right = 'right'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//up = 'up'
		public EnumLiteralDeclaration getUpEnumLiteralDeclaration_0() { return cUpEnumLiteralDeclaration_0; }
		
		//'up'
		public Keyword getUpUpKeyword_0_0() { return cUpUpKeyword_0_0; }
		
		//down = 'down'
		public EnumLiteralDeclaration getDownEnumLiteralDeclaration_1() { return cDownEnumLiteralDeclaration_1; }
		
		//'down'
		public Keyword getDownDownKeyword_1_0() { return cDownDownKeyword_1_0; }
		
		//left = 'left'
		public EnumLiteralDeclaration getLeftEnumLiteralDeclaration_2() { return cLeftEnumLiteralDeclaration_2; }
		
		//'left'
		public Keyword getLeftLeftKeyword_2_0() { return cLeftLeftKeyword_2_0; }
		
		//right = 'right'
		public EnumLiteralDeclaration getRightEnumLiteralDeclaration_3() { return cRightEnumLiteralDeclaration_3; }
		
		//'right'
		public Keyword getRightRightKeyword_3_0() { return cRightRightKeyword_3_0; }
	}
	
	private final ModelElements pModel;
	private final RobotElements pRobot;
	private final StepElements pStep;
	private final InitialElements pInitial;
	private final DirectionElements eDirection;
	private final EIntElements pEInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RobotGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pRobot = new RobotElements();
		this.pStep = new StepElements();
		this.pInitial = new InitialElements();
		this.eDirection = new DirectionElements();
		this.pEInt = new EIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("nl.tue.dsldesign.robot.Robot".equals(grammar.getName())) {
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
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model returns Model:
	//    {Model} robots+=Robot*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Robot returns Robot:
	//    {Robot}
	//    'begin'
	//        (initial=Initial)?
	//        (steps+=Step (steps+=Step)* )?
	//    'end';
	public RobotElements getRobotAccess() {
		return pRobot;
	}
	
	public ParserRule getRobotRule() {
		return getRobotAccess().getRule();
	}
	
	//Step returns Step:
	//    {Step} direction=Direction (distance=EInt)?;
	public StepElements getStepAccess() {
		return pStep;
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}
	
	//Initial returns Initial:
	//    {Initial} 'initial' xPos=EInt ',' yPos=EInt;
	public InitialElements getInitialAccess() {
		return pInitial;
	}
	
	public ParserRule getInitialRule() {
		return getInitialAccess().getRule();
	}
	
	//enum Direction returns Direction:
	//                up = 'up' | down = 'down' | left = 'left' | right = 'right';
	public DirectionElements getDirectionAccess() {
		return eDirection;
	}
	
	public EnumRule getDirectionRule() {
		return getDirectionAccess().getRule();
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
