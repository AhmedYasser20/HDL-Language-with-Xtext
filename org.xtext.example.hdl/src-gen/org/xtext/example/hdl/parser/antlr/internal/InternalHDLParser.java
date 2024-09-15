package org.xtext.example.hdl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.hdl.services.HDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Architecture", "SIGNAL", "Entity", "Begin", "End", "LessThanSignEqualsSign", "Is", "Of", "Colon", "Semicolon", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=6;
    public static final int Is=10;
    public static final int RULE_STRING=16;
    public static final int RULE_SL_COMMENT=18;
    public static final int Begin=7;
    public static final int LessThanSignEqualsSign=9;
    public static final int Colon=12;
    public static final int EOF=-1;
    public static final int SIGNAL=5;
    public static final int Architecture=4;
    public static final int RULE_ID=14;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int Semicolon=13;
    public static final int RULE_INT=15;
    public static final int Of=11;
    public static final int RULE_ML_COMMENT=17;
    public static final int End=8;

    // delegates
    // delegators


        public InternalHDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHDLParser.g"; }



     	private HDLGrammarAccess grammarAccess;

        public InternalHDLParser(TokenStream input, HDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected HDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalHDLParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalHDLParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalHDLParser.g:58:2: iv_ruleModel= ruleModel EOF
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
    // InternalHDLParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_entityDecl_0_0= ruleentity_decl ) ) ( (lv_archDecl_1_0= rulearch_decl ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entityDecl_0_0 = null;

        EObject lv_archDecl_1_0 = null;



        	enterRule();

        try {
            // InternalHDLParser.g:70:2: ( ( ( (lv_entityDecl_0_0= ruleentity_decl ) ) ( (lv_archDecl_1_0= rulearch_decl ) ) ) )
            // InternalHDLParser.g:71:2: ( ( (lv_entityDecl_0_0= ruleentity_decl ) ) ( (lv_archDecl_1_0= rulearch_decl ) ) )
            {
            // InternalHDLParser.g:71:2: ( ( (lv_entityDecl_0_0= ruleentity_decl ) ) ( (lv_archDecl_1_0= rulearch_decl ) ) )
            // InternalHDLParser.g:72:3: ( (lv_entityDecl_0_0= ruleentity_decl ) ) ( (lv_archDecl_1_0= rulearch_decl ) )
            {
            // InternalHDLParser.g:72:3: ( (lv_entityDecl_0_0= ruleentity_decl ) )
            // InternalHDLParser.g:73:4: (lv_entityDecl_0_0= ruleentity_decl )
            {
            // InternalHDLParser.g:73:4: (lv_entityDecl_0_0= ruleentity_decl )
            // InternalHDLParser.g:74:5: lv_entityDecl_0_0= ruleentity_decl
            {

            					newCompositeNode(grammarAccess.getModelAccess().getEntityDeclEntity_declParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entityDecl_0_0=ruleentity_decl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"entityDecl",
            						lv_entityDecl_0_0,
            						"org.xtext.example.hdl.HDL.entity_decl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHDLParser.g:91:3: ( (lv_archDecl_1_0= rulearch_decl ) )
            // InternalHDLParser.g:92:4: (lv_archDecl_1_0= rulearch_decl )
            {
            // InternalHDLParser.g:92:4: (lv_archDecl_1_0= rulearch_decl )
            // InternalHDLParser.g:93:5: lv_archDecl_1_0= rulearch_decl
            {

            					newCompositeNode(grammarAccess.getModelAccess().getArchDeclArch_declParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_archDecl_1_0=rulearch_decl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"archDecl",
            						lv_archDecl_1_0,
            						"org.xtext.example.hdl.HDL.arch_decl");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleentity_decl"
    // InternalHDLParser.g:114:1: entryRuleentity_decl returns [EObject current=null] : iv_ruleentity_decl= ruleentity_decl EOF ;
    public final EObject entryRuleentity_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentity_decl = null;


        try {
            // InternalHDLParser.g:114:52: (iv_ruleentity_decl= ruleentity_decl EOF )
            // InternalHDLParser.g:115:2: iv_ruleentity_decl= ruleentity_decl EOF
            {
             newCompositeNode(grammarAccess.getEntity_declRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleentity_decl=ruleentity_decl();

            state._fsp--;

             current =iv_ruleentity_decl; 
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
    // $ANTLR end "entryRuleentity_decl"


    // $ANTLR start "ruleentity_decl"
    // InternalHDLParser.g:121:1: ruleentity_decl returns [EObject current=null] : (otherlv_0= Entity ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Is otherlv_3= End otherlv_4= Semicolon ) ;
    public final EObject ruleentity_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalHDLParser.g:127:2: ( (otherlv_0= Entity ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Is otherlv_3= End otherlv_4= Semicolon ) )
            // InternalHDLParser.g:128:2: (otherlv_0= Entity ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Is otherlv_3= End otherlv_4= Semicolon )
            {
            // InternalHDLParser.g:128:2: (otherlv_0= Entity ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Is otherlv_3= End otherlv_4= Semicolon )
            // InternalHDLParser.g:129:3: otherlv_0= Entity ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Is otherlv_3= End otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Entity,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntity_declAccess().getEntityKeyword_0());
            		
            // InternalHDLParser.g:133:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHDLParser.g:134:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHDLParser.g:134:4: (lv_name_1_0= RULE_ID )
            // InternalHDLParser.g:135:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntity_declAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntity_declRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Is,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntity_declAccess().getIsKeyword_2());
            		
            otherlv_3=(Token)match(input,End,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEntity_declAccess().getEndKeyword_3());
            		
            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntity_declAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleentity_decl"


    // $ANTLR start "entryRulearch_decl"
    // InternalHDLParser.g:167:1: entryRulearch_decl returns [EObject current=null] : iv_rulearch_decl= rulearch_decl EOF ;
    public final EObject entryRulearch_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearch_decl = null;


        try {
            // InternalHDLParser.g:167:50: (iv_rulearch_decl= rulearch_decl EOF )
            // InternalHDLParser.g:168:2: iv_rulearch_decl= rulearch_decl EOF
            {
             newCompositeNode(grammarAccess.getArch_declRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearch_decl=rulearch_decl();

            state._fsp--;

             current =iv_rulearch_decl; 
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
    // $ANTLR end "entryRulearch_decl"


    // $ANTLR start "rulearch_decl"
    // InternalHDLParser.g:174:1: rulearch_decl returns [EObject current=null] : (otherlv_0= Architecture this_ID_1= RULE_ID otherlv_2= Of ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_signalDecls_5_0= rulesignal_decl ) )* otherlv_6= Begin ( (lv_signalAssign_7_0= rulesignal_assign ) )* otherlv_8= End otherlv_9= Semicolon ) ;
    public final EObject rulearch_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_signalDecls_5_0 = null;

        EObject lv_signalAssign_7_0 = null;



        	enterRule();

        try {
            // InternalHDLParser.g:180:2: ( (otherlv_0= Architecture this_ID_1= RULE_ID otherlv_2= Of ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_signalDecls_5_0= rulesignal_decl ) )* otherlv_6= Begin ( (lv_signalAssign_7_0= rulesignal_assign ) )* otherlv_8= End otherlv_9= Semicolon ) )
            // InternalHDLParser.g:181:2: (otherlv_0= Architecture this_ID_1= RULE_ID otherlv_2= Of ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_signalDecls_5_0= rulesignal_decl ) )* otherlv_6= Begin ( (lv_signalAssign_7_0= rulesignal_assign ) )* otherlv_8= End otherlv_9= Semicolon )
            {
            // InternalHDLParser.g:181:2: (otherlv_0= Architecture this_ID_1= RULE_ID otherlv_2= Of ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_signalDecls_5_0= rulesignal_decl ) )* otherlv_6= Begin ( (lv_signalAssign_7_0= rulesignal_assign ) )* otherlv_8= End otherlv_9= Semicolon )
            // InternalHDLParser.g:182:3: otherlv_0= Architecture this_ID_1= RULE_ID otherlv_2= Of ( (otherlv_3= RULE_ID ) ) otherlv_4= Is ( (lv_signalDecls_5_0= rulesignal_decl ) )* otherlv_6= Begin ( (lv_signalAssign_7_0= rulesignal_assign ) )* otherlv_8= End otherlv_9= Semicolon
            {
            otherlv_0=(Token)match(input,Architecture,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArch_declAccess().getArchitectureKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_8); 

            			newLeafNode(this_ID_1, grammarAccess.getArch_declAccess().getIDTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Of,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getArch_declAccess().getOfKeyword_2());
            		
            // InternalHDLParser.g:194:3: ( (otherlv_3= RULE_ID ) )
            // InternalHDLParser.g:195:4: (otherlv_3= RULE_ID )
            {
            // InternalHDLParser.g:195:4: (otherlv_3= RULE_ID )
            // InternalHDLParser.g:196:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArch_declRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_3, grammarAccess.getArch_declAccess().getEntityIdPTEntityDeclCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,Is,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getArch_declAccess().getIsKeyword_4());
            		
            // InternalHDLParser.g:211:3: ( (lv_signalDecls_5_0= rulesignal_decl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SIGNAL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHDLParser.g:212:4: (lv_signalDecls_5_0= rulesignal_decl )
            	    {
            	    // InternalHDLParser.g:212:4: (lv_signalDecls_5_0= rulesignal_decl )
            	    // InternalHDLParser.g:213:5: lv_signalDecls_5_0= rulesignal_decl
            	    {

            	    					newCompositeNode(grammarAccess.getArch_declAccess().getSignalDeclsSignal_declParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_signalDecls_5_0=rulesignal_decl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArch_declRule());
            	    					}
            	    					add(
            	    						current,
            	    						"signalDecls",
            	    						lv_signalDecls_5_0,
            	    						"org.xtext.example.hdl.HDL.signal_decl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,Begin,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getArch_declAccess().getBeginKeyword_6());
            		
            // InternalHDLParser.g:234:3: ( (lv_signalAssign_7_0= rulesignal_assign ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHDLParser.g:235:4: (lv_signalAssign_7_0= rulesignal_assign )
            	    {
            	    // InternalHDLParser.g:235:4: (lv_signalAssign_7_0= rulesignal_assign )
            	    // InternalHDLParser.g:236:5: lv_signalAssign_7_0= rulesignal_assign
            	    {

            	    					newCompositeNode(grammarAccess.getArch_declAccess().getSignalAssignSignal_assignParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_signalAssign_7_0=rulesignal_assign();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArch_declRule());
            	    					}
            	    					add(
            	    						current,
            	    						"signalAssign",
            	    						lv_signalAssign_7_0,
            	    						"org.xtext.example.hdl.HDL.signal_assign");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_8=(Token)match(input,End,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getArch_declAccess().getEndKeyword_8());
            		
            otherlv_9=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getArch_declAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "rulearch_decl"


    // $ANTLR start "entryRulesignal_decl"
    // InternalHDLParser.g:265:1: entryRulesignal_decl returns [EObject current=null] : iv_rulesignal_decl= rulesignal_decl EOF ;
    public final EObject entryRulesignal_decl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignal_decl = null;


        try {
            // InternalHDLParser.g:265:52: (iv_rulesignal_decl= rulesignal_decl EOF )
            // InternalHDLParser.g:266:2: iv_rulesignal_decl= rulesignal_decl EOF
            {
             newCompositeNode(grammarAccess.getSignal_declRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesignal_decl=rulesignal_decl();

            state._fsp--;

             current =iv_rulesignal_decl; 
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
    // $ANTLR end "entryRulesignal_decl"


    // $ANTLR start "rulesignal_decl"
    // InternalHDLParser.g:272:1: rulesignal_decl returns [EObject current=null] : (otherlv_0= SIGNAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_signalType_3_0= RULE_ID ) ) otherlv_4= Semicolon ) ;
    public final EObject rulesignal_decl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_signalType_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalHDLParser.g:278:2: ( (otherlv_0= SIGNAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_signalType_3_0= RULE_ID ) ) otherlv_4= Semicolon ) )
            // InternalHDLParser.g:279:2: (otherlv_0= SIGNAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_signalType_3_0= RULE_ID ) ) otherlv_4= Semicolon )
            {
            // InternalHDLParser.g:279:2: (otherlv_0= SIGNAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_signalType_3_0= RULE_ID ) ) otherlv_4= Semicolon )
            // InternalHDLParser.g:280:3: otherlv_0= SIGNAL ( (lv_name_1_0= RULE_ID ) ) otherlv_2= Colon ( (lv_signalType_3_0= RULE_ID ) ) otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,SIGNAL,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSignal_declAccess().getSIGNALKeyword_0());
            		
            // InternalHDLParser.g:284:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHDLParser.g:285:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHDLParser.g:285:4: (lv_name_1_0= RULE_ID )
            // InternalHDLParser.g:286:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSignal_declAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignal_declRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSignal_declAccess().getColonKeyword_2());
            		
            // InternalHDLParser.g:306:3: ( (lv_signalType_3_0= RULE_ID ) )
            // InternalHDLParser.g:307:4: (lv_signalType_3_0= RULE_ID )
            {
            // InternalHDLParser.g:307:4: (lv_signalType_3_0= RULE_ID )
            // InternalHDLParser.g:308:5: lv_signalType_3_0= RULE_ID
            {
            lv_signalType_3_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_signalType_3_0, grammarAccess.getSignal_declAccess().getSignalTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignal_declRule());
            					}
            					setWithLastConsumed(
            						current,
            						"signalType",
            						lv_signalType_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSignal_declAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "rulesignal_decl"


    // $ANTLR start "entryRulesignal_assign"
    // InternalHDLParser.g:332:1: entryRulesignal_assign returns [EObject current=null] : iv_rulesignal_assign= rulesignal_assign EOF ;
    public final EObject entryRulesignal_assign() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesignal_assign = null;


        try {
            // InternalHDLParser.g:332:54: (iv_rulesignal_assign= rulesignal_assign EOF )
            // InternalHDLParser.g:333:2: iv_rulesignal_assign= rulesignal_assign EOF
            {
             newCompositeNode(grammarAccess.getSignal_assignRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesignal_assign=rulesignal_assign();

            state._fsp--;

             current =iv_rulesignal_assign; 
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
    // $ANTLR end "entryRulesignal_assign"


    // $ANTLR start "rulesignal_assign"
    // InternalHDLParser.g:339:1: rulesignal_assign returns [EObject current=null] : ( ( (lv_lhs_0_0= rulelhs ) ) otherlv_1= LessThanSignEqualsSign ( (lv_rhs_2_0= rulerhs ) ) otherlv_3= Semicolon ) ;
    public final EObject rulesignal_assign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalHDLParser.g:345:2: ( ( ( (lv_lhs_0_0= rulelhs ) ) otherlv_1= LessThanSignEqualsSign ( (lv_rhs_2_0= rulerhs ) ) otherlv_3= Semicolon ) )
            // InternalHDLParser.g:346:2: ( ( (lv_lhs_0_0= rulelhs ) ) otherlv_1= LessThanSignEqualsSign ( (lv_rhs_2_0= rulerhs ) ) otherlv_3= Semicolon )
            {
            // InternalHDLParser.g:346:2: ( ( (lv_lhs_0_0= rulelhs ) ) otherlv_1= LessThanSignEqualsSign ( (lv_rhs_2_0= rulerhs ) ) otherlv_3= Semicolon )
            // InternalHDLParser.g:347:3: ( (lv_lhs_0_0= rulelhs ) ) otherlv_1= LessThanSignEqualsSign ( (lv_rhs_2_0= rulerhs ) ) otherlv_3= Semicolon
            {
            // InternalHDLParser.g:347:3: ( (lv_lhs_0_0= rulelhs ) )
            // InternalHDLParser.g:348:4: (lv_lhs_0_0= rulelhs )
            {
            // InternalHDLParser.g:348:4: (lv_lhs_0_0= rulelhs )
            // InternalHDLParser.g:349:5: lv_lhs_0_0= rulelhs
            {

            					newCompositeNode(grammarAccess.getSignal_assignAccess().getLhsLhsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_lhs_0_0=rulelhs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignal_assignRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.hdl.HDL.lhs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,LessThanSignEqualsSign,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSignal_assignAccess().getLessThanSignEqualsSignKeyword_1());
            		
            // InternalHDLParser.g:370:3: ( (lv_rhs_2_0= rulerhs ) )
            // InternalHDLParser.g:371:4: (lv_rhs_2_0= rulerhs )
            {
            // InternalHDLParser.g:371:4: (lv_rhs_2_0= rulerhs )
            // InternalHDLParser.g:372:5: lv_rhs_2_0= rulerhs
            {

            					newCompositeNode(grammarAccess.getSignal_assignAccess().getRhsRhsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_rhs_2_0=rulerhs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSignal_assignRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_2_0,
            						"org.xtext.example.hdl.HDL.rhs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSignal_assignAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulesignal_assign"


    // $ANTLR start "entryRulelhs"
    // InternalHDLParser.g:397:1: entryRulelhs returns [EObject current=null] : iv_rulelhs= rulelhs EOF ;
    public final EObject entryRulelhs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelhs = null;


        try {
            // InternalHDLParser.g:397:44: (iv_rulelhs= rulelhs EOF )
            // InternalHDLParser.g:398:2: iv_rulelhs= rulelhs EOF
            {
             newCompositeNode(grammarAccess.getLhsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelhs=rulelhs();

            state._fsp--;

             current =iv_rulelhs; 
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
    // $ANTLR end "entryRulelhs"


    // $ANTLR start "rulelhs"
    // InternalHDLParser.g:404:1: rulelhs returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulelhs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalHDLParser.g:410:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalHDLParser.g:411:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalHDLParser.g:411:2: ( (otherlv_0= RULE_ID ) )
            // InternalHDLParser.g:412:3: (otherlv_0= RULE_ID )
            {
            // InternalHDLParser.g:412:3: (otherlv_0= RULE_ID )
            // InternalHDLParser.g:413:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLhsRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getLhsAccess().getIdPTSignalDeclCrossReference_0());
            			

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
    // $ANTLR end "rulelhs"


    // $ANTLR start "entryRulerhs"
    // InternalHDLParser.g:427:1: entryRulerhs returns [EObject current=null] : iv_rulerhs= rulerhs EOF ;
    public final EObject entryRulerhs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerhs = null;


        try {
            // InternalHDLParser.g:427:44: (iv_rulerhs= rulerhs EOF )
            // InternalHDLParser.g:428:2: iv_rulerhs= rulerhs EOF
            {
             newCompositeNode(grammarAccess.getRhsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerhs=rulerhs();

            state._fsp--;

             current =iv_rulerhs; 
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
    // $ANTLR end "entryRulerhs"


    // $ANTLR start "rulerhs"
    // InternalHDLParser.g:434:1: rulerhs returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulerhs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalHDLParser.g:440:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalHDLParser.g:441:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalHDLParser.g:441:2: ( (otherlv_0= RULE_ID ) )
            // InternalHDLParser.g:442:3: (otherlv_0= RULE_ID )
            {
            // InternalHDLParser.g:442:3: (otherlv_0= RULE_ID )
            // InternalHDLParser.g:443:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRhsRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRhsAccess().getIdPTSignalDeclCrossReference_0());
            			

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
    // $ANTLR end "rulerhs"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});

}