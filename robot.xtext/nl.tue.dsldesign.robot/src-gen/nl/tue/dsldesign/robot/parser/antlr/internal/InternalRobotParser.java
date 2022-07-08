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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRobotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'end'", "'initial'", "','", "'-'", "'up'", "'down'", "'left'", "'right'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalRobotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRobotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRobotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRobot.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalRobot.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRobot.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalRobot.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRobot.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_robots_1_0= ruleRobot ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_robots_1_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:78:2: ( ( () ( (lv_robots_1_0= ruleRobot ) )* ) )
            // InternalRobot.g:79:2: ( () ( (lv_robots_1_0= ruleRobot ) )* )
            {
            // InternalRobot.g:79:2: ( () ( (lv_robots_1_0= ruleRobot ) )* )
            // InternalRobot.g:80:3: () ( (lv_robots_1_0= ruleRobot ) )*
            {
            // InternalRobot.g:80:3: ()
            // InternalRobot.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalRobot.g:87:3: ( (lv_robots_1_0= ruleRobot ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRobot.g:88:4: (lv_robots_1_0= ruleRobot )
            	    {
            	    // InternalRobot.g:88:4: (lv_robots_1_0= ruleRobot )
            	    // InternalRobot.g:89:5: lv_robots_1_0= ruleRobot
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRobotsRobotParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_robots_1_0=ruleRobot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"robots",
            	    						lv_robots_1_0,
            	    						"nl.tue.dsldesign.robot.Robot.Robot");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRobot"
    // InternalRobot.g:110:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalRobot.g:110:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalRobot.g:111:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalRobot.g:117:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'begin' ( (lv_initial_2_0= ruleInitial ) )? ( ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )? otherlv_5= 'end' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_initial_2_0 = null;

        EObject lv_steps_3_0 = null;

        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:123:2: ( ( () otherlv_1= 'begin' ( (lv_initial_2_0= ruleInitial ) )? ( ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )? otherlv_5= 'end' ) )
            // InternalRobot.g:124:2: ( () otherlv_1= 'begin' ( (lv_initial_2_0= ruleInitial ) )? ( ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )? otherlv_5= 'end' )
            {
            // InternalRobot.g:124:2: ( () otherlv_1= 'begin' ( (lv_initial_2_0= ruleInitial ) )? ( ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )? otherlv_5= 'end' )
            // InternalRobot.g:125:3: () otherlv_1= 'begin' ( (lv_initial_2_0= ruleInitial ) )? ( ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )? otherlv_5= 'end'
            {
            // InternalRobot.g:125:3: ()
            // InternalRobot.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getBeginKeyword_1());
            		
            // InternalRobot.g:136:3: ( (lv_initial_2_0= ruleInitial ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRobot.g:137:4: (lv_initial_2_0= ruleInitial )
                    {
                    // InternalRobot.g:137:4: (lv_initial_2_0= ruleInitial )
                    // InternalRobot.g:138:5: lv_initial_2_0= ruleInitial
                    {

                    					newCompositeNode(grammarAccess.getRobotAccess().getInitialInitialParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_initial_2_0=ruleInitial();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRobotRule());
                    					}
                    					set(
                    						current,
                    						"initial",
                    						lv_initial_2_0,
                    						"nl.tue.dsldesign.robot.Robot.Initial");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRobot.g:155:3: ( ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=19)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRobot.g:156:4: ( (lv_steps_3_0= ruleStep ) ) ( (lv_steps_4_0= ruleStep ) )*
                    {
                    // InternalRobot.g:156:4: ( (lv_steps_3_0= ruleStep ) )
                    // InternalRobot.g:157:5: (lv_steps_3_0= ruleStep )
                    {
                    // InternalRobot.g:157:5: (lv_steps_3_0= ruleStep )
                    // InternalRobot.g:158:6: lv_steps_3_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getStepsStepParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_steps_3_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"steps",
                    							lv_steps_3_0,
                    							"nl.tue.dsldesign.robot.Robot.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRobot.g:175:4: ( (lv_steps_4_0= ruleStep ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=16 && LA3_0<=19)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRobot.g:176:5: (lv_steps_4_0= ruleStep )
                    	    {
                    	    // InternalRobot.g:176:5: (lv_steps_4_0= ruleStep )
                    	    // InternalRobot.g:177:6: lv_steps_4_0= ruleStep
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getStepsStepParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_steps_4_0=ruleStep();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"steps",
                    	    							lv_steps_4_0,
                    	    							"nl.tue.dsldesign.robot.Robot.Step");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleStep"
    // InternalRobot.g:203:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalRobot.g:203:45: (iv_ruleStep= ruleStep EOF )
            // InternalRobot.g:204:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalRobot.g:210:1: ruleStep returns [EObject current=null] : ( () ( (lv_direction_1_0= ruleDirection ) ) ( (lv_distance_2_0= ruleEInt ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Enumerator lv_direction_1_0 = null;

        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:216:2: ( ( () ( (lv_direction_1_0= ruleDirection ) ) ( (lv_distance_2_0= ruleEInt ) )? ) )
            // InternalRobot.g:217:2: ( () ( (lv_direction_1_0= ruleDirection ) ) ( (lv_distance_2_0= ruleEInt ) )? )
            {
            // InternalRobot.g:217:2: ( () ( (lv_direction_1_0= ruleDirection ) ) ( (lv_distance_2_0= ruleEInt ) )? )
            // InternalRobot.g:218:3: () ( (lv_direction_1_0= ruleDirection ) ) ( (lv_distance_2_0= ruleEInt ) )?
            {
            // InternalRobot.g:218:3: ()
            // InternalRobot.g:219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            // InternalRobot.g:225:3: ( (lv_direction_1_0= ruleDirection ) )
            // InternalRobot.g:226:4: (lv_direction_1_0= ruleDirection )
            {
            // InternalRobot.g:226:4: (lv_direction_1_0= ruleDirection )
            // InternalRobot.g:227:5: lv_direction_1_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getStepAccess().getDirectionDirectionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_direction_1_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_1_0,
            						"nl.tue.dsldesign.robot.Robot.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRobot.g:244:3: ( (lv_distance_2_0= ruleEInt ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRobot.g:245:4: (lv_distance_2_0= ruleEInt )
                    {
                    // InternalRobot.g:245:4: (lv_distance_2_0= ruleEInt )
                    // InternalRobot.g:246:5: lv_distance_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getStepAccess().getDistanceEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_distance_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepRule());
                    					}
                    					set(
                    						current,
                    						"distance",
                    						lv_distance_2_0,
                    						"nl.tue.dsldesign.robot.Robot.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleInitial"
    // InternalRobot.g:267:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalRobot.g:267:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalRobot.g:268:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalRobot.g:274:1: ruleInitial returns [EObject current=null] : ( () otherlv_1= 'initial' ( (lv_xPos_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_yPos_4_0= ruleEInt ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_xPos_2_0 = null;

        AntlrDatatypeRuleToken lv_yPos_4_0 = null;



        	enterRule();

        try {
            // InternalRobot.g:280:2: ( ( () otherlv_1= 'initial' ( (lv_xPos_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_yPos_4_0= ruleEInt ) ) ) )
            // InternalRobot.g:281:2: ( () otherlv_1= 'initial' ( (lv_xPos_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_yPos_4_0= ruleEInt ) ) )
            {
            // InternalRobot.g:281:2: ( () otherlv_1= 'initial' ( (lv_xPos_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_yPos_4_0= ruleEInt ) ) )
            // InternalRobot.g:282:3: () otherlv_1= 'initial' ( (lv_xPos_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_yPos_4_0= ruleEInt ) )
            {
            // InternalRobot.g:282:3: ()
            // InternalRobot.g:283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialAccess().getInitialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getInitialKeyword_1());
            		
            // InternalRobot.g:293:3: ( (lv_xPos_2_0= ruleEInt ) )
            // InternalRobot.g:294:4: (lv_xPos_2_0= ruleEInt )
            {
            // InternalRobot.g:294:4: (lv_xPos_2_0= ruleEInt )
            // InternalRobot.g:295:5: lv_xPos_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getXPosEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_xPos_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"xPos",
            						lv_xPos_2_0,
            						"nl.tue.dsldesign.robot.Robot.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getInitialAccess().getCommaKeyword_3());
            		
            // InternalRobot.g:316:3: ( (lv_yPos_4_0= ruleEInt ) )
            // InternalRobot.g:317:4: (lv_yPos_4_0= ruleEInt )
            {
            // InternalRobot.g:317:4: (lv_yPos_4_0= ruleEInt )
            // InternalRobot.g:318:5: lv_yPos_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getYPosEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_yPos_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"yPos",
            						lv_yPos_4_0,
            						"nl.tue.dsldesign.robot.Robot.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleEInt"
    // InternalRobot.g:339:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRobot.g:339:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRobot.g:340:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalRobot.g:346:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRobot.g:352:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRobot.g:353:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRobot.g:353:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRobot.g:354:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRobot.g:354:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRobot.g:355:4: kw= '-'
                    {
                    kw=(Token)match(input,15,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleDirection"
    // InternalRobot.g:372:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRobot.g:378:2: ( ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) )
            // InternalRobot.g:379:2: ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalRobot.g:379:2: ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRobot.g:380:3: (enumLiteral_0= 'up' )
                    {
                    // InternalRobot.g:380:3: (enumLiteral_0= 'up' )
                    // InternalRobot.g:381:4: enumLiteral_0= 'up'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getUpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getUpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRobot.g:388:3: (enumLiteral_1= 'down' )
                    {
                    // InternalRobot.g:388:3: (enumLiteral_1= 'down' )
                    // InternalRobot.g:389:4: enumLiteral_1= 'down'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getDownEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getDownEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRobot.g:396:3: (enumLiteral_2= 'left' )
                    {
                    // InternalRobot.g:396:3: (enumLiteral_2= 'left' )
                    // InternalRobot.g:397:4: enumLiteral_2= 'left'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDirectionAccess().getLeftEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRobot.g:404:3: (enumLiteral_3= 'right' )
                    {
                    // InternalRobot.g:404:3: (enumLiteral_3= 'right' )
                    // InternalRobot.g:405:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDirectionAccess().getRightEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000F3000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F1000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}