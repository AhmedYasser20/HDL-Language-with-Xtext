package org.xtext.example.hdl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.hdl.services.HDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHDLParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("Is", "'is'");
    		tokenNameToValue.put("Of", "'of'");
    		tokenNameToValue.put("End", "'end'");
    		tokenNameToValue.put("Begin", "'begin'");
    		tokenNameToValue.put("SIGNAL", "'SIGNAL'");
    		tokenNameToValue.put("Entity", "'entity'");
    		tokenNameToValue.put("Architecture", "'architecture'");
    	}

    	public void setGrammarAccess(HDLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalHDLParser.g:65:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalHDLParser.g:66:1: ( ruleModel EOF )
            // InternalHDLParser.g:67:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalHDLParser.g:74:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:78:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalHDLParser.g:79:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalHDLParser.g:79:2: ( ( rule__Model__Group__0 ) )
            // InternalHDLParser.g:80:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalHDLParser.g:81:3: ( rule__Model__Group__0 )
            // InternalHDLParser.g:81:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleentity_decl"
    // InternalHDLParser.g:90:1: entryRuleentity_decl : ruleentity_decl EOF ;
    public final void entryRuleentity_decl() throws RecognitionException {
        try {
            // InternalHDLParser.g:91:1: ( ruleentity_decl EOF )
            // InternalHDLParser.g:92:1: ruleentity_decl EOF
            {
             before(grammarAccess.getEntity_declRule()); 
            pushFollow(FOLLOW_1);
            ruleentity_decl();

            state._fsp--;

             after(grammarAccess.getEntity_declRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleentity_decl"


    // $ANTLR start "ruleentity_decl"
    // InternalHDLParser.g:99:1: ruleentity_decl : ( ( rule__Entity_decl__Group__0 ) ) ;
    public final void ruleentity_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:103:2: ( ( ( rule__Entity_decl__Group__0 ) ) )
            // InternalHDLParser.g:104:2: ( ( rule__Entity_decl__Group__0 ) )
            {
            // InternalHDLParser.g:104:2: ( ( rule__Entity_decl__Group__0 ) )
            // InternalHDLParser.g:105:3: ( rule__Entity_decl__Group__0 )
            {
             before(grammarAccess.getEntity_declAccess().getGroup()); 
            // InternalHDLParser.g:106:3: ( rule__Entity_decl__Group__0 )
            // InternalHDLParser.g:106:4: rule__Entity_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity_decl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntity_declAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleentity_decl"


    // $ANTLR start "entryRulearch_decl"
    // InternalHDLParser.g:115:1: entryRulearch_decl : rulearch_decl EOF ;
    public final void entryRulearch_decl() throws RecognitionException {
        try {
            // InternalHDLParser.g:116:1: ( rulearch_decl EOF )
            // InternalHDLParser.g:117:1: rulearch_decl EOF
            {
             before(grammarAccess.getArch_declRule()); 
            pushFollow(FOLLOW_1);
            rulearch_decl();

            state._fsp--;

             after(grammarAccess.getArch_declRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulearch_decl"


    // $ANTLR start "rulearch_decl"
    // InternalHDLParser.g:124:1: rulearch_decl : ( ( rule__Arch_decl__Group__0 ) ) ;
    public final void rulearch_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:128:2: ( ( ( rule__Arch_decl__Group__0 ) ) )
            // InternalHDLParser.g:129:2: ( ( rule__Arch_decl__Group__0 ) )
            {
            // InternalHDLParser.g:129:2: ( ( rule__Arch_decl__Group__0 ) )
            // InternalHDLParser.g:130:3: ( rule__Arch_decl__Group__0 )
            {
             before(grammarAccess.getArch_declAccess().getGroup()); 
            // InternalHDLParser.g:131:3: ( rule__Arch_decl__Group__0 )
            // InternalHDLParser.g:131:4: rule__Arch_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArch_declAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulearch_decl"


    // $ANTLR start "entryRulesignal_decl"
    // InternalHDLParser.g:140:1: entryRulesignal_decl : rulesignal_decl EOF ;
    public final void entryRulesignal_decl() throws RecognitionException {
        try {
            // InternalHDLParser.g:141:1: ( rulesignal_decl EOF )
            // InternalHDLParser.g:142:1: rulesignal_decl EOF
            {
             before(grammarAccess.getSignal_declRule()); 
            pushFollow(FOLLOW_1);
            rulesignal_decl();

            state._fsp--;

             after(grammarAccess.getSignal_declRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesignal_decl"


    // $ANTLR start "rulesignal_decl"
    // InternalHDLParser.g:149:1: rulesignal_decl : ( ( rule__Signal_decl__Group__0 ) ) ;
    public final void rulesignal_decl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:153:2: ( ( ( rule__Signal_decl__Group__0 ) ) )
            // InternalHDLParser.g:154:2: ( ( rule__Signal_decl__Group__0 ) )
            {
            // InternalHDLParser.g:154:2: ( ( rule__Signal_decl__Group__0 ) )
            // InternalHDLParser.g:155:3: ( rule__Signal_decl__Group__0 )
            {
             before(grammarAccess.getSignal_declAccess().getGroup()); 
            // InternalHDLParser.g:156:3: ( rule__Signal_decl__Group__0 )
            // InternalHDLParser.g:156:4: rule__Signal_decl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signal_decl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignal_declAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesignal_decl"


    // $ANTLR start "entryRulesignal_assign"
    // InternalHDLParser.g:165:1: entryRulesignal_assign : rulesignal_assign EOF ;
    public final void entryRulesignal_assign() throws RecognitionException {
        try {
            // InternalHDLParser.g:166:1: ( rulesignal_assign EOF )
            // InternalHDLParser.g:167:1: rulesignal_assign EOF
            {
             before(grammarAccess.getSignal_assignRule()); 
            pushFollow(FOLLOW_1);
            rulesignal_assign();

            state._fsp--;

             after(grammarAccess.getSignal_assignRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesignal_assign"


    // $ANTLR start "rulesignal_assign"
    // InternalHDLParser.g:174:1: rulesignal_assign : ( ( rule__Signal_assign__Group__0 ) ) ;
    public final void rulesignal_assign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:178:2: ( ( ( rule__Signal_assign__Group__0 ) ) )
            // InternalHDLParser.g:179:2: ( ( rule__Signal_assign__Group__0 ) )
            {
            // InternalHDLParser.g:179:2: ( ( rule__Signal_assign__Group__0 ) )
            // InternalHDLParser.g:180:3: ( rule__Signal_assign__Group__0 )
            {
             before(grammarAccess.getSignal_assignAccess().getGroup()); 
            // InternalHDLParser.g:181:3: ( rule__Signal_assign__Group__0 )
            // InternalHDLParser.g:181:4: rule__Signal_assign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signal_assign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignal_assignAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesignal_assign"


    // $ANTLR start "entryRulelhs"
    // InternalHDLParser.g:190:1: entryRulelhs : rulelhs EOF ;
    public final void entryRulelhs() throws RecognitionException {
        try {
            // InternalHDLParser.g:191:1: ( rulelhs EOF )
            // InternalHDLParser.g:192:1: rulelhs EOF
            {
             before(grammarAccess.getLhsRule()); 
            pushFollow(FOLLOW_1);
            rulelhs();

            state._fsp--;

             after(grammarAccess.getLhsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelhs"


    // $ANTLR start "rulelhs"
    // InternalHDLParser.g:199:1: rulelhs : ( ( rule__Lhs__IdAssignment ) ) ;
    public final void rulelhs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:203:2: ( ( ( rule__Lhs__IdAssignment ) ) )
            // InternalHDLParser.g:204:2: ( ( rule__Lhs__IdAssignment ) )
            {
            // InternalHDLParser.g:204:2: ( ( rule__Lhs__IdAssignment ) )
            // InternalHDLParser.g:205:3: ( rule__Lhs__IdAssignment )
            {
             before(grammarAccess.getLhsAccess().getIdAssignment()); 
            // InternalHDLParser.g:206:3: ( rule__Lhs__IdAssignment )
            // InternalHDLParser.g:206:4: rule__Lhs__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Lhs__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLhsAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelhs"


    // $ANTLR start "entryRulerhs"
    // InternalHDLParser.g:215:1: entryRulerhs : rulerhs EOF ;
    public final void entryRulerhs() throws RecognitionException {
        try {
            // InternalHDLParser.g:216:1: ( rulerhs EOF )
            // InternalHDLParser.g:217:1: rulerhs EOF
            {
             before(grammarAccess.getRhsRule()); 
            pushFollow(FOLLOW_1);
            rulerhs();

            state._fsp--;

             after(grammarAccess.getRhsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerhs"


    // $ANTLR start "rulerhs"
    // InternalHDLParser.g:224:1: rulerhs : ( ( rule__Rhs__IdAssignment ) ) ;
    public final void rulerhs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:228:2: ( ( ( rule__Rhs__IdAssignment ) ) )
            // InternalHDLParser.g:229:2: ( ( rule__Rhs__IdAssignment ) )
            {
            // InternalHDLParser.g:229:2: ( ( rule__Rhs__IdAssignment ) )
            // InternalHDLParser.g:230:3: ( rule__Rhs__IdAssignment )
            {
             before(grammarAccess.getRhsAccess().getIdAssignment()); 
            // InternalHDLParser.g:231:3: ( rule__Rhs__IdAssignment )
            // InternalHDLParser.g:231:4: rule__Rhs__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Rhs__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRhsAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerhs"


    // $ANTLR start "rule__Model__Group__0"
    // InternalHDLParser.g:239:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:243:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalHDLParser.g:244:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalHDLParser.g:251:1: rule__Model__Group__0__Impl : ( ( rule__Model__EntityDeclAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:255:1: ( ( ( rule__Model__EntityDeclAssignment_0 ) ) )
            // InternalHDLParser.g:256:1: ( ( rule__Model__EntityDeclAssignment_0 ) )
            {
            // InternalHDLParser.g:256:1: ( ( rule__Model__EntityDeclAssignment_0 ) )
            // InternalHDLParser.g:257:2: ( rule__Model__EntityDeclAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getEntityDeclAssignment_0()); 
            // InternalHDLParser.g:258:2: ( rule__Model__EntityDeclAssignment_0 )
            // InternalHDLParser.g:258:3: rule__Model__EntityDeclAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__EntityDeclAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEntityDeclAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalHDLParser.g:266:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:270:1: ( rule__Model__Group__1__Impl )
            // InternalHDLParser.g:271:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalHDLParser.g:277:1: rule__Model__Group__1__Impl : ( ( rule__Model__ArchDeclAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:281:1: ( ( ( rule__Model__ArchDeclAssignment_1 ) ) )
            // InternalHDLParser.g:282:1: ( ( rule__Model__ArchDeclAssignment_1 ) )
            {
            // InternalHDLParser.g:282:1: ( ( rule__Model__ArchDeclAssignment_1 ) )
            // InternalHDLParser.g:283:2: ( rule__Model__ArchDeclAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getArchDeclAssignment_1()); 
            // InternalHDLParser.g:284:2: ( rule__Model__ArchDeclAssignment_1 )
            // InternalHDLParser.g:284:3: rule__Model__ArchDeclAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ArchDeclAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getArchDeclAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Entity_decl__Group__0"
    // InternalHDLParser.g:293:1: rule__Entity_decl__Group__0 : rule__Entity_decl__Group__0__Impl rule__Entity_decl__Group__1 ;
    public final void rule__Entity_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:297:1: ( rule__Entity_decl__Group__0__Impl rule__Entity_decl__Group__1 )
            // InternalHDLParser.g:298:2: rule__Entity_decl__Group__0__Impl rule__Entity_decl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity_decl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity_decl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__0"


    // $ANTLR start "rule__Entity_decl__Group__0__Impl"
    // InternalHDLParser.g:305:1: rule__Entity_decl__Group__0__Impl : ( Entity ) ;
    public final void rule__Entity_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:309:1: ( ( Entity ) )
            // InternalHDLParser.g:310:1: ( Entity )
            {
            // InternalHDLParser.g:310:1: ( Entity )
            // InternalHDLParser.g:311:2: Entity
            {
             before(grammarAccess.getEntity_declAccess().getEntityKeyword_0()); 
            match(input,Entity,FOLLOW_2); 
             after(grammarAccess.getEntity_declAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__0__Impl"


    // $ANTLR start "rule__Entity_decl__Group__1"
    // InternalHDLParser.g:320:1: rule__Entity_decl__Group__1 : rule__Entity_decl__Group__1__Impl rule__Entity_decl__Group__2 ;
    public final void rule__Entity_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:324:1: ( rule__Entity_decl__Group__1__Impl rule__Entity_decl__Group__2 )
            // InternalHDLParser.g:325:2: rule__Entity_decl__Group__1__Impl rule__Entity_decl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity_decl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity_decl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__1"


    // $ANTLR start "rule__Entity_decl__Group__1__Impl"
    // InternalHDLParser.g:332:1: rule__Entity_decl__Group__1__Impl : ( ( rule__Entity_decl__NameAssignment_1 ) ) ;
    public final void rule__Entity_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:336:1: ( ( ( rule__Entity_decl__NameAssignment_1 ) ) )
            // InternalHDLParser.g:337:1: ( ( rule__Entity_decl__NameAssignment_1 ) )
            {
            // InternalHDLParser.g:337:1: ( ( rule__Entity_decl__NameAssignment_1 ) )
            // InternalHDLParser.g:338:2: ( rule__Entity_decl__NameAssignment_1 )
            {
             before(grammarAccess.getEntity_declAccess().getNameAssignment_1()); 
            // InternalHDLParser.g:339:2: ( rule__Entity_decl__NameAssignment_1 )
            // InternalHDLParser.g:339:3: rule__Entity_decl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity_decl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntity_declAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__1__Impl"


    // $ANTLR start "rule__Entity_decl__Group__2"
    // InternalHDLParser.g:347:1: rule__Entity_decl__Group__2 : rule__Entity_decl__Group__2__Impl rule__Entity_decl__Group__3 ;
    public final void rule__Entity_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:351:1: ( rule__Entity_decl__Group__2__Impl rule__Entity_decl__Group__3 )
            // InternalHDLParser.g:352:2: rule__Entity_decl__Group__2__Impl rule__Entity_decl__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Entity_decl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity_decl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__2"


    // $ANTLR start "rule__Entity_decl__Group__2__Impl"
    // InternalHDLParser.g:359:1: rule__Entity_decl__Group__2__Impl : ( Is ) ;
    public final void rule__Entity_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:363:1: ( ( Is ) )
            // InternalHDLParser.g:364:1: ( Is )
            {
            // InternalHDLParser.g:364:1: ( Is )
            // InternalHDLParser.g:365:2: Is
            {
             before(grammarAccess.getEntity_declAccess().getIsKeyword_2()); 
            match(input,Is,FOLLOW_2); 
             after(grammarAccess.getEntity_declAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__2__Impl"


    // $ANTLR start "rule__Entity_decl__Group__3"
    // InternalHDLParser.g:374:1: rule__Entity_decl__Group__3 : rule__Entity_decl__Group__3__Impl rule__Entity_decl__Group__4 ;
    public final void rule__Entity_decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:378:1: ( rule__Entity_decl__Group__3__Impl rule__Entity_decl__Group__4 )
            // InternalHDLParser.g:379:2: rule__Entity_decl__Group__3__Impl rule__Entity_decl__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Entity_decl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity_decl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__3"


    // $ANTLR start "rule__Entity_decl__Group__3__Impl"
    // InternalHDLParser.g:386:1: rule__Entity_decl__Group__3__Impl : ( End ) ;
    public final void rule__Entity_decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:390:1: ( ( End ) )
            // InternalHDLParser.g:391:1: ( End )
            {
            // InternalHDLParser.g:391:1: ( End )
            // InternalHDLParser.g:392:2: End
            {
             before(grammarAccess.getEntity_declAccess().getEndKeyword_3()); 
            match(input,End,FOLLOW_2); 
             after(grammarAccess.getEntity_declAccess().getEndKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__3__Impl"


    // $ANTLR start "rule__Entity_decl__Group__4"
    // InternalHDLParser.g:401:1: rule__Entity_decl__Group__4 : rule__Entity_decl__Group__4__Impl ;
    public final void rule__Entity_decl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:405:1: ( rule__Entity_decl__Group__4__Impl )
            // InternalHDLParser.g:406:2: rule__Entity_decl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity_decl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__4"


    // $ANTLR start "rule__Entity_decl__Group__4__Impl"
    // InternalHDLParser.g:412:1: rule__Entity_decl__Group__4__Impl : ( Semicolon ) ;
    public final void rule__Entity_decl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:416:1: ( ( Semicolon ) )
            // InternalHDLParser.g:417:1: ( Semicolon )
            {
            // InternalHDLParser.g:417:1: ( Semicolon )
            // InternalHDLParser.g:418:2: Semicolon
            {
             before(grammarAccess.getEntity_declAccess().getSemicolonKeyword_4()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getEntity_declAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__Group__4__Impl"


    // $ANTLR start "rule__Arch_decl__Group__0"
    // InternalHDLParser.g:428:1: rule__Arch_decl__Group__0 : rule__Arch_decl__Group__0__Impl rule__Arch_decl__Group__1 ;
    public final void rule__Arch_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:432:1: ( rule__Arch_decl__Group__0__Impl rule__Arch_decl__Group__1 )
            // InternalHDLParser.g:433:2: rule__Arch_decl__Group__0__Impl rule__Arch_decl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Arch_decl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__0"


    // $ANTLR start "rule__Arch_decl__Group__0__Impl"
    // InternalHDLParser.g:440:1: rule__Arch_decl__Group__0__Impl : ( Architecture ) ;
    public final void rule__Arch_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:444:1: ( ( Architecture ) )
            // InternalHDLParser.g:445:1: ( Architecture )
            {
            // InternalHDLParser.g:445:1: ( Architecture )
            // InternalHDLParser.g:446:2: Architecture
            {
             before(grammarAccess.getArch_declAccess().getArchitectureKeyword_0()); 
            match(input,Architecture,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getArchitectureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__0__Impl"


    // $ANTLR start "rule__Arch_decl__Group__1"
    // InternalHDLParser.g:455:1: rule__Arch_decl__Group__1 : rule__Arch_decl__Group__1__Impl rule__Arch_decl__Group__2 ;
    public final void rule__Arch_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:459:1: ( rule__Arch_decl__Group__1__Impl rule__Arch_decl__Group__2 )
            // InternalHDLParser.g:460:2: rule__Arch_decl__Group__1__Impl rule__Arch_decl__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Arch_decl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__1"


    // $ANTLR start "rule__Arch_decl__Group__1__Impl"
    // InternalHDLParser.g:467:1: rule__Arch_decl__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Arch_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:471:1: ( ( RULE_ID ) )
            // InternalHDLParser.g:472:1: ( RULE_ID )
            {
            // InternalHDLParser.g:472:1: ( RULE_ID )
            // InternalHDLParser.g:473:2: RULE_ID
            {
             before(grammarAccess.getArch_declAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__1__Impl"


    // $ANTLR start "rule__Arch_decl__Group__2"
    // InternalHDLParser.g:482:1: rule__Arch_decl__Group__2 : rule__Arch_decl__Group__2__Impl rule__Arch_decl__Group__3 ;
    public final void rule__Arch_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:486:1: ( rule__Arch_decl__Group__2__Impl rule__Arch_decl__Group__3 )
            // InternalHDLParser.g:487:2: rule__Arch_decl__Group__2__Impl rule__Arch_decl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Arch_decl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__2"


    // $ANTLR start "rule__Arch_decl__Group__2__Impl"
    // InternalHDLParser.g:494:1: rule__Arch_decl__Group__2__Impl : ( Of ) ;
    public final void rule__Arch_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:498:1: ( ( Of ) )
            // InternalHDLParser.g:499:1: ( Of )
            {
            // InternalHDLParser.g:499:1: ( Of )
            // InternalHDLParser.g:500:2: Of
            {
             before(grammarAccess.getArch_declAccess().getOfKeyword_2()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__2__Impl"


    // $ANTLR start "rule__Arch_decl__Group__3"
    // InternalHDLParser.g:509:1: rule__Arch_decl__Group__3 : rule__Arch_decl__Group__3__Impl rule__Arch_decl__Group__4 ;
    public final void rule__Arch_decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:513:1: ( rule__Arch_decl__Group__3__Impl rule__Arch_decl__Group__4 )
            // InternalHDLParser.g:514:2: rule__Arch_decl__Group__3__Impl rule__Arch_decl__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Arch_decl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__3"


    // $ANTLR start "rule__Arch_decl__Group__3__Impl"
    // InternalHDLParser.g:521:1: rule__Arch_decl__Group__3__Impl : ( ( rule__Arch_decl__EntityIdAssignment_3 ) ) ;
    public final void rule__Arch_decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:525:1: ( ( ( rule__Arch_decl__EntityIdAssignment_3 ) ) )
            // InternalHDLParser.g:526:1: ( ( rule__Arch_decl__EntityIdAssignment_3 ) )
            {
            // InternalHDLParser.g:526:1: ( ( rule__Arch_decl__EntityIdAssignment_3 ) )
            // InternalHDLParser.g:527:2: ( rule__Arch_decl__EntityIdAssignment_3 )
            {
             before(grammarAccess.getArch_declAccess().getEntityIdAssignment_3()); 
            // InternalHDLParser.g:528:2: ( rule__Arch_decl__EntityIdAssignment_3 )
            // InternalHDLParser.g:528:3: rule__Arch_decl__EntityIdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Arch_decl__EntityIdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArch_declAccess().getEntityIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__3__Impl"


    // $ANTLR start "rule__Arch_decl__Group__4"
    // InternalHDLParser.g:536:1: rule__Arch_decl__Group__4 : rule__Arch_decl__Group__4__Impl rule__Arch_decl__Group__5 ;
    public final void rule__Arch_decl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:540:1: ( rule__Arch_decl__Group__4__Impl rule__Arch_decl__Group__5 )
            // InternalHDLParser.g:541:2: rule__Arch_decl__Group__4__Impl rule__Arch_decl__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Arch_decl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__4"


    // $ANTLR start "rule__Arch_decl__Group__4__Impl"
    // InternalHDLParser.g:548:1: rule__Arch_decl__Group__4__Impl : ( Is ) ;
    public final void rule__Arch_decl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:552:1: ( ( Is ) )
            // InternalHDLParser.g:553:1: ( Is )
            {
            // InternalHDLParser.g:553:1: ( Is )
            // InternalHDLParser.g:554:2: Is
            {
             before(grammarAccess.getArch_declAccess().getIsKeyword_4()); 
            match(input,Is,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getIsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__4__Impl"


    // $ANTLR start "rule__Arch_decl__Group__5"
    // InternalHDLParser.g:563:1: rule__Arch_decl__Group__5 : rule__Arch_decl__Group__5__Impl rule__Arch_decl__Group__6 ;
    public final void rule__Arch_decl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:567:1: ( rule__Arch_decl__Group__5__Impl rule__Arch_decl__Group__6 )
            // InternalHDLParser.g:568:2: rule__Arch_decl__Group__5__Impl rule__Arch_decl__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Arch_decl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__5"


    // $ANTLR start "rule__Arch_decl__Group__5__Impl"
    // InternalHDLParser.g:575:1: rule__Arch_decl__Group__5__Impl : ( ( rule__Arch_decl__SignalDeclsAssignment_5 )* ) ;
    public final void rule__Arch_decl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:579:1: ( ( ( rule__Arch_decl__SignalDeclsAssignment_5 )* ) )
            // InternalHDLParser.g:580:1: ( ( rule__Arch_decl__SignalDeclsAssignment_5 )* )
            {
            // InternalHDLParser.g:580:1: ( ( rule__Arch_decl__SignalDeclsAssignment_5 )* )
            // InternalHDLParser.g:581:2: ( rule__Arch_decl__SignalDeclsAssignment_5 )*
            {
             before(grammarAccess.getArch_declAccess().getSignalDeclsAssignment_5()); 
            // InternalHDLParser.g:582:2: ( rule__Arch_decl__SignalDeclsAssignment_5 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SIGNAL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHDLParser.g:582:3: rule__Arch_decl__SignalDeclsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Arch_decl__SignalDeclsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getArch_declAccess().getSignalDeclsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__5__Impl"


    // $ANTLR start "rule__Arch_decl__Group__6"
    // InternalHDLParser.g:590:1: rule__Arch_decl__Group__6 : rule__Arch_decl__Group__6__Impl rule__Arch_decl__Group__7 ;
    public final void rule__Arch_decl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:594:1: ( rule__Arch_decl__Group__6__Impl rule__Arch_decl__Group__7 )
            // InternalHDLParser.g:595:2: rule__Arch_decl__Group__6__Impl rule__Arch_decl__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Arch_decl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__6"


    // $ANTLR start "rule__Arch_decl__Group__6__Impl"
    // InternalHDLParser.g:602:1: rule__Arch_decl__Group__6__Impl : ( Begin ) ;
    public final void rule__Arch_decl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:606:1: ( ( Begin ) )
            // InternalHDLParser.g:607:1: ( Begin )
            {
            // InternalHDLParser.g:607:1: ( Begin )
            // InternalHDLParser.g:608:2: Begin
            {
             before(grammarAccess.getArch_declAccess().getBeginKeyword_6()); 
            match(input,Begin,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getBeginKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__6__Impl"


    // $ANTLR start "rule__Arch_decl__Group__7"
    // InternalHDLParser.g:617:1: rule__Arch_decl__Group__7 : rule__Arch_decl__Group__7__Impl rule__Arch_decl__Group__8 ;
    public final void rule__Arch_decl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:621:1: ( rule__Arch_decl__Group__7__Impl rule__Arch_decl__Group__8 )
            // InternalHDLParser.g:622:2: rule__Arch_decl__Group__7__Impl rule__Arch_decl__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Arch_decl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__7"


    // $ANTLR start "rule__Arch_decl__Group__7__Impl"
    // InternalHDLParser.g:629:1: rule__Arch_decl__Group__7__Impl : ( ( rule__Arch_decl__SignalAssignAssignment_7 )* ) ;
    public final void rule__Arch_decl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:633:1: ( ( ( rule__Arch_decl__SignalAssignAssignment_7 )* ) )
            // InternalHDLParser.g:634:1: ( ( rule__Arch_decl__SignalAssignAssignment_7 )* )
            {
            // InternalHDLParser.g:634:1: ( ( rule__Arch_decl__SignalAssignAssignment_7 )* )
            // InternalHDLParser.g:635:2: ( rule__Arch_decl__SignalAssignAssignment_7 )*
            {
             before(grammarAccess.getArch_declAccess().getSignalAssignAssignment_7()); 
            // InternalHDLParser.g:636:2: ( rule__Arch_decl__SignalAssignAssignment_7 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHDLParser.g:636:3: rule__Arch_decl__SignalAssignAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Arch_decl__SignalAssignAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getArch_declAccess().getSignalAssignAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__7__Impl"


    // $ANTLR start "rule__Arch_decl__Group__8"
    // InternalHDLParser.g:644:1: rule__Arch_decl__Group__8 : rule__Arch_decl__Group__8__Impl rule__Arch_decl__Group__9 ;
    public final void rule__Arch_decl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:648:1: ( rule__Arch_decl__Group__8__Impl rule__Arch_decl__Group__9 )
            // InternalHDLParser.g:649:2: rule__Arch_decl__Group__8__Impl rule__Arch_decl__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Arch_decl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__8"


    // $ANTLR start "rule__Arch_decl__Group__8__Impl"
    // InternalHDLParser.g:656:1: rule__Arch_decl__Group__8__Impl : ( End ) ;
    public final void rule__Arch_decl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:660:1: ( ( End ) )
            // InternalHDLParser.g:661:1: ( End )
            {
            // InternalHDLParser.g:661:1: ( End )
            // InternalHDLParser.g:662:2: End
            {
             before(grammarAccess.getArch_declAccess().getEndKeyword_8()); 
            match(input,End,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getEndKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__8__Impl"


    // $ANTLR start "rule__Arch_decl__Group__9"
    // InternalHDLParser.g:671:1: rule__Arch_decl__Group__9 : rule__Arch_decl__Group__9__Impl ;
    public final void rule__Arch_decl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:675:1: ( rule__Arch_decl__Group__9__Impl )
            // InternalHDLParser.g:676:2: rule__Arch_decl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arch_decl__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__9"


    // $ANTLR start "rule__Arch_decl__Group__9__Impl"
    // InternalHDLParser.g:682:1: rule__Arch_decl__Group__9__Impl : ( Semicolon ) ;
    public final void rule__Arch_decl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:686:1: ( ( Semicolon ) )
            // InternalHDLParser.g:687:1: ( Semicolon )
            {
            // InternalHDLParser.g:687:1: ( Semicolon )
            // InternalHDLParser.g:688:2: Semicolon
            {
             before(grammarAccess.getArch_declAccess().getSemicolonKeyword_9()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__Group__9__Impl"


    // $ANTLR start "rule__Signal_decl__Group__0"
    // InternalHDLParser.g:698:1: rule__Signal_decl__Group__0 : rule__Signal_decl__Group__0__Impl rule__Signal_decl__Group__1 ;
    public final void rule__Signal_decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:702:1: ( rule__Signal_decl__Group__0__Impl rule__Signal_decl__Group__1 )
            // InternalHDLParser.g:703:2: rule__Signal_decl__Group__0__Impl rule__Signal_decl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Signal_decl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal_decl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__0"


    // $ANTLR start "rule__Signal_decl__Group__0__Impl"
    // InternalHDLParser.g:710:1: rule__Signal_decl__Group__0__Impl : ( SIGNAL ) ;
    public final void rule__Signal_decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:714:1: ( ( SIGNAL ) )
            // InternalHDLParser.g:715:1: ( SIGNAL )
            {
            // InternalHDLParser.g:715:1: ( SIGNAL )
            // InternalHDLParser.g:716:2: SIGNAL
            {
             before(grammarAccess.getSignal_declAccess().getSIGNALKeyword_0()); 
            match(input,SIGNAL,FOLLOW_2); 
             after(grammarAccess.getSignal_declAccess().getSIGNALKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__0__Impl"


    // $ANTLR start "rule__Signal_decl__Group__1"
    // InternalHDLParser.g:725:1: rule__Signal_decl__Group__1 : rule__Signal_decl__Group__1__Impl rule__Signal_decl__Group__2 ;
    public final void rule__Signal_decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:729:1: ( rule__Signal_decl__Group__1__Impl rule__Signal_decl__Group__2 )
            // InternalHDLParser.g:730:2: rule__Signal_decl__Group__1__Impl rule__Signal_decl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Signal_decl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal_decl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__1"


    // $ANTLR start "rule__Signal_decl__Group__1__Impl"
    // InternalHDLParser.g:737:1: rule__Signal_decl__Group__1__Impl : ( ( rule__Signal_decl__NameAssignment_1 ) ) ;
    public final void rule__Signal_decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:741:1: ( ( ( rule__Signal_decl__NameAssignment_1 ) ) )
            // InternalHDLParser.g:742:1: ( ( rule__Signal_decl__NameAssignment_1 ) )
            {
            // InternalHDLParser.g:742:1: ( ( rule__Signal_decl__NameAssignment_1 ) )
            // InternalHDLParser.g:743:2: ( rule__Signal_decl__NameAssignment_1 )
            {
             before(grammarAccess.getSignal_declAccess().getNameAssignment_1()); 
            // InternalHDLParser.g:744:2: ( rule__Signal_decl__NameAssignment_1 )
            // InternalHDLParser.g:744:3: rule__Signal_decl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signal_decl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignal_declAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__1__Impl"


    // $ANTLR start "rule__Signal_decl__Group__2"
    // InternalHDLParser.g:752:1: rule__Signal_decl__Group__2 : rule__Signal_decl__Group__2__Impl rule__Signal_decl__Group__3 ;
    public final void rule__Signal_decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:756:1: ( rule__Signal_decl__Group__2__Impl rule__Signal_decl__Group__3 )
            // InternalHDLParser.g:757:2: rule__Signal_decl__Group__2__Impl rule__Signal_decl__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Signal_decl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal_decl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__2"


    // $ANTLR start "rule__Signal_decl__Group__2__Impl"
    // InternalHDLParser.g:764:1: rule__Signal_decl__Group__2__Impl : ( Colon ) ;
    public final void rule__Signal_decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:768:1: ( ( Colon ) )
            // InternalHDLParser.g:769:1: ( Colon )
            {
            // InternalHDLParser.g:769:1: ( Colon )
            // InternalHDLParser.g:770:2: Colon
            {
             before(grammarAccess.getSignal_declAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getSignal_declAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__2__Impl"


    // $ANTLR start "rule__Signal_decl__Group__3"
    // InternalHDLParser.g:779:1: rule__Signal_decl__Group__3 : rule__Signal_decl__Group__3__Impl rule__Signal_decl__Group__4 ;
    public final void rule__Signal_decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:783:1: ( rule__Signal_decl__Group__3__Impl rule__Signal_decl__Group__4 )
            // InternalHDLParser.g:784:2: rule__Signal_decl__Group__3__Impl rule__Signal_decl__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Signal_decl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal_decl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__3"


    // $ANTLR start "rule__Signal_decl__Group__3__Impl"
    // InternalHDLParser.g:791:1: rule__Signal_decl__Group__3__Impl : ( ( rule__Signal_decl__SignalTypeAssignment_3 ) ) ;
    public final void rule__Signal_decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:795:1: ( ( ( rule__Signal_decl__SignalTypeAssignment_3 ) ) )
            // InternalHDLParser.g:796:1: ( ( rule__Signal_decl__SignalTypeAssignment_3 ) )
            {
            // InternalHDLParser.g:796:1: ( ( rule__Signal_decl__SignalTypeAssignment_3 ) )
            // InternalHDLParser.g:797:2: ( rule__Signal_decl__SignalTypeAssignment_3 )
            {
             before(grammarAccess.getSignal_declAccess().getSignalTypeAssignment_3()); 
            // InternalHDLParser.g:798:2: ( rule__Signal_decl__SignalTypeAssignment_3 )
            // InternalHDLParser.g:798:3: rule__Signal_decl__SignalTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Signal_decl__SignalTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSignal_declAccess().getSignalTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__3__Impl"


    // $ANTLR start "rule__Signal_decl__Group__4"
    // InternalHDLParser.g:806:1: rule__Signal_decl__Group__4 : rule__Signal_decl__Group__4__Impl ;
    public final void rule__Signal_decl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:810:1: ( rule__Signal_decl__Group__4__Impl )
            // InternalHDLParser.g:811:2: rule__Signal_decl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal_decl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__4"


    // $ANTLR start "rule__Signal_decl__Group__4__Impl"
    // InternalHDLParser.g:817:1: rule__Signal_decl__Group__4__Impl : ( Semicolon ) ;
    public final void rule__Signal_decl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:821:1: ( ( Semicolon ) )
            // InternalHDLParser.g:822:1: ( Semicolon )
            {
            // InternalHDLParser.g:822:1: ( Semicolon )
            // InternalHDLParser.g:823:2: Semicolon
            {
             before(grammarAccess.getSignal_declAccess().getSemicolonKeyword_4()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getSignal_declAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__Group__4__Impl"


    // $ANTLR start "rule__Signal_assign__Group__0"
    // InternalHDLParser.g:833:1: rule__Signal_assign__Group__0 : rule__Signal_assign__Group__0__Impl rule__Signal_assign__Group__1 ;
    public final void rule__Signal_assign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:837:1: ( rule__Signal_assign__Group__0__Impl rule__Signal_assign__Group__1 )
            // InternalHDLParser.g:838:2: rule__Signal_assign__Group__0__Impl rule__Signal_assign__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Signal_assign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal_assign__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__0"


    // $ANTLR start "rule__Signal_assign__Group__0__Impl"
    // InternalHDLParser.g:845:1: rule__Signal_assign__Group__0__Impl : ( ( rule__Signal_assign__LhsAssignment_0 ) ) ;
    public final void rule__Signal_assign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:849:1: ( ( ( rule__Signal_assign__LhsAssignment_0 ) ) )
            // InternalHDLParser.g:850:1: ( ( rule__Signal_assign__LhsAssignment_0 ) )
            {
            // InternalHDLParser.g:850:1: ( ( rule__Signal_assign__LhsAssignment_0 ) )
            // InternalHDLParser.g:851:2: ( rule__Signal_assign__LhsAssignment_0 )
            {
             before(grammarAccess.getSignal_assignAccess().getLhsAssignment_0()); 
            // InternalHDLParser.g:852:2: ( rule__Signal_assign__LhsAssignment_0 )
            // InternalHDLParser.g:852:3: rule__Signal_assign__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Signal_assign__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSignal_assignAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__0__Impl"


    // $ANTLR start "rule__Signal_assign__Group__1"
    // InternalHDLParser.g:860:1: rule__Signal_assign__Group__1 : rule__Signal_assign__Group__1__Impl rule__Signal_assign__Group__2 ;
    public final void rule__Signal_assign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:864:1: ( rule__Signal_assign__Group__1__Impl rule__Signal_assign__Group__2 )
            // InternalHDLParser.g:865:2: rule__Signal_assign__Group__1__Impl rule__Signal_assign__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Signal_assign__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal_assign__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__1"


    // $ANTLR start "rule__Signal_assign__Group__1__Impl"
    // InternalHDLParser.g:872:1: rule__Signal_assign__Group__1__Impl : ( LessThanSignEqualsSign ) ;
    public final void rule__Signal_assign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:876:1: ( ( LessThanSignEqualsSign ) )
            // InternalHDLParser.g:877:1: ( LessThanSignEqualsSign )
            {
            // InternalHDLParser.g:877:1: ( LessThanSignEqualsSign )
            // InternalHDLParser.g:878:2: LessThanSignEqualsSign
            {
             before(grammarAccess.getSignal_assignAccess().getLessThanSignEqualsSignKeyword_1()); 
            match(input,LessThanSignEqualsSign,FOLLOW_2); 
             after(grammarAccess.getSignal_assignAccess().getLessThanSignEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__1__Impl"


    // $ANTLR start "rule__Signal_assign__Group__2"
    // InternalHDLParser.g:887:1: rule__Signal_assign__Group__2 : rule__Signal_assign__Group__2__Impl rule__Signal_assign__Group__3 ;
    public final void rule__Signal_assign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:891:1: ( rule__Signal_assign__Group__2__Impl rule__Signal_assign__Group__3 )
            // InternalHDLParser.g:892:2: rule__Signal_assign__Group__2__Impl rule__Signal_assign__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Signal_assign__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal_assign__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__2"


    // $ANTLR start "rule__Signal_assign__Group__2__Impl"
    // InternalHDLParser.g:899:1: rule__Signal_assign__Group__2__Impl : ( ( rule__Signal_assign__RhsAssignment_2 ) ) ;
    public final void rule__Signal_assign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:903:1: ( ( ( rule__Signal_assign__RhsAssignment_2 ) ) )
            // InternalHDLParser.g:904:1: ( ( rule__Signal_assign__RhsAssignment_2 ) )
            {
            // InternalHDLParser.g:904:1: ( ( rule__Signal_assign__RhsAssignment_2 ) )
            // InternalHDLParser.g:905:2: ( rule__Signal_assign__RhsAssignment_2 )
            {
             before(grammarAccess.getSignal_assignAccess().getRhsAssignment_2()); 
            // InternalHDLParser.g:906:2: ( rule__Signal_assign__RhsAssignment_2 )
            // InternalHDLParser.g:906:3: rule__Signal_assign__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Signal_assign__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSignal_assignAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__2__Impl"


    // $ANTLR start "rule__Signal_assign__Group__3"
    // InternalHDLParser.g:914:1: rule__Signal_assign__Group__3 : rule__Signal_assign__Group__3__Impl ;
    public final void rule__Signal_assign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:918:1: ( rule__Signal_assign__Group__3__Impl )
            // InternalHDLParser.g:919:2: rule__Signal_assign__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal_assign__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__3"


    // $ANTLR start "rule__Signal_assign__Group__3__Impl"
    // InternalHDLParser.g:925:1: rule__Signal_assign__Group__3__Impl : ( Semicolon ) ;
    public final void rule__Signal_assign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:929:1: ( ( Semicolon ) )
            // InternalHDLParser.g:930:1: ( Semicolon )
            {
            // InternalHDLParser.g:930:1: ( Semicolon )
            // InternalHDLParser.g:931:2: Semicolon
            {
             before(grammarAccess.getSignal_assignAccess().getSemicolonKeyword_3()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getSignal_assignAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__Group__3__Impl"


    // $ANTLR start "rule__Model__EntityDeclAssignment_0"
    // InternalHDLParser.g:941:1: rule__Model__EntityDeclAssignment_0 : ( ruleentity_decl ) ;
    public final void rule__Model__EntityDeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:945:1: ( ( ruleentity_decl ) )
            // InternalHDLParser.g:946:2: ( ruleentity_decl )
            {
            // InternalHDLParser.g:946:2: ( ruleentity_decl )
            // InternalHDLParser.g:947:3: ruleentity_decl
            {
             before(grammarAccess.getModelAccess().getEntityDeclEntity_declParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleentity_decl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntityDeclEntity_declParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntityDeclAssignment_0"


    // $ANTLR start "rule__Model__ArchDeclAssignment_1"
    // InternalHDLParser.g:956:1: rule__Model__ArchDeclAssignment_1 : ( rulearch_decl ) ;
    public final void rule__Model__ArchDeclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:960:1: ( ( rulearch_decl ) )
            // InternalHDLParser.g:961:2: ( rulearch_decl )
            {
            // InternalHDLParser.g:961:2: ( rulearch_decl )
            // InternalHDLParser.g:962:3: rulearch_decl
            {
             before(grammarAccess.getModelAccess().getArchDeclArch_declParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulearch_decl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getArchDeclArch_declParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ArchDeclAssignment_1"


    // $ANTLR start "rule__Entity_decl__NameAssignment_1"
    // InternalHDLParser.g:971:1: rule__Entity_decl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity_decl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:975:1: ( ( RULE_ID ) )
            // InternalHDLParser.g:976:2: ( RULE_ID )
            {
            // InternalHDLParser.g:976:2: ( RULE_ID )
            // InternalHDLParser.g:977:3: RULE_ID
            {
             before(grammarAccess.getEntity_declAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntity_declAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity_decl__NameAssignment_1"


    // $ANTLR start "rule__Arch_decl__EntityIdAssignment_3"
    // InternalHDLParser.g:986:1: rule__Arch_decl__EntityIdAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Arch_decl__EntityIdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:990:1: ( ( ( RULE_ID ) ) )
            // InternalHDLParser.g:991:2: ( ( RULE_ID ) )
            {
            // InternalHDLParser.g:991:2: ( ( RULE_ID ) )
            // InternalHDLParser.g:992:3: ( RULE_ID )
            {
             before(grammarAccess.getArch_declAccess().getEntityIdPTEntityDeclCrossReference_3_0()); 
            // InternalHDLParser.g:993:3: ( RULE_ID )
            // InternalHDLParser.g:994:4: RULE_ID
            {
             before(grammarAccess.getArch_declAccess().getEntityIdPTEntityDeclIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArch_declAccess().getEntityIdPTEntityDeclIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getArch_declAccess().getEntityIdPTEntityDeclCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__EntityIdAssignment_3"


    // $ANTLR start "rule__Arch_decl__SignalDeclsAssignment_5"
    // InternalHDLParser.g:1005:1: rule__Arch_decl__SignalDeclsAssignment_5 : ( rulesignal_decl ) ;
    public final void rule__Arch_decl__SignalDeclsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1009:1: ( ( rulesignal_decl ) )
            // InternalHDLParser.g:1010:2: ( rulesignal_decl )
            {
            // InternalHDLParser.g:1010:2: ( rulesignal_decl )
            // InternalHDLParser.g:1011:3: rulesignal_decl
            {
             before(grammarAccess.getArch_declAccess().getSignalDeclsSignal_declParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulesignal_decl();

            state._fsp--;

             after(grammarAccess.getArch_declAccess().getSignalDeclsSignal_declParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__SignalDeclsAssignment_5"


    // $ANTLR start "rule__Arch_decl__SignalAssignAssignment_7"
    // InternalHDLParser.g:1020:1: rule__Arch_decl__SignalAssignAssignment_7 : ( rulesignal_assign ) ;
    public final void rule__Arch_decl__SignalAssignAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1024:1: ( ( rulesignal_assign ) )
            // InternalHDLParser.g:1025:2: ( rulesignal_assign )
            {
            // InternalHDLParser.g:1025:2: ( rulesignal_assign )
            // InternalHDLParser.g:1026:3: rulesignal_assign
            {
             before(grammarAccess.getArch_declAccess().getSignalAssignSignal_assignParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulesignal_assign();

            state._fsp--;

             after(grammarAccess.getArch_declAccess().getSignalAssignSignal_assignParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arch_decl__SignalAssignAssignment_7"


    // $ANTLR start "rule__Signal_decl__NameAssignment_1"
    // InternalHDLParser.g:1035:1: rule__Signal_decl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal_decl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1039:1: ( ( RULE_ID ) )
            // InternalHDLParser.g:1040:2: ( RULE_ID )
            {
            // InternalHDLParser.g:1040:2: ( RULE_ID )
            // InternalHDLParser.g:1041:3: RULE_ID
            {
             before(grammarAccess.getSignal_declAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignal_declAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__NameAssignment_1"


    // $ANTLR start "rule__Signal_decl__SignalTypeAssignment_3"
    // InternalHDLParser.g:1050:1: rule__Signal_decl__SignalTypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Signal_decl__SignalTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1054:1: ( ( RULE_ID ) )
            // InternalHDLParser.g:1055:2: ( RULE_ID )
            {
            // InternalHDLParser.g:1055:2: ( RULE_ID )
            // InternalHDLParser.g:1056:3: RULE_ID
            {
             before(grammarAccess.getSignal_declAccess().getSignalTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignal_declAccess().getSignalTypeIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_decl__SignalTypeAssignment_3"


    // $ANTLR start "rule__Signal_assign__LhsAssignment_0"
    // InternalHDLParser.g:1065:1: rule__Signal_assign__LhsAssignment_0 : ( rulelhs ) ;
    public final void rule__Signal_assign__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1069:1: ( ( rulelhs ) )
            // InternalHDLParser.g:1070:2: ( rulelhs )
            {
            // InternalHDLParser.g:1070:2: ( rulelhs )
            // InternalHDLParser.g:1071:3: rulelhs
            {
             before(grammarAccess.getSignal_assignAccess().getLhsLhsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulelhs();

            state._fsp--;

             after(grammarAccess.getSignal_assignAccess().getLhsLhsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__LhsAssignment_0"


    // $ANTLR start "rule__Signal_assign__RhsAssignment_2"
    // InternalHDLParser.g:1080:1: rule__Signal_assign__RhsAssignment_2 : ( rulerhs ) ;
    public final void rule__Signal_assign__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1084:1: ( ( rulerhs ) )
            // InternalHDLParser.g:1085:2: ( rulerhs )
            {
            // InternalHDLParser.g:1085:2: ( rulerhs )
            // InternalHDLParser.g:1086:3: rulerhs
            {
             before(grammarAccess.getSignal_assignAccess().getRhsRhsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulerhs();

            state._fsp--;

             after(grammarAccess.getSignal_assignAccess().getRhsRhsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal_assign__RhsAssignment_2"


    // $ANTLR start "rule__Lhs__IdAssignment"
    // InternalHDLParser.g:1095:1: rule__Lhs__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Lhs__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1099:1: ( ( ( RULE_ID ) ) )
            // InternalHDLParser.g:1100:2: ( ( RULE_ID ) )
            {
            // InternalHDLParser.g:1100:2: ( ( RULE_ID ) )
            // InternalHDLParser.g:1101:3: ( RULE_ID )
            {
             before(grammarAccess.getLhsAccess().getIdPTSignalDeclCrossReference_0()); 
            // InternalHDLParser.g:1102:3: ( RULE_ID )
            // InternalHDLParser.g:1103:4: RULE_ID
            {
             before(grammarAccess.getLhsAccess().getIdPTSignalDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLhsAccess().getIdPTSignalDeclIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getLhsAccess().getIdPTSignalDeclCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lhs__IdAssignment"


    // $ANTLR start "rule__Rhs__IdAssignment"
    // InternalHDLParser.g:1114:1: rule__Rhs__IdAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Rhs__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHDLParser.g:1118:1: ( ( ( RULE_ID ) ) )
            // InternalHDLParser.g:1119:2: ( ( RULE_ID ) )
            {
            // InternalHDLParser.g:1119:2: ( ( RULE_ID ) )
            // InternalHDLParser.g:1120:3: ( RULE_ID )
            {
             before(grammarAccess.getRhsAccess().getIdPTSignalDeclCrossReference_0()); 
            // InternalHDLParser.g:1121:3: ( RULE_ID )
            // InternalHDLParser.g:1122:4: RULE_ID
            {
             before(grammarAccess.getRhsAccess().getIdPTSignalDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRhsAccess().getIdPTSignalDeclIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRhsAccess().getIdPTSignalDeclCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rhs__IdAssignment"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});

}