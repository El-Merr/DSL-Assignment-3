/*
 * generated by Xtext 2.27.0
 */
grammar InternalRobot;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package nl.tue.dsldesign.robot.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package nl.tue.dsldesign.robot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.tue.dsldesign.robot.services.RobotGrammarAccess;

}

@parser::members {

 	private RobotGrammarAccess grammarAccess;

    public InternalRobotParser(TokenStream input, RobotGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected RobotGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelAccess().getModelAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getRobotsRobotParserRuleCall_1_0());
				}
				lv_robots_1_0=ruleRobot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"robots",
						lv_robots_1_0,
						"nl.tue.dsldesign.robot.Robot.Robot");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleRobot
entryRuleRobot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotRule()); }
	iv_ruleRobot=ruleRobot
	{ $current=$iv_ruleRobot.current; }
	EOF;

// Rule Robot
ruleRobot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRobotAccess().getRobotAction_0(),
					$current);
			}
		)
		otherlv_1='begin'
		{
			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getBeginKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRobotAccess().getInitialInitialParserRuleCall_2_0());
				}
				lv_initial_2_0=ruleInitial
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRobotRule());
					}
					set(
						$current,
						"initial",
						lv_initial_2_0,
						"nl.tue.dsldesign.robot.Robot.Initial");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getStepsStepParserRuleCall_3_0_0());
					}
					lv_steps_3_0=ruleStep
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						add(
							$current,
							"steps",
							lv_steps_3_0,
							"nl.tue.dsldesign.robot.Robot.Step");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotAccess().getStepsStepParserRuleCall_3_1_0());
					}
					lv_steps_4_0=ruleStep
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotRule());
						}
						add(
							$current,
							"steps",
							lv_steps_4_0,
							"nl.tue.dsldesign.robot.Robot.Step");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		otherlv_5='end'
		{
			newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getEndKeyword_4());
		}
	)
;

// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStepAccess().getStepAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStepAccess().getDirectionDirectionEnumRuleCall_1_0());
				}
				lv_direction_1_0=ruleDirection
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepRule());
					}
					set(
						$current,
						"direction",
						lv_direction_1_0,
						"nl.tue.dsldesign.robot.Robot.Direction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStepAccess().getDistanceEIntParserRuleCall_2_0());
				}
				lv_distance_2_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepRule());
					}
					set(
						$current,
						"distance",
						lv_distance_2_0,
						"nl.tue.dsldesign.robot.Robot.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleInitial
entryRuleInitial returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitialRule()); }
	iv_ruleInitial=ruleInitial
	{ $current=$iv_ruleInitial.current; }
	EOF;

// Rule Initial
ruleInitial returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInitialAccess().getInitialAction_0(),
					$current);
			}
		)
		otherlv_1='initial'
		{
			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitialAccess().getXPosEIntParserRuleCall_2_0());
				}
				lv_xPos_2_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitialRule());
					}
					set(
						$current,
						"xPos",
						lv_xPos_2_0,
						"nl.tue.dsldesign.robot.Robot.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitialAccess().getYPosEIntParserRuleCall_4_0());
				}
				lv_yPos_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitialRule());
					}
					set(
						$current,
						"yPos",
						lv_yPos_4_0,
						"nl.tue.dsldesign.robot.Robot.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule Direction
ruleDirection returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='up'
			{
				$current = grammarAccess.getDirectionAccess().getUpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getUpEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='down'
			{
				$current = grammarAccess.getDirectionAccess().getDownEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getDownEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='left'
			{
				$current = grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='right'
			{
				$current = grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
